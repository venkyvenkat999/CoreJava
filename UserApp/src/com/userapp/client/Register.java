package com.userapp.client;
import java.util.Scanner;

import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;
public class Register {

	public static void main(String[] args) {
		IValidationService ivalidationservice=new ValidationServiceImpl();

		try {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the username");
		String username=scanner.nextLine();
		System.out.println(ivalidationservice.validateUsername(username));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the password");
			String password=scanner.nextLine();
			ivalidationservice.validatePassword(password);

			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
