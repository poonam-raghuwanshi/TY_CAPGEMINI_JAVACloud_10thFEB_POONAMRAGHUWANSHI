package com.tyss.capgemini.collection;

public class CustonListExecuter {
	public static void main(String[] args) {
		CustomList customList = new CustomList(4);
		customList.add("1");
		customList.add("4");
		customList.add("1");
		customList.add("12");
		customList.add("1");
		customList.add("2");
		
		System.out.println("CustomList Size:" + customList.size());

		for (int i = 0; i < customList.size(); i++) {
			System.out.println("Element at : " + i + "index : " + customList.get(i));
		}
		System.out.println("***************************");
		boolean isThere = customList.contains("12");
		System.out.println("customList.contains(12 ):" + isThere );
		System.out.println("***************************");
		
		System.out.println(customList.getIndex("123"));
	}
}
