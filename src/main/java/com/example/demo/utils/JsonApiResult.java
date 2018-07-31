package com.example.demo.utils;

import com.google.gson.Gson;

import java.util.Date;
import java.util.HashMap;

/**
 * created by yanming on 2018/7/31
 */
public class JsonApiResult {

    private Integer errorCode = 0;
    private String errorMessage;
    private Object data;
    private Date time;

    public JsonApiResult(Integer code, String msg, Object data) {
        this.errorCode = code;
        this.errorMessage = msg;
        this.data = data;
        this.time = new Date();
    }

    @Override
    public String toString() {
        return "{errorCode:"+this.getErrorCode()+", errorMessage:"+this.getErrorMessage()+"}";
    }

    public Integer getErrorCode() { return this.errorCode; }
    public String getErrorMessage() { return this.errorMessage; }
    public Object getData() { return this.data; }
    public Date getTime() { return this.time; }

    public static class BuilderJsonResult {

        private Integer nestedErrorCode;
        private String nestedErrorMessage;
        private Object nestedData;

        public BuilderJsonResult errorCode(Integer code) {
            this.nestedErrorCode = code;
            return this;
        }

        public BuilderJsonResult errorMessage(String message) {
            this.nestedErrorMessage = message;
            return this;
        }

        public BuilderJsonResult data(Object object) {
            this.nestedData = object;
            return this;
        }

        public JsonApiResult builder() {
            return new JsonApiResult(this.nestedErrorCode, this.nestedErrorMessage, this.nestedData);
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> city = new HashMap<>();
        city.put("Kabul", "AFG");

        JsonApiResult result1 = new JsonApiResult.BuilderJsonResult()
                                    .errorCode(0)
                                    .errorMessage("hello,world")
                                    .data(city).builder();

        JsonApiResult result2 = new JsonApiResult.BuilderJsonResult()
                .errorCode(-1)
                .builder();

        Gson gson = new Gson();

        System.out.println(result1.toString());
        System.out.println(result2.toString());

        System.out.println(gson.toJson(result1));
        System.out.println(gson.toJson(result2));
    }
}


