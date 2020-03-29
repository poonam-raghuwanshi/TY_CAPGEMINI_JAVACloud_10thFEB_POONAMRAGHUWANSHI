package com.tyss.capgemini.inheritence;

public interface FunctionalInterfaceExample2 {

	public  int add(int i, int j);
	
	public static void print() {
		System.out.println("public static printMessage() of FunctionalInterfaceExample");
	}
	default void messageDisplay() {
		System.out.println("default displayMessage() of FunctionalInterfaceExample");
	}
}
