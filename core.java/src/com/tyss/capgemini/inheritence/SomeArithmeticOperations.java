package com.tyss.capgemini.inheritence;

import com.tyss.capgemini.methods.BasicArithmeticOperation;

public class SomeArithmeticOperations extends BasicArithmeticOperation {

	public SomeArithmeticOperations() {
		super("A");
		// super();
		System.out.println("SomeArithmeticOperations constructor");
	}

	public static void main(String[] args) {

		SomeArithmeticOperations someArithmeticOperations = new SomeArithmeticOperations();

		System.out.println("add method of superclass : " + add(45, 87));
		System.out.println("sub method of superclass : " + sub(3, 67));
		System.out.println("div method of superclass : " + div(45, 9));
		System.out.println("mul  method of superclass : " + mul(34, 56));

	}

}
