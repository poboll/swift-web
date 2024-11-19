package com.caiths.swiftweb.common;

/**
 * 错误返回接口，定义了错误码和错误信息。
 * 自定义错误枚举实现该接口即可。
 *
 * @author poboll
 * @version: 1.0
 */
public interface Error {

    /**
     * 获取错误代码
     *
     * @return 错误代码
     */
    int getCode();

    /**
     * 获取错误描述
     *
     * @return 错误信息
     */
    String getMessage();
}