package com.example.demo.model.vo;

import lombok.Data;

import java.util.List;

/**
 * created by yanming on 2018/8/1
 */
@Data
public class Post {
    private Integer id;
    private String subject;
    private String body;
    private Author author;
    private List<Comment> comments;
    private List<Tag> tags;
}
