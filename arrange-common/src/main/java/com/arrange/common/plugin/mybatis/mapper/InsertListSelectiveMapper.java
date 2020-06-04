package com.arrange.common.plugin.mybatis.mapper;

import com.arrange.common.plugin.mybatis.InsertSelectiveProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 批量插入，根据列表第一个实体非null的值来确定插入哪些列。
 *
 * @author szg.
 * @date 2019/01/24.
 */
public interface InsertListSelectiveMapper<T> {
    @Options(useGeneratedKeys = true)
    @InsertProvider(type = InsertSelectiveProvider.class, method = "dynamicSQL")
    int insertListSelective(@Param("list") List<T> list);
}
