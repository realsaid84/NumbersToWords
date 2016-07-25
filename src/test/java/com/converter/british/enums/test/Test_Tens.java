package com.converter.british.enums.test;

import static org.junit.Assert.*;
import com.converter.british.enums.Tens;
import org.junit.Test;

public class Test_Tens {

	@Test
	public final void testGetIndex() {
		assertEquals(Tens.FORTY.getIndex(), 4);
	}

	@Test
	public final void testGetPrefix() {
		assertEquals(Tens.SIXTY.getPrefix(), "sixty");
	}

	@Test
	public final void testFindPrefix() {
		assertEquals(Tens.findPrefix(8), "eighty");
	}
	
	@Test
	public final void testInvalidInput() {
		assertEquals(Tens.findPrefix(80), "");
	}

}
