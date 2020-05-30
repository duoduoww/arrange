package com.arrangement.dao;

import com.arrangement.entity.CaseSeriesLabel;

public interface CaseSeriesLabelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CaseSeriesLabel record);

    int insertSelective(CaseSeriesLabel record);

    CaseSeriesLabel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CaseSeriesLabel record);

    int updateByPrimaryKey(CaseSeriesLabel record);
}