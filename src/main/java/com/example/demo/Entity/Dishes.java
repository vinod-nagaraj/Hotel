package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dishes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String dishName;
	private Double dishPrice;
	private Integer dishCategoryId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public Double getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(Double dishPrice) {
		this.dishPrice = dishPrice;
	}

	public Integer getDishCategoryId() {
		return dishCategoryId;
	}

	public void setDishCategoryId(Integer dishCategoryId) {
		this.dishCategoryId = dishCategoryId;
	}

}
