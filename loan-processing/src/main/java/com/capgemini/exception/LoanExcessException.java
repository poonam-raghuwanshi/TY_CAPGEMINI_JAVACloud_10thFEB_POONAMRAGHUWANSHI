package com.capgemini.exception;

@SuppressWarnings("serial")
public class LoanExcessException extends RuntimeException {
	public LoanExcessException(String msg) {
		super(msg);
	}

}
