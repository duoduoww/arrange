package com.arrange.mini.service;

import com.arrange.common.api.CommonResult;
import com.arrange.mini.domain.CaseProduct;
import com.arrange.mini.dto.BaseCriteria;
import com.arrange.mini.dto.result.ProductResult;
import com.baomidou.mybatisplus.service.IService;

/**
 * @author kzc
 */
public interface CaseProductService extends IService<CaseProduct> {

    CommonResult<Object> queryProductList(BaseCriteria criteria);

    /**
     * 获取单个商品信息
     * @param companyId 公司id
     * @param id 商品id
     * @return 商品信息
     */
    ProductResult getProductInfo(Integer companyId, Integer id, Integer customerId);

}
