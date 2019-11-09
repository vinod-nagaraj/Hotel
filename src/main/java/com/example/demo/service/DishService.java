package com.example.demo.service;

import com.example.demo.dto.DishesAddingInput;
import com.example.demo.dto.ResponseDto;
import com.example.demo.exception.DishException;

public interface DishService {
	
	public ResponseDto addDish(DishesAddingInput dishesAddingInput) throws DishException;
	

}
