package com.arrange.mini.service.impl;

import com.arrange.mini.domain.CaseGroup;
import com.arrange.mini.mapper.CaseGroupMapper;
import com.arrange.mini.service.CaseGroupService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kzc
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CaseGroupServiceImpl extends ServiceImpl<CaseGroupMapper, CaseGroup> implements CaseGroupService {
}
