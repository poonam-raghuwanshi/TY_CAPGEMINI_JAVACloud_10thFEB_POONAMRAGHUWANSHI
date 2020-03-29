package com.tyss.capgemini.classesandobjects;

import com.tyss.capgemini.methods.BasicArithmeticOperation;

public class  ObjectClassMethodExample {
	public static void main(String[] args) {
		ObjectClassMethodExample objectClassMethodExample1 = new ObjectClassMethodExample();
		
		ObjectClassMethodExample objectClassMethodExample2 = new ObjectClassMethodExample();
		
		 System.out.println(objectClassMethodExample1.getClass());
		 System.out.println("with toString() " + objectClassMethodExample1.toString());
		 System.out.println(objectClassMethodExample1);
		 System.out.println("with toString() " + objectClassMethodExample2.toString());
		 System.out.println(objectClassMethodExample2);
		 System.out.println(objectClassMethodExample1.hashCode());
		 System.out.println(objectClassMethodExample2.hashCode());
		 System.out.println(objectClassMethodExample1.equals(objectClassMethodExample2));
		 
		 
		

	}

}
