package com.zy.pms.dto;

/**
 * 通用返回对象
 * @author zy
 * @date 2019/4/19 15:44
 */
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    protected CommonResult(){}

    protected CommonResult(long code,String message,T data)
    {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    public static <T> CommonResult<T> success(T data,String message){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),message,data);
    }

    /**
     * 未授权返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> forbidden(T data){
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(),
                ResultCode.FORBIDDEN.getMessage(),data);
    }

    /**
     * 未登录返回结果
     * @return
     */
    public static <T> CommonResult<T> unauthorized(T data){
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(),
                ResultCode.UNAUTHORIZED.getMessage(),data);
    }
    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
