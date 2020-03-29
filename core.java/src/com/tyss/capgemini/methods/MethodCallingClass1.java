package com.tyss.capgemini.methods;

public class MethodCallingClass1 {
	public static void main(String[] args) {
	   AreaCalculator ac = new AreaCalculator();

		System.out.println("Area of square :" + ac.calculateAreaOfSquare(4));

		System.out.println("Area of rantangle :" + ac.calculateAreaOfRactangle(4, 5));

		System.out.println("Area of ciecle :" + ac.calculateAreaOfCiecle(4));

	}
}
