package com.converter.exception.test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.converter.api.NumberConverter;
import com.converter.british.impl.NumbersToBritishWordsConverter;
import com.converter.exception.NumbersConverterException;

public class Test_NumberConverterException {

	NumberConverter numberConverter;
	
	@Before
	public void setUp() throws Exception {
		numberConverter = new NumbersToBritishWordsConverter();
	}

	@After
	public void tearDown() throws Exception {
		numberConverter = null;
	}

	@Test(expected=NumbersConverterException.class)
	public final void testNumbersConverterExceptionLargeNumbers() {
		numberConverter.convert(1000000000);
	}
	
	@Test
	public final void testConvertZero() {
		assertEquals(numberConverter.convert(0),"zero");
	}
	
	@Test(expected=NumbersConverterException.class)
	public final void testNumbersConverterExceptionNegativeNumbers() {
		numberConverter.convert(-1);
	}

}
