package com.tyss.capgemini.loops;

import java.util.Scanner;

public class LoopAssignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number...");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			for (int i = 1; i <= n; i++) {
				System.out.println("the number is even");
			}
		} else
			System.out.println("the number is odd");

		sc.close();
	}
}
