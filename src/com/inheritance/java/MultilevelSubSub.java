package com.inheritance.java;

public class MultilevelSubSub extends MultilevelSub {

	void m3(){
		
		System.out.println("Multilevel inheritance - Super sub Class");
	}
	
	public static void main(String[] args) {
		
		MultilevelSubSub Obj = new MultilevelSubSub();
		Obj.m1();
		Obj.m2();
		Obj.m3();

	}

}
