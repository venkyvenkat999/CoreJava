package com.lumen.def;

public class AnonDemo {

	public static void main(String[] args) {
		//implement bonuscalculator using anonymous class
		BonusCalculator bonuscalculator=new BonusCalculator() {
			
			@Override
			public void calculate(int amount) {
				System.out.println("amount"+amount);
			}
		};
		bonuscalculator.calculate(600);
	}

}
