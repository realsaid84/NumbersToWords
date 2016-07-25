package com.converter.exception;

public class NumbersConverterException extends IllegalArgumentException {

	
	private static final long serialVersionUID = 1L;

	/**
	 * This exception is meant to be thrown when a number outside the valid range is entered.
	 * @param string Exception Message
	 */
	public NumbersConverterException(String string) {
		super(string);
	}

}
