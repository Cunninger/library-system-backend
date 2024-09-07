package cn.yam.exception;

import cn.yam.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能：
 * 日期：2024/8/14 下午4:16
 */
@ControllerAdvice// 全局异常处理  用于处理异常的类加上这个注解
public class GlobalException {

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result serviceExceptionHandler(ServiceException e) {
        return Result.error(e.getCode(), e.getMessage());
    }

}