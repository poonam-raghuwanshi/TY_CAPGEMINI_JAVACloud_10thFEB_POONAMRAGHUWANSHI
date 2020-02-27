package com.tyss.capgemini.collection;

import java.util.Arrays;

public class ArraysClassExample {
	public static void main(String[] args) {
		int[] intArray = { 30, 40, 50, 90, 70, 20, 0 };
		Arrays.sort(intArray);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
			
		}
		int[] intArray2 = Arrays.copyOf(intArray, 3);
		 for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
			
			System.out.println("*****Arrays.fill*****");
		//	Arrays.fill(intArray2, 8, 9, 100);
	// 		Arrays.fill(intArray2, 7, 9, 100);

			for (int j = 0; j < intArray2.length; j++) {
				System.out.println(intArray2[j]);
			}
			System.out.println("*********************");
			
			System.out.println(intArray.equals(intArray2));
			
			System.out.println(Arrays.equals(intArray, intArray2));
		}
	}
}
