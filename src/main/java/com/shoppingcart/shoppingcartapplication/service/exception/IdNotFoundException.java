package com.shoppingcart.shoppingcartapplication.service.exception;

public class IdNotFoundException extends RuntimeException {

	private final String message;

	@Override
	public String getMessage() {
		return message;
	}

	public IdNotFoundException(String message) {
		super();
		this.message = message;
	}

	public IdNotFoundException() {
		super();
		this.message = "Id Not Found";
	}

}