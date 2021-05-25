package com.test.java;

public class MethodOverloading {		//method name and logic is same but parameters are different..
	
	static void m1(String aadhar){		
		System.out.println("Approved");
	}
	static void m1(String aadhar, String pan){			
		System.out.println("Approved");
	}
	
	static void m1(String aadhar, int mobileNumber){			
		System.out.println("Approved");
	}
	
	static void m1(int mobileNumber, String Pan){		
		System.out.println("Approved");
	}


	public static void main(String[] args) {
		MethodOverloading Obj = new MethodOverloading();
		m1("123456");
		m1(888,"kv123456");
	
		}
	}


