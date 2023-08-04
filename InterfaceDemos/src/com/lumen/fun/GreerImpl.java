package com.lumen.fun;

public class GreerImpl implements Greeter{

	@Override
	public void greetUser(String username) {
		System.out.println("great day"+username);
	}

}
