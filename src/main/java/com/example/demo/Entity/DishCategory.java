package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DishCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dishCategoryId;
	private String dishCategoryName;

	public Integer getDishCategoryId() {
		return dishCategoryId;
	}

	public void setDishCategoryId(Integer dishCategoryId) {
		this.dishCategoryId = dishCategoryId;
	}

	public String dishesCatOptional() {
		return dishCategoryName;
	}

	public void setDishCategoryName(String dishCategoryName) {
		this.dishCategoryName = dishCategoryName;
	}

}
