package com.zy.pms.dto;

import com.zy.pms.util.JsonUtil;

/**
 * @author zy
 * @date 2019/4/19 15:44
 */
public class CommonResult {
    //操作成功
    public static final int SUCCESS = 200;
    //操作失败
    public static final int FAILED = 500;
    //校验参数失败
    public static final int VALIDATE_FAILED = 404;
    //未认证
    public static final int UNAUTHORZED = 401;
    //未授权
    public static final int FORBIDDEN = 403;

    private int code;
    private String message;
    private Object data;

    /**
     * 普通成功返回
     * @param data 获取的数据
     * @return
     */
    public CommonResult success(Object data){
        this.code = SUCCESS;
        this.message = "操作成功,哈哈";
        this.data = data;
        return this;
    }

    /**
     * 普通失败返回
     * @param data 获取的数据
     * @return
     */
    public CommonResult failed(Object data){
        this.code = FAILED;
        this.message = "操作失败啦";

        return this;
    }

    /**
     * 参数验证失败
     * @param
     * @return
     */
    public CommonResult validateFailed(String message){
        this.code = VALIDATE_FAILED;
        this.message = message;
        return  this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JsonUtil.objectToJson(this);
    }
}
