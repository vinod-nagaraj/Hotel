package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.DishCategory;
import com.example.demo.Entity.Dishes;
import com.example.demo.dto.DishesAddingInput;
import com.example.demo.dto.ResponseDto;
import com.example.demo.exception.DishException;
import com.example.demo.repository.DishCategoryRepository;
import com.example.demo.repository.DishesRepository;

@Service
public class DishServiceImpl implements DishService {

	@Autowired
	DishesRepository dishesRepository;
	
	@Autowired 
	DishCategoryRepository dishCategoryRepository;

	@Override
	public ResponseDto addDish(DishesAddingInput dishesAddingInput) throws DishException {
		
		/* procedure1*/
//		Integer dishId = dishesAddingInput.getDishCategoryId();
//		dishCategoryRepository.findById(dishId);
		
		/* procedure2*/
		Optional<DishCategory> dishesCatOptional = dishCategoryRepository.findById(dishesAddingInput.getDishCategoryId());
		if(!dishesCatOptional.isPresent())
		throw new DishException("dish category not found");
		

		Dishes dishes = new Dishes();
		
	

		/* first procedure */
//		Integer catId = dishesAddingInput.getDishCategoryId();
//		dishes.setDishCategoryId(catId);

		/* second procedure */

//		dishes.setDishCategoryId(dishesAddingInput.getDishCategoryId());
//		dishes.setDishName(dishesAddingInput.getDishName());
//		dishes.setDishPrice(dishesAddingInput.getDishPrice());

		/* third procedure */
		BeanUtils.copyProperties(dishesAddingInput, dishes);

		dishesRepository.save(dishes);
		
		ResponseDto responseDto=new ResponseDto();
		responseDto.setMesage("dishes added succsessfully");
		responseDto.setStatusCode(HttpStatus.CREATED.value());
		
		return  responseDto;

	}

}
