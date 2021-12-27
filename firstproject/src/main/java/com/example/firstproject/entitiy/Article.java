package com.example.firstproject.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // db가 해당 객체를 인식 가능
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Article {

    @Id // 대표 값을 지정
    @GeneratedValue
    private Long id;

    @Column
    private String title;
    @Column
    private String content;

}
