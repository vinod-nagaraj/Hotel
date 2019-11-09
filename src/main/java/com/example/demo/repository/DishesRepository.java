package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Dishes;

@Repository
public interface DishesRepository extends JpaRepository<Dishes, Integer> {

}
