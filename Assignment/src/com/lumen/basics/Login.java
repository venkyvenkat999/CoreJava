package com.lumen.basics;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String usernames[]= {"karthik","nikky","lokesh","viru"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter user name:");
		String user=scanner.nextLine();
		int count=0;
		for(String username:usernames) {
			if(user.equals(username)) {
				System.out.println("you login successfully");
				count=1;
			}
			
		}
		if(count==0) {
			System.out.println("invalid user");
		}
	}

}
