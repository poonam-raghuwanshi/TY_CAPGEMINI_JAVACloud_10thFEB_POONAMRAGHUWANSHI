package com.tyss.capgemini.threads;

public class CustomThread {
	public static void printingValues1() {
		for(int i=1; i<10; i++) {
			System.out.println("Printing Values: " +i);
		}
	
	}
	
	public static void printingValues2() {
		for(int i=1; i<10; i++) {
			System.err.println("Printing Values: " +i);
		}
	}	
	

}
