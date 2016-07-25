package com.converter.british.impl;

import com.converter.api.NumberConverter;
import com.converter.exception.NumbersConverterException;

/**
 * <p>
 * It implements the conversion of a given java integer within the range of 0 -
 * 99999999 inclusive to British language Words.
 * </p>
 */
public class NumbersToBritishWordsConverter implements NumberConverter {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String convert(int number) {
		// Check if the Integer is Valid between the range 1 to 99999999999
		// inclusive
		if (!isValidNumber(number)) {
			throw new NumbersConverterException("Input is outside conversion range <1-999,999,999>");
		}
		// Converts any Integer less than 1000
		if (number < 1000) {
			return new LessThanThousandConverter().convert(number);
		}

		if (number < 1000000) {
			return new LessThanMillionConverter().convert(number);
		}

		return convert(number / 1000000) + " million" +
		 ((number % 1000000 > 0) ? " " + 
		 convert(number % 1000000) : "");
	}

	/**
	 * {@inheritDoc}
	 * <br />Valid Range : [0 , 999999999]
	 */
	@Override
	public boolean isValidNumber(int number) {
		return number >= 0 && number <= 999999999;
	}

}
