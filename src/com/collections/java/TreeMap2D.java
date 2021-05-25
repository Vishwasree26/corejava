package com.collections.java;

import java.util.TreeMap;

public class TreeMap2D {

	public static void main(String[] args) {

		TreeMap<Integer,String> Obj = new TreeMap<Integer,String>(); 
		Obj.put(3, "Vishwa");
		Obj.put(1, "Sree");
		Obj.put(2, "Anumandla");
		
		System.out.println(Obj);
		System.out.println(Obj.get(2));	

	}

}
