package com.oops.overload;

public class VarargsDemo {
	
	void calcSum(String name,int...marks) {
		System.out.println("welcome"+name);
		int sum=0;
		for(int mark:marks) {
			sum+=mark;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		VarargsDemo demo=new VarargsDemo();
		demo.calcSum("venkat",90,80,90);
		demo.calcSum("priya");
		demo.calcSum("roni",60,60,60);
	}
		
	}

