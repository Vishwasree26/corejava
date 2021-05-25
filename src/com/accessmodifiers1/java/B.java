package com.accessmodifiers1.java;

public class B {

	
	
	public static void main(String[] args) {
		A Obj = new A();
		Obj.m1();
		Obj.m2();
	//	Obj.m3();  --->//private Access-modifier  ----# accessed only within the class 
		Obj.m4();

	}

}
