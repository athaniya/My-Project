package com.demo.exception;

public class ImageNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ImageNotFoundException(String message) {
		super(message);
	}

}
