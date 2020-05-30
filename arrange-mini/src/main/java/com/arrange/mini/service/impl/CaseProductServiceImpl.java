package com.arrange.mini.service.impl;

import com.arrange.common.api.CommonResult;
import com.arrange.mini.domain.CaseProduct;
import com.arrange.mini.mapper.CaseProductMapper;
import com.arrange.mini.service.CaseProductService;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kzc
 */

@Service
public class CaseProductServiceImpl extends ServiceImpl<CaseProductMapper, CaseProduct> implements CaseProductService {

    @Autowired
    private CaseProductMapper caseProductMapper;

    @Override
    public CommonResult<Object> queryProductList( Integer companyId, String search, Integer pageNo, Integer pageSize) {
        Map<String, Object > result = new HashMap<>(2);
        Page<CaseProduct> page = new Page<CaseProduct>(pageNo,pageSize);
        List<CaseProduct> products = caseProductMapper.queryProductList(page, companyId,search);
        result.put("total",page.getTotal());
        result.put("productList",products);
        return CommonResult.success(result);
    }

    @Override
    public CaseProduct getProductInfo(Integer companyId, Integer id) {
        return caseProductMapper.getProductInfo(companyId, id);
    }

}
