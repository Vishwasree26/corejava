package com.test.java;

public class SuperSub extends SuperKeyword {
	
	int x = 12;
	
	void m1(){
		
		System.out.println("Child Method - Super Sub");
		super.m1();				// Accessing method from parent class
		System.out.println("Variable from child class "+x);	// Accessing variable from child class
		System.out.println("Variable from parent class "+super.x); 	// Accessing variable from parent class
	}
	
	public SuperSub(){
		
		System.out.println("Default constructor - Child");
	}
	
	public SuperSub( int z){
		super(100);			// Accessing constructor from parent class
		System.out.println("1-Para constructor - Child");
	}
	
	public static void main(String[] args) {
		SuperSub Obj = new SuperSub();
		SuperSub Objs = new SuperSub(200);	// Accessing constructor from child class
		Obj.m1();
	}
}
