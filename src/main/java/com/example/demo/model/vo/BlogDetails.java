package com.example.demo.model.vo;

import lombok.Data;

import java.util.List;

/**
 * created by yanming on 2018/8/1
 */
@Data
public class BlogDetails {

    private Integer id;
    private String title;
    private Author author;
    private List<Post> posts;

}
