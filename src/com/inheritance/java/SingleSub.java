package com.inheritance.java;

public class SingleSub extends Single {

	void m2(){
		
		System.out.println("Single inheritance - Child Class");
	}
	
	public static void main(String[] args) {
		SingleSub Obj = new SingleSub();	//By creating child class object we can inherit the properties from both the parent and child too . .
		Obj.m1();
		Obj.m2();
	}
}
