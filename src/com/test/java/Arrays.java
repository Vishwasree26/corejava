package com.test.java;

public class Arrays {		//Storing multiple values into a single variable is called arrays

	public static void main(String[] args) {
		Arrays Ob = new Arrays();		//Class Object
		
		int[] Array = new int[3];		//Object Array of int
		Array[0] = 1;
		Array[1] = 2;
		Array[2] = 3;
		
		System.out.println(Array[1]);
		
		for (int i = 0; i < Array.length; i++) {	//to loop overall length of an array we choosed to write for loop
			
			System.out.println("Element at index "+ i + ":"+ Array[i]);
		}
		
		
		
		
		String[] Arrays = new String[3];		//Object Array of String
		Arrays[0] = "Anumandla";
		Arrays[1] ="Vishwa";
		Arrays[2] = "Sree";
		
		System.out.println(Arrays[2]);
		
		for (int i = 0; i < Arrays.length; i++) {
			
			System.out.println("Element at index "+ i + ":"+ Arrays[i]);
		}
		
		
		
		
		Object[] Arr = new Object[5];		//Object Array of String, which holds all data types
		Arr[0] = 'A';
		Arr[1] ="Vishwa";
		Arr[2] = 1996;
		Arr[3] = true;
		Arr[4] = 26.96;
		
		
		System.out.println(Arr[2]);
		
		for (int i = 0; i < Arr.length; i++) {
			
			System.out.println("Element at index "+ i + ":"+ Arr[i]);
		}
		
	}

}
