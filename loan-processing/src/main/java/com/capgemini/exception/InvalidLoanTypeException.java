package com.capgemini.exception;

@SuppressWarnings("serial")
public class InvalidLoanTypeException extends RuntimeException {
	public InvalidLoanTypeException(String msg) {
		super(msg);
	}
}
