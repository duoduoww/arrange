package com.arrange.common.plugin.mybatis.mapper;

import com.arrange.common.plugin.mybatis.UpdateSelectiveProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * @author szg.
 * @date 2019/01/24.
 */
public interface UpdateListSelectiveMapper<T> {
    @UpdateProvider(type = UpdateSelectiveProvider.class, method = "dynamicSQL")
    int updateListSelective(@Param("list") List<T> list);
}
