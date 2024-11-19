package com.caiths.swiftweb.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 *
 * @param <T>
 * @author poboll
 * @version: 1.0
 * @description: 基反应
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

    public BaseResponse(Error errorCode) { this(errorCode.getCode(), null, errorCode.getMessage());
    }
}