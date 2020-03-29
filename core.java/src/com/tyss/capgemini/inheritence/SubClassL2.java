package com.tyss.capgemini.inheritence;

public class SubClassL2 extends SubClassL1{
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		super.i=12;
		System.out.println("overridden display() in subClass2");
	}
	@Override
	public String print() {
		// TODO Auto-generated method stub
		System.out.println("overridden print() of SuperClass in subClass2");
		return super.print();
	}
	//int j=super.i ;  
	public static void main(String[] args) {
		SubClassL2 subClassL2 = new SubClassL2();
		subClassL2.display();
		System.out.println(subClassL2.print());
		//int j=super.i  ;
		System.out.println("int i of SuperClass : " + subClassL2.i);
	}

}
