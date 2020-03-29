package com.tyss.capgemini.operators;

public class UnaryOperator {
	public static void main(String[] args) {
		int i = 10;
		boolean isTrue = true;

		int j = -i;
		System.out.println(j);
		System.out.println(!isTrue);

		System.out.println("value of i with pre-increment: " + ++i); // pre-incremenr
		System.out.println("value of i:" + i); //first increment and then utilization

		System.out.println("value of j with post-increment: " + j++); // post-increment
		System.out.println("value of j:" + j); //first utilization then increment

		System.out.println("value of i with pre-decrement: " + --i); // pre-decrement
		System.out.println("value of i: " + i); //first decrement then utilization

		System.out.println("value of j with post-increment: " + j--); // post-decrement
		System.out.println("value of j:" + j); //first utilization then decrement
	}
}
