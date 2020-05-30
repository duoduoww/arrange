package com.arrangement.dao;

import com.arrangement.entity.CaseGroup;

public interface CaseGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CaseGroup record);

    int insertSelective(CaseGroup record);

    CaseGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CaseGroup record);

    int updateByPrimaryKey(CaseGroup record);
}