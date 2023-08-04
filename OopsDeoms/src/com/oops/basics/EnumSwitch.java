package com.oops.basics;

import java.util.Scanner;

enum Seasons{
	SUMMER,WINTER,RAINY,AUTUMN;
}
public class EnumSwitch {
	public static void main(String[] args) {
		//Seasons seasons=new
		System.out.println("enter the season");
		Scanner scanner=new Scanner(System.in);
		String season=scanner.nextLine().toUpperCase();
		Seasons seasons=Seasons.valueOf(season);
		
		switch (seasons) {
		case SUMMER:
			System.out.println("print very hot.eat icecreams");
			break;
		case RAINY:
			System.out.println("drink hot tea icecreams");
			break;
		case WINTER:
			System.out.println("drink more soups to keep yourself worm");
			break;
		case AUTUMN:
			System.out.println("go and enjoy");
			break;
		default:
			System.out.println("enter the correct season");
		}
		
		
	}

}
