package com.tyss.capgemini.exceptions;

public class ExceptionExample {
	public static void main(String[] args) {
	//	String string = "";
		try {
	//	System.out.println(string.charAt(3));
			int i = 10 / 0;
			System.out.println(i);
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("charAt(int index) should not be called on null string");
			System.out.println(e.getClass());
			System.out.println(e.getCause());
			System.err.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("should not divide by zero");
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			System.err.println(e.getMessage());
		} /*
			 * catch (Exception e ) { System.err.println("Exception caught in the code...");
			 * System.out.println(e.getClass()); System.err.println(e.getMessage()); }
			 */
	}

}
