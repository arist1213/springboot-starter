package com.example.demo.api;

import com.example.demo.utils.JsonApiError;
import com.example.demo.utils.JsonApiResult;
import org.springframework.stereotype.Controller;

/**
 * created by yanming on 2018/7/31
 */
@Controller
public class BaseController {
    protected JsonApiResult jsonSuccess(Object o) {
        return new JsonApiResult.BuilderJsonResult()
                .errorCode(0)
                .errorMessage(null)
                .data(o).builder();
    }

    protected JsonApiResult jsonFail(Integer error, String msg) {
        return new JsonApiResult.BuilderJsonResult()
                .errorCode(error)
                .errorMessage(msg)
                .data(null)
                .builder();
    }

    protected JsonApiResult jsonFail(JsonApiError error) {
        return new JsonApiResult.BuilderJsonResult()
                .errorCode(error.getCode())
                .errorMessage(error.getMsg())
                .data(null)
                .builder();
    }
}
