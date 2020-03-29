package com.capgemini.exception;

@SuppressWarnings("serial")
public class InvalidCredentialException extends RuntimeException {
	public InvalidCredentialException(String msg) {
		super(msg);
	}

}
