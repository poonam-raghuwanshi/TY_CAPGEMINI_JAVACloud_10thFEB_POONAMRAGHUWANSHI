package com.capgemini.exception;

@SuppressWarnings("serial")
public class ClientNotExistException extends RuntimeException{
	public ClientNotExistException(String msg) {
		super(msg);
	}
}
