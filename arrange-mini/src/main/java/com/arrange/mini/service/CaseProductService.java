package com.arrange.mini.service;

import com.arrange.common.api.CommonResult;
import com.arrange.mini.domain.CaseProduct;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * @author kzc
 */
public interface CaseProductService extends IService<CaseProduct> {

    CommonResult<Object> queryProductList(Integer companyId, String search, Integer pageNo, Integer pageSize);

    /**
     * 获取单个商品信息
     * @param companyId 公司id
     * @param id 商品id
     * @return 商品信息
     */
    CaseProduct getProductInfo(Integer companyId, Integer id);

}
