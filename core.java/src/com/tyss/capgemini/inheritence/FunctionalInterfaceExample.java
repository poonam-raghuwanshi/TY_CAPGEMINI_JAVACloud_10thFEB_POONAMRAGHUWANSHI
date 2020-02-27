package com.tyss.capgemini.inheritence;
@FunctionalInterface
public interface FunctionalInterfaceExample {
public void showMessage();
//public void displayMessage(); BECAUSE IN FUNCTIONAL INTERFACE ONLY ONE ABSTRACT METHOD IS PRESENT.
//public void printMessage();

public static void printMessage() {
	System.out.println("public static printMessage() of FunctionalInterfaceExample");
}
default void displayMessage() {
	System.out.println("default displayMessage() of FunctionalInterfaceExample");
}

}
