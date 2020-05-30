package com.arrangement.dao;

import com.arrangement.entity.CaseProductCollection;

public interface CaseProductCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CaseProductCollection record);

    int insertSelective(CaseProductCollection record);

    CaseProductCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CaseProductCollection record);

    int updateByPrimaryKey(CaseProductCollection record);
}