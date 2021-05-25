package com.test.java;

public class SuperKeyword { 		//3 types --> Variable level, Method level, Constructor level
 
	int x = 10;
	
	void m1(){
		System.out.println("Parent Method - Super Keyword");
	}
	
	public SuperKeyword(){
		
		System.out.println("Default constructor - Parent");
	}
	
	public SuperKeyword( int y){
		
		System.out.println("1-Para constructor - Parent");
	}
	
	
	
	
}
