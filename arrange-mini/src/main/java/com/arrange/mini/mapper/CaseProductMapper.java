package com.arrange.mini.mapper;

import com.arrange.mini.domain.CaseProduct;
import com.arrange.mini.dto.BaseCriteria;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kzc
 */
@Mapper
public interface CaseProductMapper extends BaseMapper<CaseProduct> {

    /**
     * 获取商品列表
     * @param companyId 公司id
     * @param search 关键字
     * @return
     */
    List<CaseProduct> queryProductList(Pagination page, @Param("companyId") Integer companyId, @Param("search")  String search);

    CaseProduct getProductInfo(@Param("companyId") Integer companyId, @Param("id") Integer id);
}