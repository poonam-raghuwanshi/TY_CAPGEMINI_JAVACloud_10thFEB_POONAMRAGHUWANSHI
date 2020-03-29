 package com.tyss.capgemini.classesandobjects;

public class ClassExample {
	// zero-arguement constructor
	public ClassExample() {
		System.out.println("zero-arguement constructor");

	}

	// parameterised constructor ; constructor overloading
	public ClassExample(String string) {
		System.out.println("constructor with one string argument");

	}

	// parameterised constructor ; constructor overloading
	public ClassExample(String string, int i) {
		System.out.println("constructor with one string and one int arguement");

	}

	// parameterised constructor ; constructor overloading
	public ClassExample(int i, String string) {
		System.out.println("constructor with one int and one string arguement");

	}

	public static void main(String[] args) {
		ClassExample ce1 = new ClassExample();

		ClassExample ce2 = new ClassExample("poonam");

		ClassExample ce3 = new ClassExample("poonam", 1234);

		ClassExample ce4 = new ClassExample(1234, "poonam");

	}

}
