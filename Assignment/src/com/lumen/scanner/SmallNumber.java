package com.lumen.scanner;
import java.util.Scanner;

public class SmallNumber {
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter value of A:");
			int member1=scanner.nextInt();
			System.out.println("enter value of B:");
			int member2=scanner.nextInt();
			System.out.println("enter value of C:");
			int member3=scanner.nextInt();
			if((member1<member2)&&(member1<member3))
				System.out.println(member1);
			else if(member2<member3)
				System.out.println(member2);
			else
				System.out.println(member3);
	}

}
