package com.hybrid.exception;

@SuppressWarnings("serial")
public class LoginFailException extends RuntimeException{
	
	public LoginFailException() {
		super();
	}
	
	public LoginFailException(String msg) {
		super(msg);
	}
}
