/**
 * 
 */
package com.converter.british.converter.impl.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.converter.api.NumberConverter;
import com.converter.british.impl.LessThanMillionConverter;
import com.converter.exception.NumbersConverterException;


public class Test_LessThanMillionConverter {

	static NumberConverter numberConverter;

	@BeforeClass
	public  static void setUpBeforeClass() throws Exception {
		numberConverter = new LessThanMillionConverter();
	}

	
	@AfterClass
	public  static void tearDownAfterClass() throws Exception {
		numberConverter = null;
	}

	@Test(expected=NumbersConverterException.class)
	public final void testInvalidLargeNumbers() {
		numberConverter.convert(1000000);
	}
	
	@Test(expected=NumbersConverterException.class)
	public final void testInvalidNegativeNumbers() {
		numberConverter.convert(-1);
	}
	
	@Test
	public final void testIsNotValid() {
		assertFalse(numberConverter.isValidNumber(1000000));
	}
	
	@Test
	public final void testPreciseThousands() {
		assertEquals(numberConverter.convert(1000),"one thousand");
		assertEquals(numberConverter.convert(3000),"three thousand");
		assertEquals(numberConverter.convert(78000),"seventy eight thousand");
		assertEquals(numberConverter.convert(500000),"five hundred thousand");
	}
	
	/**
	 * Tests multiple of thousands with a remainder less than 100 
	 * e.g. 1015, 1099, 80088
	 */
	@Test
	public final void testThousandsWithRemainderDecades() {
		assertEquals(numberConverter.convert(1015),"one thousand and fifteen");
		assertEquals(numberConverter.convert(1099),"one thousand and ninety nine");
		assertEquals(numberConverter.convert(80088),"eighty thousand and eighty eight");
	}
	
	/**
	 * Tests multiple of thousands with a remainder greater than 100 
	 * e.g. 1100, 3550, 15210
	 */
	@Test
	public final void testThousandsWithRemainder100() {
		assertEquals(numberConverter.convert(1100),"one thousand one hundred");
		assertEquals(numberConverter.convert(3550),"three thousand five hundred and fifty");
		assertEquals(numberConverter.convert(15210),"fifteen thousand two hundred and ten");
	}
	
	

}
