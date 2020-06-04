package com.arrange.mini.service.impl;

import com.arrange.mini.service.CaseAdvertiseService;
import com.arrange.mini.mapper.CaseAdvertiseMapper;
import com.arrange.mini.domain.CaseAdvertise;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kzc
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CaseAdvertiseServiceImpl extends ServiceImpl<CaseAdvertiseMapper, CaseAdvertise> implements CaseAdvertiseService {
}
