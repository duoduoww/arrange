package com.arrangement.dao;

import com.arrangement.entity.CaseSeries;

public interface CaseSeriesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CaseSeries record);

    int insertSelective(CaseSeries record);

    CaseSeries selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CaseSeries record);

    int updateByPrimaryKey(CaseSeries record);
}