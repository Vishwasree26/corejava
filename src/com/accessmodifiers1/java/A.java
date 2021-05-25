package com.accessmodifiers1.java;

public class A {

	int x= 10; 	//Default Access-modifier ---# accessed within the package
	
	public String name = "Java";	//Public Access-modifier ----# accessed throughout all the packages
	
	private boolean b = false;		//private Access-modifier  ----# accessed only within the class 
	
	protected String hai = "World"; 	//protected Access-modifier  --# this is equal to default, which is accessed within the package
	
	
	void m1(){		//Default Access-modifier at method level	
		System.out.println("Iam from Default Access-modifier ");
	}
	
	public void m2(){	//Public Access-modifier 
		System.out.println("Iam from Public Access-modifier");
	}
	
	private void m3(){		//private Access-modifier
		System.out.println("Iam from private Access-modifier");
	}
	
	protected void m4(){	//protected Access-modifier
		System.out.println("Iam from protected Access-modifier");
	}
	
	public static void main(String args[]){
		A Obj = new A();
		Obj.m1();
		Obj.m2();
		Obj.m3();
		Obj.m4();
	}
}
