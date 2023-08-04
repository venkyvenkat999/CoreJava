package com.lumen.fun;

public class CalMain {
	public static void main(String[] args) {

		NewCalculator newcalculator=(x,y)->System.out.println(x+y);
		newcalculator.calculate(2, 3);
		
		newcalculator=(x,y)->System.out.println(x-y);//implementation
		newcalculator.calculate(4, 4);
		
		/*
		newcalculator.subtraction(3, 3);
		newcalculator.multiplication(2, 3);
		newcalculator.division(3, 3);
		newcalculator.calcu=
		*/
		/*
		Printer printer=()->"welcome back";
		System.out.println(printer.print());
		*/
	
}
}