package com.tyss.capgemini.inheritence;

public class SubClassL1 extends SuperClass{
	
	@Override
 public String print() {
	 return "poonam raghuwanshi";
	}
	 
	 public void display() {
		 System.out.println("display() of subClass");
	 }
 
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		SubClassL1 subClassL1 = new SubClassL1();
		SuperClass superClass2 = new SubClassL1();  // upcasting
		SubClassL1 subClassL12 = (SubClassL1) superClass2; // example //down casting
		
		//SubClassL1 subClassL12=  (SubClassL1) new SuperClass(); //NOT REQUIRED
		 
		System.out.println(superClass.print());
		System.out.println(subClassL1.print());
		System.out.println(subClassL12.print());
		subClassL1.display();
	}
}
