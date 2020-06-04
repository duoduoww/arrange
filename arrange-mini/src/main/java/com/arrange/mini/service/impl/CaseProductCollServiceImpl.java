package com.arrange.mini.service.impl;

import com.arrange.common.api.CommonResult;
import com.arrange.mini.domain.CaseProduct;
import com.arrange.mini.domain.CaseProductCollection;
import com.arrange.mini.dto.result.ProductCollResult;
import com.arrange.mini.mapper.CaseProductCollectionMapper;
import com.arrange.mini.mapper.CaseProductMapper;
import com.arrange.mini.service.CaseProductCollService;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kzc
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CaseProductCollServiceImpl extends ServiceImpl<CaseProductCollectionMapper, CaseProductCollection>
        implements CaseProductCollService {

    private final CaseProductCollectionMapper collectionMapper;

    private final CaseProductMapper productMapper;

    public CaseProductCollServiceImpl(CaseProductCollectionMapper collectionMapper, CaseProductMapper productMapper) {
        this.collectionMapper = collectionMapper;
        this.productMapper = productMapper;
    }

    @Override
    public CommonResult<String> insertColl(CaseProductCollection collection) {
        int check = collectionMapper.checkColl(collection.getProductId(),collection.getCustomerId());
        if(check > 0){
            return CommonResult.failed("该商品已被收藏");
        }
        int cont = productMapper.updateCollNum(collection.getCompanyId(),collection.getProductId(),1,1);
        if(cont > 0){
            collectionMapper.insertAllColumn(collection);
            return CommonResult.success("收藏成功");
        }
       return CommonResult.failed("收藏失败！商品信息可能错误");
    }

    @Override
    public CommonResult<String> cancelColl(Integer companyId, Integer customerId, Integer id, Integer productId) {
        int cont = productMapper.updateCollNum(companyId,productId,1,2);
        if(cont > 0){
            collectionMapper.updateCancel(id,customerId);
            return CommonResult.success("已取消收藏");
        }
        return CommonResult.success("取消收藏失败");
    }

    @Override
    public CommonResult<Object> getCustomerCollList(Integer companyId, Integer customerId, Integer pageNo, Integer pageSize) {
        Map<String, Object> result = new HashMap<>(2);
        Page<CaseProduct> page = new Page<>(pageNo, pageSize);
        List<ProductCollResult> customerCollList = collectionMapper.getCustomerCollList(page, companyId,customerId);
        result.put("total",page.getTotal());
        result.put("customerCollList", customerCollList);
        return CommonResult.success(result);
    }
}
