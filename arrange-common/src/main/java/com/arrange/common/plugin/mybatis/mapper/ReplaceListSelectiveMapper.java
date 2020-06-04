package com.arrange.common.plugin.mybatis.mapper;

import com.arrange.common.plugin.mybatis.InsertSelectiveProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 批量替换非null列(以列表第一个实体为准)，不存在的则插入。
 * Created by szg on 2019/01/24.
 */
public interface ReplaceListSelectiveMapper<T> {
    @Options(useGeneratedKeys = true)
    @InsertProvider(type = InsertSelectiveProvider.class, method = "dynamicSQL")
    int replaceListSelective(@Param("list") List<T> list);
}