package com.tyss.capgemini.abstraction;

public class TesterClass extends AbstractClassExample {
	 
	@Override
	public String displayMessage() {
		return "displayMessage() of MethodsInterface";
	}

	/*
	 * @Override public String printMessage() { // TODO Auto-generated method stub
	 * return null; }
	 */

	@Override
	String display() {
		return "display() of AbstractClassExample" ;
	}

	@Override
	String print() {
		return  "print() of AbstractClassExample";
	}
	
	public static void main(String[] args) {
		TesterClass testerClass = new TesterClass();
		
		testerClass.displayMessage();
		
		System.out.println(testerClass.print());
		System.out.println(testerClass.display());
		
		testerClass.printMessage();
	}
	

}
