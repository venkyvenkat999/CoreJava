package com.oops.basics;

enum Weeksdays{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumDemo {

	public static void main(String[] args) {
		Weeksdays weekday=Weeksdays.FRIDAY;
		//convert enum to string
		System.out.println(weekday.name());
		System.out.println(weekday.ordinal());
		Weeksdays[] weeksdaysArray=Weeksdays.values();
		for(Weeksdays weeksdays:weeksdaysArray) {
			System.out.println(weeksdays.name());
		
		}
		System.out.println("convrt str to enum");
		weekday=Weeksdays.valueOf("MONDAY");
		System.out.println(weekday);
		
		
	}

}
