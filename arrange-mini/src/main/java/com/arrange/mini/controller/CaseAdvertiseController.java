package com.arrange.mini.controller;

import com.arrange.common.api.CommonResult;
import com.arrange.mini.service.CaseAdvertiseService;
import com.arrange.mini.domain.CaseAdvertise;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kzc
 */
@Api(tags = "轮播图管理")
@RestController
@RequestMapping("/adv")
public class CaseAdvertiseController {

    private final CaseAdvertiseService caseAdvertiseService;

    public CaseAdvertiseController(CaseAdvertiseService caseAdvertiseService) {
        this.caseAdvertiseService = caseAdvertiseService;
    }

    @GetMapping("/getAdvList")
    @ApiOperation(value = "轮播图列表")
    @ApiImplicitParam(name = "companyId", value = "公司id",required = true,paramType = "query")
    public CommonResult<Object> getAdvList(@RequestParam Integer companyId){
        EntityWrapper<CaseAdvertise> ew = new EntityWrapper<>();
        ew.eq("company_id",companyId).eq("status", 1).orderBy("sort",false);
        List<CaseAdvertise> advertiseList = caseAdvertiseService.selectList(ew);
        return CommonResult.success(advertiseList);
    }
}
