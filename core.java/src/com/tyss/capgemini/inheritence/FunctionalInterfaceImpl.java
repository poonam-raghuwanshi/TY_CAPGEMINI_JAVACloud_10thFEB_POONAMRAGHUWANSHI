package com.tyss.capgemini.inheritence;

public class FunctionalInterfaceImpl implements FunctionalInterfaceExample, FunctionalInterfaceExample2 {

	@Override
	public void showMessage() {
		System.out.println("overridden showMessage() of FunctionalInterfaceExample");
	}
	@Override
	public int add(int i, int j) {
		
		return i + j;
	}

		public static void main(String[] args) {
		FunctionalInterfaceImpl functionalInterfaceImpl = new FunctionalInterfaceImpl();
		functionalInterfaceImpl.displayMessage();
		functionalInterfaceImpl.showMessage();

		FunctionalInterfaceExample.printMessage();
		
		System.out.println(functionalInterfaceImpl.add(4, 5));
		
		functionalInterfaceImpl.messageDisplay();
		
		FunctionalInterfaceExample2.print();
	}

		
}
