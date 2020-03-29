package com.capgemini.exception;

@SuppressWarnings("serial")
public class InvalidDateFormatException extends RuntimeException{
	public InvalidDateFormatException(String msg) {
		super(msg);
	}

}
