package com.converter.british.enums;


/**
 * 
 * <p>
 * UNITS is an Enum used to represent numbers zero through
 * to nineteen. It specifies these numbers and their equivalent English words.
 * </p>
 * <p>
 * These numbers forms the building blocks of constructing numbers in words
 * </p>
 * 
 **/
public enum Units {
	

	ZERO(0, "zero"),

	ONE(1, "one"),

	TWO(2, "two"),

	THREE(3, "three"),

	FOUR(4, "four"),

	FIVE(5, "five"),

	SIX(6, "six"),

	SEVEN(7, "seven"),

	EIGHT(8, "eight"),

	NINE(9, "nine"),

	TEN(10, "ten"),

	ELEVEN(11, "eleven"),

	TWELVE(12, "twelve"),

	THIRTEEN(13, "thirteen"),

	FOURTEEN(14, "fourteen"),

	FIFTEEN(15, "fifteen"),

	SIXTEEN(16, "sixteen"),

	SEVENTEEN(17, "seventeen"),

	EIGHTEEN(18, "eighteen"),

	NINETEEN(19, "nineteen");

	
	/**
	 * The integer value of this enum
	 */
	private int number;

	/**
	 * The string value of this enum
	 */
	private String word;

	/**
	 * 
	 * Private constructor used internally to instantiate this enum type
	 * 
	 * @param intValue
	 *            The integer value of this enum
	 * @param translation
	 *            The String value of this enum
	 * 
	 */
	private Units(final int number, final String word) {
		this.number =  number;
		this.word = word;
	}

	/**
	 * Gets the integer value of this enum
	 * 
	 * @return The int value of this enum
	 */
	public int getNumber() {
		return this.number;
	}

	/**
	 * Gets the string value of this enum
	 * 
	 * @return The string value of this enum
	 */
	public String getWord() {
		return word;
	}

	/**
	 * Finds the word representation of this integer
	 * 
	 * @param num
	 *            The integer whose word value we want
	 * @return The string value of the integer passed to this method
	 */
	public static String findWord(final int num) {
		for (Units number : values()) {
			if (num == number.getNumber()) {
				return number.getWord();
			}
		}
		return "";
	}

}
