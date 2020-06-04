package com.arrange.common.plugin.mybatis;

import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.mapperhelper.EntityHelper;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

import java.lang.reflect.Method;
import java.util.List;

/**
 * sql拼接工具类
 * Created by szg on 2019/01/24.
 */
public class MyBatisSqlHelper extends SqlHelper {

    public static boolean isNonNull(List list, String propertyName) {
        Class<?> cls = list.get(0).getClass();
        EntityColumn entityColumn = EntityHelper.getColumns(cls).stream().filter(e -> e.getProperty().equals(propertyName)).findFirst().orElse(null);
        if (entityColumn == null) {
            return false;
        }
        for (Object o : list) {
            try {
                Method method = cls.getMethod("get" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1));
                Object value = method.invoke(o);
                if (value != null) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
