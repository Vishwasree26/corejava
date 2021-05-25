package com.accessmodifiers2.java;

import com.accessmodifiers1.java.A;

public class C {
	
	
	public static void main(String args[]){
		A Obj = new A();
	//	Obj.m1();	---> //Default Access-modifier ---# accessed within the package
		Obj.m2();
	//	Obj.m3();	---> //private Access-modifier  ----# accessed only within the class 
	//	Obj.m4();	---> //protected Access-modifier  --# this is equal to default, which is accessed within the package
	}
}
