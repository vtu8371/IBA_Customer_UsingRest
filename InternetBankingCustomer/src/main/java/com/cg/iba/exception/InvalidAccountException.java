package com.cg.iba.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidAccountException extends RuntimeException{
	
	public InvalidAccountException() {
		super();
	}
	
	public InvalidAccountException(String message) {
		super(message);
	}
	
	public InvalidAccountException(String message, Throwable clause) {
		super(message, clause);
	}
	
	public InvalidAccountException(Throwable clause) {
		super(clause);
	}

}
