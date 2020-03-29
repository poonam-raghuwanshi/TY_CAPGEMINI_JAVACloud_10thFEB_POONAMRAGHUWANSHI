package com.tyss.capgemini.cfs;

public class IfElseExample {
	public static void main(String[] args) {
		int time=2359;
		
		if(time>=2300)
			System.out.println("include late night charges...");
		else
			System.out.println("exclude late night charges...");
		
		System.out.println("pizza delivered");
	}

}
