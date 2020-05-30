package com.arrange.mini.controller;

import com.arrange.common.api.CommonResult;
import com.arrange.mini.domain.CaseGroup;
import com.arrange.mini.domain.CaseProduct;
import com.arrange.mini.dto.BaseCriteria;
import com.arrange.mini.service.CaseGroupService;
import com.arrange.mini.service.CaseProductService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

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
    @ApiImplicitParams({
            @ApiImplicitParam(name = "companyId",value = "公司id",required = true,paramType = "query"),
            @ApiImplicitParam(name = "search",value = "search",required = false,paramType = "query"),
            @ApiImplicitParam(name = "pageNo",value = "第几页",required = false,paramType = "query"),
            @ApiImplicitParam(name = "pageSize",value = "每页行数",required = false,paramType = "query")
    })
    @ResponseBody
    public CommonResult<Object> getProductList(@RequestParam Integer companyId,@RequestParam(value = "search",defaultValue = "") String search,@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,@RequestParam( value = "pageSize",defaultValue = "10") Integer pageSize){
        return caseProductService.queryProductList(companyId,search,pageNo,pageSize);
    }



    @ResponseBody
    @GetMapping("/saveProduct")
    @ApiOperation(value = "新增商品")
    public CommonResult<Object> saveProduct( @ApiIgnore BaseCriteria criteria){
        System.out.println("------------------------");
        System.out.println("------------------------");
        return CommonResult.failed();
    }

    @GetMapping("/getProductInfo")
    @ApiOperation(value = "商品详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "companyId",value = "公司id",required = true,paramType = "query"),
            @ApiImplicitParam(name = "id",value = "商品id",required = true,paramType = "query")
    })
    @ResponseBody
    public CommonResult<Object> getProductInfo(Integer companyId,Integer id){
        CaseProduct product = caseProductService.getProductInfo(companyId, id);
        return CommonResult.success(product);
    }
}
