package com.tyss.capgemini.inheritence; //java.lang package is a by default import.

import com.tyss.capgemini.methods.BasicArithmeticOperation;

public class DifferentPackageMethodExample extends BasicArithmeticOperation {

	public DifferentPackageMethodExample(String string) {
		super("poonam");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// BasicArithmeticOperation.add(12,12);
		// this is just because we use extends so that we dont need to call add() using
		// class name

		System.out.println(add(12, 12));

		DifferentPackageMethodExample differentPackageMethodExample = new DifferentPackageMethodExample("as");

		System.out.println(differentPackageMethodExample.toString());
		System.out.println(differentPackageMethodExample.hashCode());

		// BasicArithmeticOperation.add(5, 4);
		System.out.println("add method of superclass:" + add(8, 9));
		System.out.println("sub method of superclass:" + sub(45, 16));
		System.out.println("div method of superclass:" + div(45, 7));
		System.out.println("mul method of superclass:" + mul(5, 13));

	}

}
