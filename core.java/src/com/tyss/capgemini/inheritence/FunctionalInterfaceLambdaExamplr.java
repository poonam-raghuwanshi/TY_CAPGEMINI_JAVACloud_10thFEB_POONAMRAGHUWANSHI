package com.tyss.capgemini.inheritence;

public class FunctionalInterfaceLambdaExamplr {
	static String string = "lambda expression example for FunctionalInterfaceExample";
	static FunctionalInterfaceExample functionalInterfaceExample = () -> {
		System.out.println(string);
		System.out.println("another line of Impl.."); 
	}; 

	static FunctionalInterfaceExample2 functionalInterfaceExample2 = (i, j) -> i + j; 

	public static void main(String[] args) {
		functionalInterfaceExample.displayMessage();
		functionalInterfaceExample.showMessage();

		FunctionalInterfaceExample.printMessage();

		System.out.println(functionalInterfaceExample2.add(5, 6));
		functionalInterfaceExample2.messageDisplay();

		FunctionalInterfaceExample2.print();
	}

}
