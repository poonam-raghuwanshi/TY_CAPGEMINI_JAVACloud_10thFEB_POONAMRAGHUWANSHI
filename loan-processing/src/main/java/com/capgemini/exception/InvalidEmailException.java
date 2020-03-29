package com.capgemini.exception;

@SuppressWarnings("serial")
public class InvalidEmailException extends RuntimeException{
	public InvalidEmailException(String msg){
		super(msg);
	}
}
