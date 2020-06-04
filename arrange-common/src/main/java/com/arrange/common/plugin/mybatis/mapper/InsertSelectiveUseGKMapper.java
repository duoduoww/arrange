package com.arrange.common.plugin.mybatis.mapper;

import com.arrange.common.plugin.mybatis.InsertSelectiveProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;


/**
 * 插入非null列，并返回主键
 *
 * @author szg.
 * @date 2019/01/24.
 */
public interface InsertSelectiveUseGKMapper<T> {
    @Options(useGeneratedKeys = true)
    @InsertProvider(type = InsertSelectiveProvider.class, method = "dynamicSQL")
    int insertSelectiveUseGK(T record);
}
