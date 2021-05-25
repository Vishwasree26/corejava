package com.test.java;

public abstract class AbstractClass {

	void m1(){
		
		System.out.println("Abstract class - Parent");
	}
	
	abstract void m2();			//Without body methods (or) Unimplemented methods
	

 public static void main(String args[]){
	// AbstractClass Obj = new AbstractClass();  ----we need to create object using parent and child relation in abstract class
	 // we cannot create object only using parent class
 }											
}