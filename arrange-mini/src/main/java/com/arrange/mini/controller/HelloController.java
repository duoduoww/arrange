package com.arrange.mini.controller;

import com.arrange.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kzc
 */
@Slf4j
@RestController
@Api(tags = "你好")
public class HelloController {

    @GetMapping("/hell")
    @ApiOperation(value = "打招呼")
    @ApiImplicitParam(name = "hello", value = "打招呼",required = true,paramType = "query")
    public CommonResult hello(@RequestParam String hello){
        return CommonResult.success(hello);
    }

}
