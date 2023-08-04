package com.lumen.string;

public class Palindrome {

	public static void main(String[] args) {
		String name="level";
		String reversedString="";
		for(int initial = name.length()-1; initial >= 0; initial--){    
            reversedString = reversedString + name.charAt(initial);    
        }    
		if(name.equals(reversedString)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
	}

}
