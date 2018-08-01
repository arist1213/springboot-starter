package com.example.demo.model.vo;

import lombok.Data;

import java.util.List;

/**
 * created by yanming on 2018/8/1
 */
@Data
public class Blog {

    private Integer id;
    private String title;
    List<Post> posts;
}
