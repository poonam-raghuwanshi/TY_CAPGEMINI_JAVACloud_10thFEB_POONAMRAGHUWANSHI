package com.capgemini.exception;

@SuppressWarnings("serial")
public class InvalidUsernameException extends RuntimeException {
	public InvalidUsernameException(String msg) {
		super(msg);
	}

}
