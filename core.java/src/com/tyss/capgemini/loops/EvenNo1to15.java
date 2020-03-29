package com.tyss.capgemini.loops;

public class EvenNo1to15 {
public static void main(String[] args) {
	int i; 
	int sum=0;
	for (i=1; i<=50; i++) {
		
		if(i%2==0) {
			sum=sum+i;
			}
	}
		System.out.println("sum = " +sum);
		
	
}
}
