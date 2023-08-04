package com.lumen.scanner;
import java.util.Scanner;

public class ArrayOnedim {
		public static void main(String[] args) {
			int marks[]=new int[4];
			Scanner scanner=new Scanner(System.in);
			for(int initial=0;initial<marks.length;initial++) {
				marks[initial]=scanner.nextInt();
			}
			int sum=0;
			for(int mark:marks)
				sum=sum+mark;
			System.out.println(sum);
			System.out.println("average"+(sum/marks.length));
			scanner.close();
		}

	}
