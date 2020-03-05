package com.navin;

public class StaticAndNonStatic {
   // Global Variable 
   // There are two types static and non-static.

	static int i=10;  // static variable //class level variable
	String name="navin"; // non-static variable / instance level variable 
	
	public void m1() {
		System.out.println("Method m1");
	}
	
	public static void m2() {
		System.out.println("Static method m2");
		
	}
	
	public static void m3() {
		System.out.println("Static method m3");
	}
	
	public static void main(String[] args) {
		// calling static members 
		
		// we can call members directly
		System.out.println(i);
		m2();
		m3();
		
		// we can call member by class name
		System.out.println(StaticAndNonStatic.i);
		StaticAndNonStatic.m2();
		StaticAndNonStatic.m3();
		
		// non static member are called by creating object
		StaticAndNonStatic obj=new StaticAndNonStatic();
		System.out.println(obj.name);
		obj.m1();		
		
		// can we call static member using object reference variable ?
		// Ans: Yes but it is not a good practice 
		
		//obj.m2(); //The static method m2() from the type StaticAndNonStatic should be accessed in a static way
	}
}