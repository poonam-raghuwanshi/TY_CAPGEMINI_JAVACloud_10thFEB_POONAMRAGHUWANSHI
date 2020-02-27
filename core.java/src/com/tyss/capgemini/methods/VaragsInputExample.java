package com.tyss.capgemini.methods;

public class VaragsInputExample {

	public int add(int... input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
			//sum= sum + input[i];
		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.println("sum : " + new VaragsInputExample().add(1, 2, 50, 60));
	}

}
