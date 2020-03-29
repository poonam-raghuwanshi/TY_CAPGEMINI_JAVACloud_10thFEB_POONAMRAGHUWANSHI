package com.capgemini.exception;

@SuppressWarnings("serial")
public class InvalidPhoneException extends RuntimeException {
	public InvalidPhoneException(String msg) {
		super(msg);
	}

}
