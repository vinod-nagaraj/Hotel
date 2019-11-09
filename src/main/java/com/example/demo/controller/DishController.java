package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DishesAddingInput;
import com.example.demo.dto.ResponseDto;
import com.example.demo.exception.DishException;
import com.example.demo.service.DishService;

@RestController
@RequestMapping("/abhiruchi")
public class DishController {

	@Autowired
	DishService dishService;

	@PostMapping("/dishes")
	public ResponseEntity<ResponseDto> addDish(@RequestBody DishesAddingInput dishesAddingInput) throws DishException {

		ResponseDto response = dishService.addDish(dishesAddingInput);

		return new ResponseEntity<>(response, HttpStatus.CREATED);

	}

}
