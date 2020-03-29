package com.tyss.capgemini.string;

public class StringsExample {
	public static void main(String[] args) {

		// in string there is n no. of constructor. strings are immutable it means,
//the value of string will not change.		

		String string1 = "Miss Fabb";

		String string2 = new String("Poonam Raghuwanshi");

		String string3 = "Indore";

		String string4 = "M.P.";

		String string5 = new String("After party");

		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		System.out.println(string3.hashCode());
		System.out.println(string4.hashCode());
		System.out.println(string5.hashCode());

		System.out.println("string1==string4:" + string1.equals(string4));

		System.out.println("string2==string3:" + string1.equals(string3));

		System.out.println("string2==string5:" + string1.equals(string5));

	}
}