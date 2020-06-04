package com.arrange.mini.mapper;

import com.arrange.mini.domain.CaseProduct;
import com.arrange.mini.dto.BaseCriteria;
import com.arrange.mini.dto.result.ProductResult;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kzc
 */
@Mapper
public interface CaseProductMapper extends BaseMapper<CaseProduct> {

    /**
     * 获取商品列表
     * @return
     */
    List<CaseProduct> queryProductList(Pagination page, BaseCriteria criteria);

    ProductResult getProductInfo(@Param("companyId") Integer companyId, @Param("id") Integer id);

    /**
     * 修改商品收藏数
     * @param companyId 公司id
     * @param id 商品id
     * @param coll 收藏数
     * @param type 1新增 / 2 减少
     * @return
     */
    int updateCollNum(@Param("companyId") Integer companyId, @Param("id") Integer id,@Param("coll") Integer coll,@Param("type") Integer type);
}