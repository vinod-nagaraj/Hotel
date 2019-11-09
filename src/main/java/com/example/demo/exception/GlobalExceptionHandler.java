package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(StockException.class)
	public ResponseEntity<ErrorResponse> lmsExceptionHandler(StockException ex, WebRequest request) {

		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMesage(ex.getMessage());
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

	}
	
	
	@ExceptionHandler(DishException.class)
	public ResponseEntity<ErrorResponse> DishExceptionControl(DishException de, WebRequest request) {
		
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMesage(de.getMessage());
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
		
	}
	
	
	
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> lmsExceptionHandler(HttpStatusCodeException ex, WebRequest request) {

		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.hashCode());
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);


	}

	

}