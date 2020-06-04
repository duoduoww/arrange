package com.arrange.common.plugin.mybatis;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.mapperhelper.EntityHelper;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

import java.util.Set;

/**
 * 自定义特殊插入方法的Provider
 *
 * @author szg.
 * @date 2019/01/24.
 */
public class InsertSelectiveProvider extends MapperTemplate {

    public InsertSelectiveProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    /**
     * 批量插入。字段列表以列表中第一个对象的非null字段为准。
     */
    public String insertListSelective(MappedStatement ms) {
        return insertOrReplaceList(ms, false);
    }

    /**
     * 批量替换。已存在则替换，不存在则插入，字段列表以列表中第一个对象的非null字段为准。
     */
    public String replaceListSelective(MappedStatement ms) {
        return insertOrReplaceList(ms, true);
    }

    private String insertOrReplaceList(MappedStatement ms, boolean isReplace) {
        final Class<?> entityClass = getEntityClass(ms);
        final String itemEntityName = "record";
        //开始拼sql
        StringBuilder sql = new StringBuilder();
        sql.append((isReplace ? "REPLACE" : "INSERT"));
        sql.append(" INTO ");
        sql.append(SqlHelper.getDynamicTableName(entityClass, tableName(entityClass)));
        sql.append(" ");
        sql.append(insertColumns(entityClass, isReplace));
        sql.append(" VALUES ");
        sql.append("<foreach collection=\"list\" item=\"").append(itemEntityName).append("\" separator=\",\" >");
        sql.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">");
        //获取全部列
        Set<EntityColumn> columnList = EntityHelper.getColumns(entityClass);
        for (EntityColumn column : columnList) {
            if (!column.isInsertable()) {
                continue;
            }
            if (isReplace && column.isId()) {
                sql.append(column.getColumnHolder(itemEntityName)).append(",");
            } else {
                String staticMethod = "@" + MyBatisSqlHelper.class.getName() + "@isNonNull(list,'" + column.getProperty() + "')";
                sql.append(" <if test=\"").append(staticMethod).append("\">");
                sql.append("  <choose>");
                sql.append("  <when test=\"").append(itemEntityName).append(".").append(column.getProperty()).append("!=null").append("\">");
                sql.append(column.getColumnHolder(itemEntityName)).append(",");
                sql.append("  </when>");
                sql.append("  <otherwise>DEFAULT,</otherwise>");
                sql.append("  </choose>");
                sql.append(" </if>");
            }
        }
        sql.append("</trim>");
        sql.append("</foreach>");
        return sql.toString();
    }

    private static String insertColumns(Class<?> entityClass, boolean isReplace) {
        StringBuilder sql = new StringBuilder();
        sql.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">");
        //获取全部列
        Set<EntityColumn> columnList = EntityHelper.getColumns(entityClass);
        for (EntityColumn column : columnList) {
            if (!column.isInsertable()) {
                continue;
            }
            if (isReplace && column.isId()) {
                sql.append("`").append(column.getColumn()).append("`,");
            } else {
                String staticMethod = "@" + MyBatisSqlHelper.class.getName() + "@isNonNull(list,'" + column.getProperty() + "')";
                sql.append(" <if test=\"").append(staticMethod).append("\">");
                sql.append("`").append(column.getColumn()).append("`,");
                sql.append(" </if>");
            }
        }
        sql.append("</trim>");
        return sql.toString();
    }

    /**
     * 插入非null列，并返回主键
     */
    public String insertSelectiveUseGK(MappedStatement ms) {
        final Class<?> entityClass = getEntityClass(ms);
        //开始拼sql
        StringBuilder sql = new StringBuilder();
        sql.append(SqlHelper.insertIntoTable(entityClass, tableName(entityClass)));
        sql.append(SqlHelper.insertColumns(entityClass, true, true, false));
        sql.append(SqlHelper.insertValuesColumns(entityClass, true, true, false));
        return sql.toString();
    }

    /**
     * 替换非null列，并返回主键，如果不存在则插入
     */
    public String replaceSelective(MappedStatement ms) {
        return replaceSelectiveUseGK(ms);
    }

    public String replaceSelectiveUseGK(MappedStatement ms) {
        final Class<?> entityClass = getEntityClass(ms);
        //开始拼sql
        StringBuilder sql = new StringBuilder();
        sql.append("REPLACE INTO ");
        sql.append(SqlHelper.getDynamicTableName(entityClass, tableName(entityClass)));
        sql.append(" ");
        sql.append(SqlHelper.insertColumns(entityClass, true, true, false));
        sql.append(SqlHelper.insertValuesColumns(entityClass, true, true, false));
        return sql.toString();
    }
}