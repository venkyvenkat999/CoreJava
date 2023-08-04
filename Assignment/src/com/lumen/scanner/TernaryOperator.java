package com.lumen.scanner;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter value of A:");
	int member1=scanner.nextInt();
	System.out.println("enter value of B:");
	int member2=scanner.nextInt();
	System.out.println("enter value of C:");
	int member3=scanner.nextInt();
	int result=member1>member2?(member1>member3?member1:member3):(member2>member3?member2:member3);
	System.out.println(result);

	}
}
