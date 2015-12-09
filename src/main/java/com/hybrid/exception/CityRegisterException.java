package com.hybrid.exception;

@SuppressWarnings("serial")
public class CityRegisterException extends RuntimeException{
	
	public CityRegisterException() {
		super();
	}
	
	public CityRegisterException(String msg) {
		super(msg);
	}
}
