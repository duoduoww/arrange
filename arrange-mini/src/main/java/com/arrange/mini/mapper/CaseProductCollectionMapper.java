package com.arrange.mini.mapper;


import com.arrange.mini.domain.CaseProductCollection;
import com.arrange.mini.dto.result.ProductCollResult;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kzc
 */
public interface CaseProductCollectionMapper extends BaseMapper<CaseProductCollection>{

    /**
     *检查这个客户是否已收藏过次商品
     * @param productId 商品id
     * @param customerId 客户id
     * @return 是否收藏
     */
    int checkColl(@Param("productId") Integer productId, @Param("customerId") Integer customerId);

    /**
     *
     * @param id 收藏id
     * @param customerId 客户id
     * @return 取消收藏
     */
    int updateCancel(@Param("id")Integer id,@Param("customerId") Integer customerId);

    List<ProductCollResult> getCustomerCollList(Pagination page, @Param("companyId") Integer companyId, @Param("customerId")Integer customerId);
}