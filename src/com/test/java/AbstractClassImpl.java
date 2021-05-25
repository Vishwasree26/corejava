package com.test.java;

public class AbstractClassImpl extends AbstractClass {

	@Override
	void m2() {					// we need to override unimplemented methods from parent class
		// TODO Auto-generated method stub
		System.out.println("Abstract class - Child");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass Obj = new AbstractClassImpl();
		Obj.m1();
		Obj.m2();
	}

}
