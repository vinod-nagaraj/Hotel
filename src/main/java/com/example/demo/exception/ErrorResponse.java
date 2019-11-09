package com.example.demo.exception;

public class ErrorResponse {
	

	private String mesage;
	private Integer StatusCode;
	
	public String getMesage() {
		return mesage;
	}
	public void setMesage(String mesage) {
		this.mesage = mesage;
	}
	public Integer getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(Integer statusCode) {
		StatusCode = statusCode;
	}
	
	
}
