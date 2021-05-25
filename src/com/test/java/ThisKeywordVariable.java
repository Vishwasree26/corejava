package com.test.java;

public class ThisKeywordVariable {  // Assigning global and local variable using 'this' keyword,is is used when global and local variables are same 
									
	int x;
	int y;
	void m1(int x, int y){
		this.x=x;			// 'this' keyword at variable level
		this.y=y;
		System.out.println("This keyword at variable level");
	}
	
	static void m2(int x){
	//this.x=x;		--- cannot use 'this' keyword in static context  	
	}
	
	public static void main(String[] args) {
	
		ThisKeywordVariable Obj = new ThisKeywordVariable();
		Obj.m1(10, 20);
	}

}
