package com.arrange.mini.mapper;

import com.arrange.mini.domain.CaseGroup;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kzc
 */
@Mapper
public interface CaseGroupMapper extends BaseMapper<CaseGroup> {

}