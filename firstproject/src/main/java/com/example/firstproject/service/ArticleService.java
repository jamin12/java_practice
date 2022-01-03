package com.example.firstproject.service;

import java.util.List;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entitiy.Article;
import com.example.firstproject.repository.ArticleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service // 서비스 선언!(서비스 객체를 스프링부트에 생성 )
public class ArticleService {
    @Autowired // DI, 생성 객체를 가져와 연결
    private ArticleRepository articleRepository;

    public List<Article> index() {
        return articleRepository.findAll();
    }

    public Article show(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    public Article create(ArticleForm dto) {
        Article article = dto.toEntitiy();
        if(article.getId() != null){
            return null;
        }
        return articleRepository.save(article);
    }

    public Article update(Long id, ArticleForm dto) {
        // 1: 수정용 엔티티 생성
        Article article = dto.toEntitiy();
        log.info("id :{}, article {}",id,article.toString());
        
        // 2: 대상 엔티티 조회
        Article target = articleRepository.findById(id).orElse(null);
        
        // 3: 잘못된 요청 처리
        if(target == null || id != article.getId()){
            // 400 응답
            log.info("잘못된 요청! id :{}, article {}",id,article.toString());
            return null; 
        }
        target.patch(article);
        Article updated = articleRepository.save(target);
        return updated;
    }

    public Article delete(Long id) {
        // 1: 대상 찾기
        Article target = articleRepository.findById(id).orElse(null);
        // 잘못된 요청 처리
        if(target == null){
            return null;
        }
        // 2: 대상 삭제
        articleRepository.delete(target);
        // 3: 대상 반환
        return null;
    }

}
