package com.example.firstproject.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.firstproject.dto.FileDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 게시글 번호

    @ManyToOne // 해당 댓글 엔티티 여러개가, 하나의 Article에 연관된다!
    @JoinColumn(name = "article_id") // "articleid" 컬럼에 Article의 대표값을 저장
    private Article articleId;

    // 파일 이름
    @Column
    private String fileName;

    // 파일 저장 경로
    @Column
    private String filePath;

    // 파일 사이즈
    @Column
    private Integer fileSize;

    public static File cretaeFile(FileDto dto, Article article) {
        return new File(
                dto.getId(),
                article,
                dto.getFileName(),
                dto.getFilePath(),
                dto.getFileSize());
    }

}
