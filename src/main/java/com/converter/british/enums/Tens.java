package com.converter.british.enums;

/**
 * <p>
 * TENS is an Enum used to represent the index and equivalent words of 
 * multiple of tens starting from zero to ninety.
 * </p>
 * 
 **/
public enum Tens {
	
	ZERO(0, ""),

	TEN(1, ""),

	TWENTY(2, "twenty"),

	THIRTY(3, "thirty"),

	FORTY(4, "forty"),

	FIFTY(5, "fifty"),

	SIXTY(6, "sixty"),

	SEVENTY(7, "seventy"),

	EIGHTY(8, "eighty"),

	NINETY(9, "ninety");

	

	
	/**
	 * The integer value of this enum
	 */
	private int index;

	/**
	 * The string value of this enum
	 */
	private String prefix;

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
	private Tens(final int index, final String prefix) {
		this.index =  index;
		this.prefix = prefix;
	}

	/**
	 * Gets the integer value of this enum
	 * 
	 * @return The int value of this enum
	 */
	public int getIndex() {
		return this.index;
	}

	/**
	 * Gets the string value of this enum
	 * 
	 * @return The string value of this enum
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * Finds the word representation of this integer
	 * 
	 * @param num
	 *            The integer whose prefix value is to be derived
	 * @return The prefix of the index passed to this method
	 */
	public static String findPrefix(final int index) {
		// Stream.of(values()).filter(x -> index == x.getIndex()).findAny().map(e->e.getPrefix());
		for (Tens idx : values()) {
			if (index == idx.getIndex()) {
				return idx.getPrefix();
			}
		}
		return "";
	}

}
