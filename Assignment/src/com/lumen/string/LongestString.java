package com.lumen.string;

public class LongestString {

	public static void main(String[] args) {
		String text="hello you are soo lucky lucky so look at this spelling";
		String words[]=text.split(" ");
		int maximumLength=0;
		String temp=null;
		for(String word:words) {
			if(word.length() > maximumLength) {
				temp=word;
			}
		}
	System.out.println(temp);
	}
}
		
