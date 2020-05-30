package com.arrangement.dao;

import com.arrangement.entity.CaseSeriesType;

public interface CaseSeriesTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CaseSeriesType record);

    int insertSelective(CaseSeriesType record);

    CaseSeriesType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CaseSeriesType record);

    int updateByPrimaryKey(CaseSeriesType record);
}