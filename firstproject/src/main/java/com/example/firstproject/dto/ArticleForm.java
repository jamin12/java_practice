package com.example.firstproject.dto;

import com.example.firstproject.entitiy.Article;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
// @NoArgsConstructor
public class ArticleForm {

    private Long id;
    private String title;
    private String content;

    public Article toEntitiy() {
        return new Article(id, title, content);
    }
}
