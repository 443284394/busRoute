package com.wpg.bus.util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author leo
 * @since 2018/7/27 8:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public final class RestResult<T> {

    /**
     * 操作成功状态
     */
    public static final String OPT_SUCCESS_STATUS = "complete";

    /**
     * 操作失败状态
     */
    public static final String OPT_ERROR_STATUS = "error";

    /**
     * api执行结果状态：成功:complete 失败: error
     */
    private String status;

    /**
     * 错误代码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMessage;

    /**
     * 返回结果数据
     */
    private T resultData;

    public static <T> RestResult<T> success(T t) {
        return new RestResult<>("complete", null, null, t);
    }
    public static <T> RestResult<T> success(T t,String errorMessage) {
        return new RestResult<>("complete", null, errorMessage, t);
    }
    public static <T> RestResult<T> fail(String errorCode, String errorMessage) {
        return new RestResult<>("error", errorCode, errorMessage, null);
    }


    public boolean isSuccess() {
    	return OPT_SUCCESS_STATUS.equals(this.status);
    }
}
