/**
 * 
 */
package com.converter.british.converter.impl.test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.converter.api.NumberConverter;
import com.converter.british.impl.LessThanThousandConverter;
import com.converter.exception.NumbersConverterException;

public class Test_LessThanThousandConverter {
	
	static NumberConverter numberConverter;

	@BeforeClass
	public  static void setUpBeforeClass() throws Exception {
		numberConverter = new LessThanThousandConverter();
	}

	
	@AfterClass
	public  static void tearDownAfterClass() throws Exception {
		numberConverter = null;
	}

	@Test(expected=NumbersConverterException.class)
	public final void testInvalidLargeNumbers() {
		numberConverter.convert(1000000000);
	}
	
	@Test(expected=NumbersConverterException.class)
	public final void testInvalidNegativeNumbers() {
		numberConverter.convert(-1);
	}
	
	@Test
	public final void testIsNotValid() {
		assertFalse(numberConverter.isValidNumber(1000000000));
	}
	
	@Test
	public final void testConvertLessThanTwenty() {
		assertEquals(numberConverter.convert(19),"nineteen");
	}
	
	@Test
	public final void testConvertDecades() {
		assertEquals(numberConverter.convert(30),"thirty");
	}
	
	@Test
	public final void testConvertDecadesWithRemainder() {
		assertEquals(numberConverter.convert(65),"sixty five");
	}
	
	@Test
	public final void testHundreds() {
		assertEquals(numberConverter.convert(500),"five hundred");
	}
	
	@Test
	public final void testConvertHundredWithRemainder() {
		assertEquals(numberConverter.convert(675),"six hundred and seventy five");
	}

}
