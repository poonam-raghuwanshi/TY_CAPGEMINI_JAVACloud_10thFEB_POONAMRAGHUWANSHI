package com.tyss.capgemini.inheritence;

public interface MethodsInterface1 {
	public void displayMessage();

	public void printMessage();
	
	public static void showMessage() {
		System.out.println("public static showMessage() of IMethodsInterface1...");
	}
	default void defaultMethodMessage() {
		System.out.println("defaultMethodMessage() of MethodsInterface1");
	}
}
