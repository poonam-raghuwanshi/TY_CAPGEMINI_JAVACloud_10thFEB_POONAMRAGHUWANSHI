package com.capgemini.exception;

@SuppressWarnings("serial")
public class DateLimitException extends RuntimeException {
	public DateLimitException(String msg) {
		super(msg);
	}
}
