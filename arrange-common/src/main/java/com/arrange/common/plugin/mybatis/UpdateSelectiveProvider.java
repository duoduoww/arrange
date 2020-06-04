package com.arrange.common.plugin.mybatis;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.mapperhelper.EntityHelper;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

import java.util.Iterator;
import java.util.Set;

/**
 * 自定义特殊插入方法的Provider
 *
 * @author szg.
 * @date 2019/01/24.
 */
public class UpdateSelectiveProvider extends MapperTemplate {

    public UpdateSelectiveProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    public String updateListSelective(MappedStatement ms) {
        Class<?> entityClass = this.getEntityClass(ms);
        String itemEntityName = "record";
        EntityColumn pkColumn = EntityHelper.getPKColumns(entityClass).iterator().next();
        String pkName = pkColumn.getColumn();
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE ");
        sql.append(SqlHelper.getDynamicTableName(entityClass, this.tableName(entityClass)));
        sql.append(" <set>");
        Set<EntityColumn> columnList = EntityHelper.getColumns(entityClass);
        Iterator iterator = columnList.iterator();

        while (iterator.hasNext()) {
            EntityColumn column = (EntityColumn) iterator.next();
            if (column.isUpdatable() && !column.isId()) {
                String staticMethod = "@" + MyBatisSqlHelper.class.getName() + "@isNonNull(list,'" + column.getProperty() + "')";
                sql.append(" <if test=\"").append(staticMethod).append("\">");
                sql.append(" <foreach collection=\"list\" item=\"").append(itemEntityName).append("\" open=\"").append("`").append(column.getColumn()).append("`").append(" = CASE ").append(pkName).append("\" separator=\"\" close=\"").append(" END, ").append("\">");
                sql.append(" WHEN ").append(" #{").append(itemEntityName).append(".").append(pkColumn.getProperty()).append("} ").append(" THEN ");
                sql.append("  <choose>");
                sql.append("  <when test=\"").append(itemEntityName).append(".").append(column.getProperty()).append(" != null\">");
                sql.append(" #{").append(itemEntityName).append(".").append(column.getProperty()).append("} ");
                sql.append("  </when>");
                sql.append("  <otherwise>");
                sql.append("`").append(column.getColumn()).append("`");
                sql.append("  </otherwise>");
                sql.append("  </choose>");
                sql.append(" </foreach>");
                sql.append(" </if>");
            }
        }

        sql.append(" </set>");
        sql.append(" <where>");
        sql.append(pkName);
        sql.append(" IN ");
        sql.append(" <foreach collection=\"list\" item=\"").append(itemEntityName).append("\" open=\"(\" separator=\",\" close=\")\">");
        sql.append(" #{").append(itemEntityName).append(".").append(pkColumn.getProperty()).append("} ");
        sql.append(" </foreach>");
        sql.append(" </where>");
        return sql.toString();
    }

}