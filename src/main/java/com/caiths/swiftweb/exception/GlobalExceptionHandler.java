package com.caiths.swiftweb.exception;

import com.caiths.swiftweb.common.BaseResponse;
import com.caiths.swiftweb.common.ErrorCode;
import com.caiths.swiftweb.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器，用于捕获和处理应用程序中的各种异常。
 * <p>
 * 该类包含两个异常处理方法：
 * 1. 处理业务异常 {@link BusinessException}
 * 2. 处理运行时异常 {@link RuntimeException}
 * </p>
 *
 * @author poboll
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 处理业务异常。
     * <p>
     * 该方法捕获 {@link BusinessException} 异常，并返回统一的错误响应。
     * </p>
     *
     * @param e {@link BusinessException} 异常对象
     * @return {@link BaseResponse} 包含错误信息的响应对象
     */
    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("业务异常: " + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    /**
     * 处理运行时异常。
     * <p>
     * 该方法捕获 {@link RuntimeException} 异常，并返回系统错误的统一响应。
     * </p>
     *
     * @param e {@link RuntimeException} 异常对象
     * @return {@link BaseResponse} 包含错误信息的响应对象
     */
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("运行时异常", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage());
    }
}