package com.tyss.capgemini.inheritence;

public class InterfacesImplClass1 implements MethodsInterface1, AnotherMethodsInterface1 {
	
	
	
	public static void main(String[] args) {
		/*
		 * MethodsInterface methodsInterface = new InterfaceImplClass(); //upcasting
		 * AnotherMethodsInterface anotherMethodsInterface = new
		 * AnotherMethodsInterface(); methodsInterface.printMessage();
		 * methodsInterface.displayMessage(); anotherMethodsInterface.messageDisplay();
		 */
		
		InterfacesImplClass1 implClass = new InterfacesImplClass1();
		implClass.displayMessage();
		implClass.printMessage();
		implClass.messageDisplay();


	}

	@Override
	public void messageDisplay() {
		System.out.println("overridden messageDisplay() of AnotherMethodsInterface");
				
	}

	@Override
	public void displayMessage() {
		System.out.println("overridden displayMessage() of MethodsInterface");
		
	}

	@Override
	public void printMessage() {
		System.out.println("overridden printMessage() of MethodsInterface");		
	}
}


