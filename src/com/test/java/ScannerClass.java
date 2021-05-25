package com.test.java;

import java.util.Scanner;		//It is the pre-defined package of scanner

public class ScannerClass {			// to enter values from keyboard we use scanner
	
	void m1(int x, int y){
		
	}
	void m2(String s){
		
	}
	public static void main(String[] args) {
		
	ScannerClass Obj = new ScannerClass();
	Scanner sc = new Scanner(System.in);	//Pre-defined syntax of scanner
	
	System.out.println("Enter x value");
	int x = sc.nextInt();
	
	System.out.println("Enter y value");
	int y = sc.nextInt();
	Obj.m1(x,y);
	
	System.out.println("Enter s value");
	String s = sc.next();
	Obj.m2(s);
	}

}
