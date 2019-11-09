package com.example.demo.service;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.Entity.DishCategory;
import com.example.demo.Entity.Dishes;
import com.example.demo.dto.DishesAddingInput;
import com.example.demo.dto.ResponseDto;
import com.example.demo.exception.DishException;
import com.example.demo.repository.DishCategoryRepository;
import com.example.demo.repository.DishesRepository;

@RunWith(MockitoJUnitRunner.class)
public class DishServiceImplTest {

	@Mock
	DishesRepository dishesRepository;

	@Mock
	DishCategoryRepository dishCategoryRepository;

	@InjectMocks
	DishServiceImpl dishServiceImpl;

	@Before
	public void setUp() {

	}

	@Test
	public void addDish() throws DishException {

		DishesAddingInput dishesAddingInput = new DishesAddingInput();
		dishesAddingInput.setDishCategoryId(1);
		dishesAddingInput.setDishName("puri");
		dishesAddingInput.setDishPrice(10d);

		Dishes dishes = new Dishes();
		dishes.setDishCategoryId(1);
		dishes.setDishName("puri");
		dishes.setDishPrice(10d);
		dishes.setId(1);

		DishCategory dishesCatOptional = new DishCategory();
		dishesCatOptional.setDishCategoryId(1);
		dishesCatOptional.setDishCategoryName("VEG");
		

		Mockito.when(dishCategoryRepository.findById(dishesAddingInput.getDishCategoryId()))
				.thenReturn(Optional.of(dishesCatOptional));
		Mockito.when(dishesRepository.save(dishes)).thenReturn(dishes);

		ResponseDto actual = dishServiceImpl.addDish(dishesAddingInput);
		Assert.assertEquals(201, actual.getStatusCode().intValue());

	}

}
