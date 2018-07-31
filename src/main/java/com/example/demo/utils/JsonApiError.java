package com.example.demo.utils;

/**
 * created by yanming on 2018/7/31
 */
public enum JsonApiError {
    PARAMETER_INVALID(400001, "参数错误"),
    SYSTEM_ERROR(400000, "参数错误");

    private Integer code;
    private String msg;

    JsonApiError(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "{code:"+this.getCode()+", msg:"+this.getMsg()+"}";
    }
}
