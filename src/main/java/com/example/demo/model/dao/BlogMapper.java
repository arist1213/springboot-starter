package com.example.demo.model.dao;

import com.example.demo.model.vo.Blog;
import com.example.demo.model.vo.BlogDetails;

/**
 * created by yanming on 2018/8/1
 */
public interface BlogMapper {
    Blog selectBlog(Integer id);
    BlogDetails selectBlogDetails(Integer id);
}
