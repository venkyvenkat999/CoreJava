package com.lumen.scanner;
import java.util.Scanner;
public class SquareArray {
			public static void main(String[] args) {
				int marks[]=new int[4];
				int second[]=new int[4];
				Scanner scanner=new Scanner(System.in);
				for(int initial=0;initial<marks.length;initial++) {
					marks[initial]=scanner.nextInt();
				}
				int initial=0;
				for(int mark:marks) {
						second[initial]=mark*mark;
						initial++;
				}
				for(int value:second)
					System.out.println(value);
				scanner.close();
 }
}
