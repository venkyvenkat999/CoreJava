package com.lumen.basics;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usernames[]= {"venkat","rajesh","madhu","jagadeesh"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter username:");
		String user=scanner.nextLine();
		int count=0;
		for(String username:usernames) {
			if(username.equals(user)) {
				System.out.println("login successfully");
				count=1;
				break;
			}
			
		}
		if(count==0) {
			System.out.println("invalid user");
		}

	}

}
