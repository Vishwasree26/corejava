package com.test.java;

public class ThisKeywordConstructor {

	public ThisKeywordConstructor() {
		System.out.println("Default constructor");
	}
	public ThisKeywordConstructor(int x) {
		this();
		System.out.println("1-para constructor");
	}
	public ThisKeywordConstructor(int x,String s) {
		//this(); ---- we cannot use both 'this' keyword in one constructor, but we can use as many in method and constructor level
		this(10);      // calling 1-para using 'this'
		System.out.println("2-para constructor");
	}
	
	public static void main(String[] args) {
		ThisKeywordConstructor Obj = new ThisKeywordConstructor(10,"Sree"); //calling 2-para using Object

	}

}
