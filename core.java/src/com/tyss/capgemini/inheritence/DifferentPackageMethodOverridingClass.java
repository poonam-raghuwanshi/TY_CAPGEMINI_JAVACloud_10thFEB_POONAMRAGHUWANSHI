package com.tyss.capgemini.inheritence;
import com.tyss.capgemini.methods.Methods;

public class DifferentPackageMethodOverridingClass extends Methods {

	@Override
public String printMessage() {
	return "DifferentPackageMethodOverridingClass.printMessage()";
	
}
	
	@Override
protected String welcomeMessage() {
	return  "hello world from DifferentPackageMethodOverridingClass" ;
}
	 
	//Default is not visible outside the package
	//private not at all visible...
	
	public static void main(String[] args) {
		DifferentPackageMethodOverridingClass differentPackageMethodOverridingClass = new DifferentPackageMethodOverridingClass();
		System.out.println(differentPackageMethodOverridingClass.printMessage());
		System.out.println(differentPackageMethodOverridingClass.welcomeMessage());
	}
}
