package com.caiths.swiftweb.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 *
 * @param <T> 响应数据的类型，通常用于返回具体的数据对象
 * @author poboll
 * @version: 1.0
 * 该类是通用的响应返回类，包含响应码、响应数据和响应消息。
 */
@Data
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 4887078045405290846L;

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(Error errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}