package com.example.demo.dto;

public class DishesAddingInput {

	private String dishName;
	private Double dishPrice;
	private Integer dishCategoryId;

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
