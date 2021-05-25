package com.test.java;

public class MethodCalling {
	
	static void m1(){
		m2();					//Static to static calling
		String name=m2();		//Printing return value 'Vishwa' along with sysout from static to static 
		System.out.println(name);
	}
	static String m2(){
		System.out.println("hai");
		return "Vishwa";
	}
	
	void m3(){
		m4();					// Instance to instance calling
		MethodCalling.m1();		// Static to instance calling
		int i = m4();			//Printing return value '100' along with sysout from Instance to instance 
		System.out.println(i);
		String n = MethodCalling.m2();	//Printing return value from Static to instance 
		System.out.println(n);
	}
	int m4(){
		System.out.println("hello");
		return 100;
	}

	public static void main(String[] args) {
		m1();
		MethodCalling Obj = new MethodCalling();  // Instance to static calling
		Obj.m3();
		int i = Obj.m4();				//Printing return value from Instance to static
		System.out.println(i);

	}

}
