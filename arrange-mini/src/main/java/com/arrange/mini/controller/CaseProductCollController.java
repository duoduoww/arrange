package com.arrange.mini.controller;

import com.arrange.common.api.CommonResult;
import com.arrange.mini.domain.CaseProduct;
import com.arrange.mini.domain.CaseProductCollection;
import com.arrange.mini.service.CaseProductCollService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author kzc   商品收藏
 */
@RestController
@Slf4j
@Api(tags = "商品收藏管理")
@RequestMapping("/coll")
public class CaseProductCollController {

    private final CaseProductCollService productCollService;

    public CaseProductCollController(CaseProductCollService productCollService) {
        this.productCollService = productCollService;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "companyId",value = "公司id",required = true,paramType = "query"),
            @ApiImplicitParam(name = "customerId",value = "客户id",required = true,paramType = "query"),
            @ApiImplicitParam(name = "pageNo",value = "第几页",defaultValue = "1",paramType = "query"),
            @ApiImplicitParam(name = "pageSize",value = "每页行数",defaultValue = "10",paramType = "query")
    })
    public CommonResult<Object> getCustomerCollList(Integer companyId, Integer customerId, Integer pageNo, Integer pageSize){

        return productCollService.getCustomerCollList(companyId,customerId,pageNo,pageSize);

    }



    @PostMapping("/addProductColl")
    @ApiOperation(value = "新增商品收藏")
    @ResponseBody
    public CommonResult<String> addProductColl(@ModelAttribute CaseProductCollection collection){
        collection.setStatus(1);
        collection.setCreateTime(new Date());
        return productCollService.insertColl(collection);
    }

    @GetMapping("/cancelColl")
    @ApiOperation(value = "取消商品收藏")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "companyId",value = "公司id",required = true,paramType = "query"),
            @ApiImplicitParam(name = "customerId",value = "客户id",required = true,paramType = "query"),
            @ApiImplicitParam(name = "id",value = "收藏id",required = true,paramType = "query"),
            @ApiImplicitParam(name = "productId",value = "商品id",required = true,paramType = "query")
    })
    public CommonResult<String> cancelProduct(Integer companyId, Integer customerId, Integer id, Integer productId){
        return productCollService.cancelColl(companyId,customerId,id,productId);
    }
}
