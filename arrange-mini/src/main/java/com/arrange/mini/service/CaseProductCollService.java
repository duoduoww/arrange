package com.arrange.mini.service;

import com.arrange.common.api.CommonResult;
import com.arrange.mini.domain.CaseProductCollection;
import com.baomidou.mybatisplus.service.IService;

/**
 * @author kzc
 */
public interface CaseProductCollService extends IService<CaseProductCollection> {

    CommonResult<String> insertColl(CaseProductCollection collection );

    CommonResult<String> cancelColl(Integer companyId, Integer customerId, Integer id, Integer productId);

    CommonResult<Object> getCustomerCollList(Integer companyId, Integer customerId, Integer pageNo, Integer pageSize);
}
