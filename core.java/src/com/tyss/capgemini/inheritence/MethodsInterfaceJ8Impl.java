package com.tyss.capgemini.inheritence;

public class MethodsInterfaceJ8Impl implements MethodsInterface1{   //IN INTERFACE WE CANT CREATE OBJECT THTS WHY WE CREATED A CLASS TO CALL A METHOD.

	@Override
	public void displayMessage() {
		System.out.println("overridden displayMessage()  of MethodsInterface1");
	}

	@Override
	public void printMessage() {
		System.out.println("overridden printMessage()  of MethodsInterface1");		
	}
	
	public static void main(String[] args) {
		MethodsInterfaceJ8Impl methodsInterfaceJ8Impl = new MethodsInterfaceJ8Impl();
		methodsInterfaceJ8Impl.displayMessage();
		methodsInterfaceJ8Impl.printMessage();
		methodsInterfaceJ8Impl.defaultMethodMessage();
		
		MethodsInterface1.showMessage();
	}

}
