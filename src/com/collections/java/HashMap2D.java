package com.collections.java;

import java.util.HashMap;		

public class HashMap2D {		//By using key and value we can retrieve the data, is HashMap
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> Obj = new HashMap<Integer,String>(); 
		Obj.put(1, "Vishwa");
		Obj.put(2, "Sree");
		Obj.put(3, "Anumandla");
		
		System.out.println(Obj);
		System.out.println(Obj.get(2));	//getting the values using key
	}
}
