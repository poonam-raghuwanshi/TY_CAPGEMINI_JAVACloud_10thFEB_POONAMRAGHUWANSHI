package com.tyss.capgemini.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// ArrayList<Integer> arrayList = new ArrayList<Integer>(10);

		arrayList.add(12);
		arrayList.add(15);
		arrayList.add(18);
		arrayList.add(21);
		arrayList.add(40);
		arrayList.add(67);
		arrayList.add(3);
		arrayList.add(97);
		arrayList.add(23);
		arrayList.add(90);
		//arrayList.add(null);

		// arrayList.add(0, 15);
		// arrayList.add(4,34);

		System.out.println("Size of ArrayList:" + arrayList.size());
		System.out.println("************************");
		
		Collections.sort(arrayList);

		for (Integer integer : arrayList) {
			System.out.print(integer + " ");
		}
		System.out.println();
		System.out.println("************************");

		// System.out.println(arrayList.get(0));
		// System.out.println(arrayList.get(1));
		// System.out.println(arrayList.get(3)); throws exception
		System.out.println(arrayList);
		System.out.println("************************");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}

		System.out.println();
		System.out.println("************************");
		
		arrayList.remove(4);
		
		System.out.println("Size of ArrayList after remove(index):" + arrayList.size());
		System.out.println("************************");
		
		Collections.rotate(arrayList, -(arrayList.size() - 1));
		
		System.out.println(arrayList);
		System.out.println("************************");
		
		boolean isThere1 = arrayList.contains(23);
		boolean isThere2 = arrayList.contains(12345);
		System.out.println("Output of arrayList.contains(23): " + isThere1);
		System.out.println("Output of arrayList.contains(12345): " + isThere2);
		
		

		
		

	}

}
