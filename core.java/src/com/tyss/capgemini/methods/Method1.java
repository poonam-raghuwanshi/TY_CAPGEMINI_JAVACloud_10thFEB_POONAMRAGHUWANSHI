package com.tyss.capgemini.methods;

public class Method1 {
	// called method
	public static void displayMessage() {
		System.out.println("execution comes to displayMessage method");
		System.out.println("hello world");
		System.out.println("end of displayMessage method");

	}

	// calling method
	public static void main(String[] args) {
		System.out.println("displayMessage method is called");
		displayMessage();
		System.out.println("end of main method");
	}
	/* we cant create a method inside a method
	 * public static void name() { public static void name1() {
	 * 
	 * } }
	 */
}
