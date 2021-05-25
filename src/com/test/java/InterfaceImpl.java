package com.test.java;

public class InterfaceImpl implements Interface {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Interface - Child");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface Obj = new InterfaceImpl(); //we cannot create an object in Interface parent class, we can create only in sub-class
		Obj.m1();
		

	}


}
