package com.ohgiraffers.recipeapp.repository;

import com.ohgiraffers.recipeapp.entity.NoticeImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeImageRepository extends JpaRepository<NoticeImage, Long> {
    // UUID로 이미지 찾기
    NoticeImage findByUuid(String uuid);
}
