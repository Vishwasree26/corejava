package com.test.java;

public class ThisKeywordMethod {

	void m1(){
		System.out.println("Default parameter");
	}
	void m2(int x){
		System.out.println("1-parameter");
	}
	void m3(int y, String s){
		this.m1();
		this.m2(30);
		System.out.println("2-parameter");
		this.m4();  	// we can only call from static to instance using 'this'
	}
	static void m4(){
		//this.m3();  ----cannot use this keyword in static but we can call static method in instance using 'this'
		System.out.println("Static method - Default parameter");
	}
	public static void main(String[] args) {
		ThisKeywordMethod Obj = new ThisKeywordMethod();
		Obj.m3(10, "Sree");

	}

}
