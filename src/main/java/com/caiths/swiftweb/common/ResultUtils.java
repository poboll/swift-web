package com.caiths.swiftweb.common;

/**
 * 返回工具类
 *
 * @author poboll
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data 数据
     * @return {@link BaseResponse}<{@link T}>
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 错误
     * 失败
     *
     * @param errorCode 错误代码
     * @return {@link BaseResponse}
     */
    public static BaseResponse error(Error errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 错误
     * 失败
     *
     * @param code    代码
     * @param message 消息
     * @return {@link BaseResponse}
     */
    public static BaseResponse error(int code, String message) {
        return new BaseResponse(code, null, message);
    }

    /**
     * 错误
     * 失败
     *
     * @param errorCode 错误代码
     * @param message   消息
     * @return {@link BaseResponse}
     */
    public static BaseResponse error(Error errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}
