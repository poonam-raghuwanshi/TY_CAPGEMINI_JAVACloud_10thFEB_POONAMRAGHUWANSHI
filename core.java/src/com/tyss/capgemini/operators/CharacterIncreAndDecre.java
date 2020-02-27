package com.tyss.capgemini.operators;

public class CharacterIncreAndDecre {
	public static void main(String[] args) {
		char c = 'a';

		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		System.out.println(--c);
		System.out.println(c--);
		System.out.println((int) c); // to know ascii value
		// System.out.println(--isTrue); we cant use incre or decre with boolean
	}
}
