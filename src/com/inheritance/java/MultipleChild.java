package com.inheritance.java;

public interface MultipleChild extends MultipleParent1,MultipleParent2 {

	void m3();
	
	int m=20;
	
	public static void main(String[] args) {
		MultipleChild Obj = new MultipleChild() {
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("MultipleParent2");
			}
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("MultipleParent1");
			}
			
			@Override
			public void m3() {
				// TODO Auto-generated method stub
				System.out.println("MultipleChild");
			}
		};
		
		Obj.m1();
		Obj.m2();
		Obj.m3();
		
	}
}
