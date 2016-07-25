package com.converter.british.enums.test;

import static org.junit.Assert.*;
import com.converter.british.enums.Units;
import org.junit.Test;

public class Test_Units {

	
	@Test
	public final void testGetNumber() {
		assertEquals(Units.FOURTEEN.getNumber(), 14);
	}

	@Test
	public final void testGetWord() {
		assertEquals(Units.THREE.getWord(), "three");
	}

	@Test
	public final void testFindWord() {
		assertEquals(Units.findWord(8), "eight");
	}
	
	@Test
	public final void testInvalidInput() {
		assertEquals(Units.findWord(80), "");
	}

}
