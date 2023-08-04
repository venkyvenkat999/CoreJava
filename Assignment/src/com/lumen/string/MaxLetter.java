package com.lumen.string;

public class MaxLetter {
	
	public static void main(String[] args) {
	String name="venugopalvenkattt";
	
		int max=0;
		int index=0;
	for(int initial =0; initial<name.length(); initial++){
		int count=1;
		for(int next=initial+1;next<name.length();next++) {
			if(name.charAt(initial)==name.charAt(next)) {
				count+=1;
				
			}
			if(count>max)
				max=count;
			    index=initial;
		}
    } 
	System.out.println(name.charAt(index));
}
}
