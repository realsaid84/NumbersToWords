package com.converter.api;

/**
 * A Library API that takes a given java integer in the range 0 to 99999999 inclusive 
 * and returns the equivalent number as a String in Words.
 *
 */
public interface NumberConverter {
	/**
	 * Converts a given java integer within the range given by {@link #isValidNumber(int)}
	 * @param number the integer to convert
	 * @return the word equivalent of the given number.
	 */
	public String convert(int number);
	
	/**
	 * Class Invariant for validating that the number to be converted falls within the valid range.
	 * @param number The integer to validate.
	 * @return true if number falls within the valid range.
	 */
	public boolean isValidNumber(int number);
}
