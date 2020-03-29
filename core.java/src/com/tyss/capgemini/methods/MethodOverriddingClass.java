package com.tyss.capgemini.methods;

public class MethodOverriddingClass extends Methods {
//	@Override
	public String printMessage() {
		 		return "non-static MethodOverridingClass.printMessage()";
	}
	
	//@Override //cannt override static method
	public static String displayMessage() {
		return "static MethodOverridingClass.displayMessage()";
	}

	@Override
		protected String welcomeMessage() {
			// TODO Auto-generated method stub
			return super.welcomeMessage();
		}
	@Override
		int addingTwoIntegers(int i, int j) {
			// TODO Auto-generated method stub
			return super.addingTwoIntegers(i, j);
		}
	
	public static void main(String[] args) {
		MethodOverriddingClass methodOverriddingClass = new MethodOverriddingClass();
		 System.out.println( methodOverriddingClass.printMessage());
		 System.out.println( methodOverriddingClass.welcomeMessage());
		 System.out.println( methodOverriddingClass.addingTwoIntegers(2,3));
		 System.out.println(Methods.displayMessage());
		System.out.println(displayMessage());
 	}
}
