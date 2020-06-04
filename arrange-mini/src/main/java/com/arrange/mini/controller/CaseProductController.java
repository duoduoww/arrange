package com.arrange.mini.controller;

import com.arrange.common.api.CommonResult;
import com.arrange.mini.domain.CaseGroup;
import com.arrange.mini.dto.BaseCriteria;
import com.arrange.mini.dto.result.ProductResult;
import com.arrange.mini.service.CaseGroupService;
import com.arrange.mini.service.CaseProductService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kzc
 */

@RestController
@Slf4j
@Api(tags = "商品管理")
@RequestMapping("/product")
public class CaseProductController {

    private final CaseGroupService caseGroupService;

    private final CaseProductService caseProductService;

    public CaseProductController(CaseGroupService caseGroupService, CaseProductService caseProductService ) {
        this.caseGroupService = caseGroupService;
        this.caseProductService = caseProductService;
    }

    @GetMapping("/getGroupList")
    @ApiOperation(value = "商品分组列表")
    @ApiImplicitParam(name = "companyId", value = "公司id",required = true,paramType = "query")
    @ResponseBody
    public CommonResult<List<CaseGroup>> getGroupList(@RequestParam Integer companyId){
        EntityWrapper<CaseGroup> ew = new EntityWrapper<>();
        ew.eq("company_id",companyId).eq("status", 0);
        List<CaseGroup> advertiseList = caseGroupService.selectList(ew);
        return CommonResult.success(advertiseList);
    }

    @GetMapping("/getProductList")
    @ApiOperation(value = "商品列表")
    @ResponseBody
    public CommonResult<Object> getProductList(@ModelAttribute BaseCriteria criteria){
        return caseProductService.queryProductList(criteria);
    }

    @GetMapping("/getProductInfo")
    @ApiOperation(value = "商品详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "companyId",value = "公司id",required = true,paramType = "query"),
            @ApiImplicitParam(name = "id",value = "商品id",required = true,paramType = "query"),
            @ApiImplicitParam(name = "customerId",value = "客户id",paramType = "query")
    })
    @ResponseBody
    public CommonResult<Object> getProductInfo(Integer companyId,Integer id,Integer customerId){
        ProductResult product = caseProductService.getProductInfo(companyId, id, customerId);
        return CommonResult.success(product);
    }
}
