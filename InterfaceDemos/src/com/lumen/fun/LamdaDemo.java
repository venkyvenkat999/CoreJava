package com.lumen.fun;

public class LamdaDemo {

	public static void main(String[] args) {
		/*
		Greeter greeter=(String username)->{
			System.out.println("hello" +username);
		};
		//calling method
		greeter.greetUser("venkat");
		Greeter greeter1=username->System.out.println("welcome"+username);
		greeter1.greetUser("siri");
		*/
		Checker checker=(username,city)->{
			if(username.equals("venkatesh")&&(city.equals("village")))
			return true;
			else
			return false;
			
		};
		System.out.println(checker.checkName("venkatesh","villag"));
	}

}
