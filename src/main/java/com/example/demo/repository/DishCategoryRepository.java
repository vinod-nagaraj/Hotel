package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.DishCategory;

@Repository
public interface DishCategoryRepository extends JpaRepository<DishCategory, Integer> {

}
