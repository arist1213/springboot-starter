package com.example.demo.api;

import com.example.demo.model.dao.BlogMapper;
import com.example.demo.utils.JsonApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by yanming on 2018/8/1
 */
@Controller
@RequestMapping("/blog")
public class BlogController extends BaseController {
    @Autowired
    BlogMapper blogMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    private JsonApiResult getBlogById(@PathVariable Integer id) {
        return jsonSuccess(blogMapper.selectBlog(id));
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    private JsonApiResult getBlogDetail(@PathVariable Integer id) {
        return jsonSuccess(blogMapper.selectBlogDetails(id));
    }
}
