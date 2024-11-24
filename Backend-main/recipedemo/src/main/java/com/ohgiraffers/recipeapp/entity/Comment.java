package com.ohgiraffers.recipeapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {  // 댓글 테이블

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false) // 레시피와 연결
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false) // 작성자와 연결
    private Member author;

    @Column(nullable = false)
    private String content; // 댓글 내용
}
