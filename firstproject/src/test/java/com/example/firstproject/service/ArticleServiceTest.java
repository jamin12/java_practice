package com.example.firstproject.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.firstproject.entitiy.Article;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // 해당 클래스는 스프링부트와 연동되어 테스팅 된다 
public class ArticleServiceTest {
    @Autowired
    ArticleService articleService;

    @Test
    void testIndex() {
        // 예상 
        Article a = new Article(1L,"qwer","1111");
        Article b = new Article(2L,"asdf","2222");
        Article c = new Article(3L,"zxcv","3333");
        List<Article> expected = new ArrayList<Article>(Arrays.asList(a,b,c));
        // 실제
        List<Article> articles = articleService.index();
        // 비교
        assertEquals(expected.toString(), articles.toString());
    }

    // @Test
    // void test_show(){
    //     //예상
    //     Article a = new Article(1L,"qwer","1111");
    //     //실제
    //     Article b = articleService.show(1);

    //     //비교
    // }

    @Test
    void test_show_fail(){

    }
}
