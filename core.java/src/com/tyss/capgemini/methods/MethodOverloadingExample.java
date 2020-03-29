package com.tyss.capgemini.methods;

public class MethodOverloadingExample {
	
	public static void displayMessage() {
		System.out.println("public static void displayMessage()...");
	}

	//overloaded method
	public static void displayMessage( String string) {
		System.out.println("public static void displayMessage(String string)...");
	}
	
	//overloaded method
	public static void displayMessage(String string, int i) {
		System.out.println("public static void displayMessage(String string, int i)...");
	}
	
	//overloaded method
	public static void displayMessage(int i, String string) {
		System.out.println("public static void displayMessage(int i, String string)...");
	}

	public static void main(String[] args) {
		MethodOverloadingExample moe = new MethodOverloadingExample();
		
		MethodOverloadingExample.displayMessage();
		displayMessage("poonam");
		MethodOverloadingExample.displayMessage("poonam" , 1234);
		MethodOverloadingExample.displayMessage(1234 , "poonam");
	}


}
