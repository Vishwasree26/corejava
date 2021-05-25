package com.test.java;

public class FinalKeyword {
	
	final static String name = "Vishwasree";  //'Final' keyword should always be initialized, it should not be declared
	int i = 10;
	void m1(){
		//name = "Sree";  ---//Ex: name is already initialized as final so we cannot reuse it
	}
	
	public static void main(String[] args) {
		FinalKeyword Obj = new FinalKeyword();
		String name = Obj.name;
		System.out.println(name);
		// String name = "Vishu"; -----//can't reassign the name variable, as it is used by Final Keyword
		int x=Obj.i;
		x=30;			// re- assigning x value from 10 to 30 as we didn't use final
		System.out.println(x);
	}

}
