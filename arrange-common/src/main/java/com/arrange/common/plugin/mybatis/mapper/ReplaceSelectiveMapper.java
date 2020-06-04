package com.arrange.common.plugin.mybatis.mapper;

import com.arrange.common.plugin.mybatis.InsertSelectiveProvider;
import org.apache.ibatis.annotations.InsertProvider;


/**
 * 替换非null列，并返回主键，如果不存在则插入
 *
 * @author szg.
 * @date 2019/01/24.
 */
public interface ReplaceSelectiveMapper<T> {
    @InsertProvider(type = InsertSelectiveProvider.class, method = "dynamicSQL")
    int replaceSelective(T record);
}
