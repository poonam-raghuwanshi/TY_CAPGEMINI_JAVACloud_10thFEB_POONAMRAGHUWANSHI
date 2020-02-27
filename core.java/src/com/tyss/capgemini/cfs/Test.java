package com.tyss.capgemini.cfs;
class Super{
	public void m() {
		System.out.println("super");
	}
}
public class Test extends Super{
	public Test() {
		System.out.println("child");
	
	}
	public static void main(String[] args) {
		Test t=new Test();
		Super s=new Test();
		t.m();
		s.m();
	}
}
