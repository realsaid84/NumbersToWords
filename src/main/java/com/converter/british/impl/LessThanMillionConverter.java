package com.converter.british.impl;

import com.converter.api.NumberConverter;
import com.converter.exception.NumbersConverterException;

/**
 * <p>
 * Implements the conversion of a given integer less than 1000000 to equivalent British words.
 * </p>
 */
public class LessThanMillionConverter implements NumberConverter {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String convert(int number) {
		if (!isValidNumber(number)) {
			throw new NumbersConverterException("Input is outside conversion range <1-999,999>");
		}
		
		LessThanThousandConverter thousandConverter = new LessThanThousandConverter();
		
		StringBuilder prefix = new StringBuilder(thousandConverter.convert(number / 1000)).append(" thousand");
		int moduloOfNumber = number % 1000;
		
		if (moduloOfNumber > 0) {
			if (moduloOfNumber < 100) {
				prefix.append(" and ");
			} else {
				 prefix.append(" ");
			}
			return prefix.append(thousandConverter.convert(number % 1000)).toString();

		} else {
			return prefix.toString();
		}
	}

	/**
	 * {@inheritDoc}
	 * <br />Valid Range : [0 , 999999]
	 */
	public boolean isValidNumber(int number) {
		return number >= 0 && number <= 999999;

	}

}
