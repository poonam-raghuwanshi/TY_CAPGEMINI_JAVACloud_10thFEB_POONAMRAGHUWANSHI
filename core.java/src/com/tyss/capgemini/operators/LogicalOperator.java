 package com.tyss.capgemini.operators;

public class LogicalOperator {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 30;

		// AND logic operator
		System.out.println((i > j) && (j > k));
		System.out.println((i > j) && (j < k));
		System.out.println((i < j) && (j > k));
		System.out.println((i < j) && (j < k));

		System.out.println("*******************");

		// OR logic operator
		System.out.println((i > j) || (j > k));
		System.out.println((i > j) || (j < k));
		System.out.println((i < j) || (j > k));
		System.out.println((i < j) || (j < k));

		System.out.println("*******************");

		// NOT operator
		System.out.println(!(i > j));
		System.out.println(!(k > j));
		System.out.println(!(i < j));
		System.out.println(!(k < j));

	}

}
