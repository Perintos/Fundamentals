package com.pluralsight.exception;

public class ApplicationNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ApplicationNotFoundException(String exception) {
        super(exception);
    }
}
