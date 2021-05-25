package com.test.java;

public class ObjectConstructor {
	
	int x;
	
	public ObjectConstructor() {		// Default constructor
		
		System.out.println("Default constructor");
	}
	public ObjectConstructor(int x) {	//1-Parameterised Constructor
		this();							// calling default constructor to 1-Para constructor 
		System.out.println("1-para constructor "+x);
		this.x=x;				// when global and local variables are same, we use 'this' keyword to validate the difference 
		System.out.println(this.x);
		m1();		// we can even call method into constructor
	}
	 
	void m1(){
		System.out.println("method");
		ObjectConstructor Ob = new ObjectConstructor(); // we can call constructor into method( to call we need to write Object)
	}

	public static void main(String[] args) {
		ObjectConstructor Objs = new ObjectConstructor();
		ObjectConstructor Obj = new ObjectConstructor(26); // "constructor" initializes the value from the object
		System.out.println(Obj.x);

	}

}
