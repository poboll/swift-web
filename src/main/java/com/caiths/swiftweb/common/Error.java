package com.caiths.swiftweb.common;

/**
 * 错误返回接口
 *
 * @author poboll
 * @version: 1.0
 * @description: 错误返回接口, 自定义错误枚举实现该接口即可
 */
public interface Error {

    /**
     * 错误代码
     *
     * @return int
     */
    int getCode();

    /**
     * 错误描述
     *
     * @return {@link String}
     */
    String getMessage();
}