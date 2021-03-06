package com.arrange.common.exception;

import com.arrange.common.api.CommonResult;
import com.arrange.common.api.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.BindException;


/**
 * @author kzc
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResult<Object> defaultErrorHandler(HttpServletRequest req, ExceptionHandler e) throws Exception {

        if(e instanceof  org.springframework.web.servlet.NoHandlerFoundException)
        {
            return CommonResult.validateFailed();
        }else if(e instanceof BindException){
            return CommonResult.failed(ResultCode.PARAMETER_ERR);
        }
        return CommonResult.failed();
    }
}
