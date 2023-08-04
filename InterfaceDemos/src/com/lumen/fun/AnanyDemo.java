package com.lumen.fun;

public class AnanyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greet=new GreerImpl();
		greet.greetUser("venkatesh");
		
		//ananymous function
		Greeter greetOne=new Greeter() {
			
			@Override
			public void greetUser(String username) {
				System.out.println("great day"+username);
			}
		};
		//calling
		greetOne.greetUser("nayak");
		//ananymous function
		
		Greeter greet2=new Greeter() {

			@Override
			public void greetUser(String username) {
				System.out.println("welcome bro"+username);

			}
			
		};
		

	}

}
