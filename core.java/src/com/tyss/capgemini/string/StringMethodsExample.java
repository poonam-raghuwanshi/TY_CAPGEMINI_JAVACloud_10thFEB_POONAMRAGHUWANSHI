package com.tyss.capgemini.string;

public class StringMethodsExample {
	public static void main(String[] args) {
		String string1 = "Mr.Fabb";
		String string2 = "Indore";
		String string3 = "mR.faBB";

		System.out.println("length of string1:" + string1.length());
		System.out.println("length of string2:" + string1.length());

		System.out.println("isEmpty() of String1:" + string1.isEmpty());
		System.out.println("isEmpty() of String2:" + string2.isEmpty());

		System.out.println("charAt() of String: " + string1.charAt(4));
		System.out.println(string1.charAt(string1.length() - 1));
		// System.out.println(string2.charAt());

		System.out.println("equals() of String: " + string1.equals(string3));
		System.out.println("equalsIgnoreCase() of String: " + string1.equalsIgnoreCase(string3));

		// System.out.println(string1.concat("concatenated string"));
		String string4 = string1.concat("concatenated string");

		System.out.println(string1); // prints "Mr.Fabb" as string is immutable
		System.out.println(string4);

		String string5 = string1.replace('b', 'B');
		System.out.println(string1); // prints "Mr.Fabb" as string is immutable
		System.out.println("replace() output:" + string5);
		
		String string6 = String.valueOf(12345); //convert data into String
		System.out.println(string6);

		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());
		
		System.out.println("substring(int stindx) of String:"+ string1.substring(5));
		System.out.println("substring(int stindx, int endindx) of String:" + string1.substring(5, 6));
		
		System.out.println("startswith(String prefix) of String:"+ string1.startsWith("A"));
		System.out.println("endswith(String suffix) of String:"+ string1.endsWith("b"));
		
		System.out.println(string1); //prints "Mr.Fabb" as string is immutable
	}
}
