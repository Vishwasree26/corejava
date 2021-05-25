package com.collections.java;

import java.util.TreeSet;

public class TreeSet1D {

	public static void main(String[] args) {
		TreeSet<String> obj=new TreeSet<String>();
		
		//Elements are added using add method
		obj.add("B");
		obj.add("A");
		obj.add("E");		
		obj.add("D");	// and these are also case Sensitive
		obj.add("C");	
		obj.add("C");//Duplicate values are not allowed & follows ascending order by default	
		System.out.println("Object creation of same data types "+obj);	//by default elements get stored in ASCENDING ORDER

	}
	
	
			/*TreeSet objs=new TreeSet();
			objs.add("Hai");
			objs.add("World");
			objs.add(100);
			objs.add(true);
			objs.add('V');
			System.out.println("Object creation of different data types "+objs);
	}*/
			
}

