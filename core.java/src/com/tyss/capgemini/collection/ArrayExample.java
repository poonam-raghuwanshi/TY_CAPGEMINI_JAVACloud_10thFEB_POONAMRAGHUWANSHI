package com.tyss.capgemini.collection;

public class ArrayExample { // HOMOGENEOUS COLLECTION OF SIMILAR DATA-; ARRAY
	public static void main(String[] args) {

		int[] intArray1 = new int[6];
		int[] intArray2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		// int intArray2[] = new int [6]; NOT THE PROPER WAY OF CREATING ARRAY.

		intArray1[0] = 1;
		intArray1[1] = 2;
		intArray1[2] = 3;
		intArray1[3] = 4;
		intArray1[4] = 5;
		intArray1[5] = 'A'; // = Integer.parseInt("abc"); throws numberformatexception

		for (int i = 0; i < intArray1.length; i++) {
			System.out.println("Element at intArray1 index: " + i + "=" + intArray1[i]);
		}
		
		System.out.println("**********************");
		
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println("Element at intArray2 index: " + i + "=" + intArray2[i]);
		}
		
		//the below lines of code will throw an exception ArrayIndexOutOfBoundsException
		//for (int i : intArray2) {
			//System.out.println("Element at intArray2 index: " + i + "=" + intArray2[i]);
		//}

	}
}
