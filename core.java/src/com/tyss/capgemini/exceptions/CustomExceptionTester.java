package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTester {
	public static void main(String[] args) throws InvalidNumberCustomException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the number..");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if(number >= 0 && number <= 10) {
			System.out.println(number * 10);
		}else
			throw new InvalidNumberCustomException("CustomExceptionTester Message");
		
		
	}

}
