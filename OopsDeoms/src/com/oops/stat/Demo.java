package com.oops.stat;
import static java.lang.Integer.parseInt;
public class Demo {
	static {
		System.out.println("static block in demo");
	}

	public static void main(String[] args) {
		System.out.println("main demo");
		Trial.getMessage();	
		int x=100;int y=200; 
		System.out.println("x+y:"+(x+y));
		//using static import
		final int  n=parseInt("100");
		System.out.println(n);
		
	}
}
