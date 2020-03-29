package com.tyss.capgemini.methods;

public class BasicArithmeticOperation {
	
	public BasicArithmeticOperation(String string) {
		System.out.println("basicArithmeticOperation constructor");
	}
	
	/**
	 * this method return the some of two given integers.
	 * @param i
	 * @param j
	 * @return  int i + int j
	 */
	public static int add(int i, int j) {
		/*
		 * int sum= i+j; return sum;
		 */
		// A METHOD CAN HAVE ONLY ONE RETURN STATEMENT.
		return i + j;

	}

	/**
	 * this method return the some of two given integers.
	 * @param i
	 * @param j
	 * @return  int i + int j
	 */

	public static int sub(int i, int j) {
		return i - j;

	}

	/**
	 * this method return the some of two given integers.
	 * @param i
	 * @param j
	 * @return  int i + int j
	 */

	public static double div(int i, double j) {
		return i / j;
	}

	/**
	 * this method return the some of two given integers.
	 * @param i
	 * @param j
	 * @return  int i + int j
	 */

	public static int  mul(int i, int j) {
		return i * j; 
	}

	public static void main(String[] args) {
		int sum = add(12, 13);
		System.out.println("sum:" + sum);
		System.out.println("sum:" + add(45, 45));
		System.out.println("sub:" + sub(90, 45));
		System.out.println("div:" + div(15, 2));
		System.out.println("mul:" + mul(5, 5));

	}

}
