/**
 * 
 */
package com.converter.british.converter.impl.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.converter.api.NumberConverter;
import com.converter.british.impl.NumbersToBritishWordsConverter;
import com.converter.exception.NumbersConverterException;


public class Test_NumbersToBritishWordsConverter {

	static NumberConverter numberConverter;

	@BeforeClass
	public  static void setUpBeforeClass() throws Exception {
		numberConverter = new NumbersToBritishWordsConverter();
	}

	
	@AfterClass
	public  static void tearDownAfterClass() throws Exception {
		numberConverter = null;
	}

	/**
	 * Test method for {@link com.converter.british.impl.LessThanThousandConverter#convert(int)}.
	 */
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
	public final void testIsValid() {
		assertTrue(numberConverter.isValidNumber(9888));
	}
	
	@Test
	public final void testNumberLessThanAThousand() {
		assertEquals(numberConverter.convert(100),"one hundred");
		assertEquals(numberConverter.convert(45),"forty five");
		assertEquals(numberConverter.convert(588),"five hundred and eighty eight");
		assertEquals(numberConverter.convert(756),"seven hundred and fifty six");
	}
	
	/**
	 * Tests number greater than 1000 and less than a Million 
	 * e.g. 1088, 250000, 100000
	 */
	@Test
	public final void testThousands() {
		assertEquals(numberConverter.convert(1088),"one thousand and eighty eight");
		assertEquals(numberConverter.convert(250000),"two hundred and fifty thousand");
		assertEquals(numberConverter.convert(100000),"one hundred thousand");
	}
	
	/**
	 * Test Millions
	 * e.g. 5000000, 6500000
	 */
	@Test
	public final void testMillions() {
		assertEquals(numberConverter.convert(5000000),"five million");
		assertEquals(numberConverter.convert(65000000),"sixty five million");
		assertEquals(numberConverter.convert(788000000),"seven hundred and eighty eight million");
	}
	
	/**
	 * Test Sample Inputs from the Problem Statement
	 * e.g. 0,1,25,105,123,1005,1042,1105,56945781,999999999
	 */
	@Test
	public final void testSampleProblemInput() {
		assertEquals(numberConverter.convert(0),"zero");
		assertEquals(numberConverter.convert(1),"one");
		assertEquals(numberConverter.convert(25),"twenty five");
		assertEquals(numberConverter.convert(105),"one hundred and five");
		assertEquals(numberConverter.convert(123),"one hundred and twenty three");
		assertEquals(numberConverter.convert(1005),"one thousand and five");
		assertEquals(numberConverter.convert(1042),"one thousand and forty two");
		assertEquals(numberConverter.convert(1105),"one thousand one hundred and five");
		assertEquals(numberConverter.convert(56945781),"fifty six million nine hundred and forty five thousand seven hundred and eighty one");
		assertEquals(numberConverter.convert(999999999),"nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine");
	}
	
}
