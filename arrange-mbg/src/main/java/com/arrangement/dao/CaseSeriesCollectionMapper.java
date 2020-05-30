package com.arrangement.dao;

import com.arrangement.entity.CaseSeriesCollection;

public interface CaseSeriesCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CaseSeriesCollection record);

    int insertSelective(CaseSeriesCollection record);

    CaseSeriesCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CaseSeriesCollection record);

    int updateByPrimaryKey(CaseSeriesCollection record);
}