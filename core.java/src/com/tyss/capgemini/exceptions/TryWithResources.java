package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			;

			int i = 10;
			int j = scanner.nextInt();
			/*
			 * //System.out.println(i / j); }catch (Exception e) {
			 * System.err.println("should not devide the number by zero...");
			 * System.err.println(e.getMessage()); }
			 */
			if (j == 0)
				System.err.println("should not devide number by zero ");
			else
				System.out.println(i / j);
		}
	}
}
// this class should be implementing autoclosable or extending autoclosable.
