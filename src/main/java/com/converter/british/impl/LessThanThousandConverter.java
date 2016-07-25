package com.converter.british.impl;

import com.converter.api.NumberConverter;
import com.converter.british.enums.Tens;
import com.converter.british.enums.Units;
import com.converter.exception.NumbersConverterException;

/**
 * <p>
 * Implements the conversion of a given integer less than 1000 to equivalent British words.
 * </p>
 */
public class LessThanThousandConverter implements NumberConverter {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String convert(int number) {
		if(!isValidNumber(number)){
			throw new NumbersConverterException("Input is outside conversion range <1-999>");
		}
		if (number < 20) {
			return Units.findWord(number);
		} else if (number < 100) {
			return Tens.findPrefix(number / 10) + ((number % 10 > 0) ? " " + convert(number % 10) : "");
		} else {
			return Units.findWord(number / 100) + " hundred"
					+ ((number % 100 > 0) ? " and " + convert(number % 100) : "");
		}
	}

	/**
	 * {@inheritDoc}
	 * <br />Valid Range : [0 , 999]
	 */
	@Override
	public boolean isValidNumber(int number) {
		return number >= 0 && number <= 1000;

	}

}