package com.ohgiraffers.recipeapp.repository;

import com.ohgiraffers.recipeapp.entity.IngredientImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientImageRepository extends JpaRepository<IngredientImage, Long> {
    // UUID로 이미지 찾기
    IngredientImage findByUuid(String uuid);
}
