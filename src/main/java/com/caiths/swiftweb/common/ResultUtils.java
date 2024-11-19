package com.caiths.swiftweb.common;

/**
 * 返回工具类，用于封装统一的响应格式
 *
 * @author poboll
 */
public class ResultUtils {

    /**
     * 返回一个成功的响应
     *
     * @param <T>   数据类型
     * @param data  返回的数据
     * @return 包含成功状态码、数据和消息的 {@link BaseResponse}
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 返回一个错误的响应
     *
     * @param <T>       数据类型
     * @param errorCode 错误代码对象，包含错误信息
     * @return 包含错误信息的 {@link BaseResponse}
     */
    public static <T> BaseResponse<T> error(Error errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 返回一个错误的响应
     *
     * @param <T>     数据类型
     * @param code    错误代码
     * @param message 错误信息
     * @return 包含错误代码和错误信息的 {@link BaseResponse}
     */
    public static <T> BaseResponse<T> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 返回一个带额外信息的错误响应
     *
     * @param <T>       数据类型
     * @param errorCode 错误代码对象，包含错误码
     * @param message   错误的具体描述
     * @return 包含错误码和描述信息的 {@link BaseResponse}
     */
    public static <T> BaseResponse<T> error(Error errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}