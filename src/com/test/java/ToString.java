package com.test.java;

public class ToString {			//Tostring is used to display the complete details

	int x;
	String name;
	String Address;
	
	public ToString(int x, String name, String address) {
		super();
		this.x = x;
		this.name = name;
		Address = address;
	}
	
	@Override
	public String toString() {
		return "ToString [x=" + x + ", name=" + name + ", Address=" + Address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToString Obj = new ToString(1, "Vishwa", "Hyd");
		ToString Objs = new ToString(2, "Sree", "Hyd");
		
		System.out.println(Obj);
		System.out.println(Objs);
		

	}

}
