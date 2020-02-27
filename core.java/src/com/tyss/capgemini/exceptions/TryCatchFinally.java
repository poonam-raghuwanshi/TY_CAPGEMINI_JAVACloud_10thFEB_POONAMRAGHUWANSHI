package com.tyss.capgemini.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (  ArithmeticException e) {
			System.err.println("exception caught in the code...");
			//System.exit(0);
		} 
			 catch (Exception e) { System.err.println("catch (exception e)");
			// System.exit(0);
			 
			 } finally {
			System.out.println("code to be executed be there any exception or not...");
		}
		System.out.println("some code...");
	}

}
