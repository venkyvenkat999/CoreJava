package com.lumen.def;

//import com.lumen.extend.Calculator;

public class DefMain {
	public static void main(String[] args) {
		BonusCalculator bonuscalculator = new EmployeeDetails();
		bonuscalculator.calculate(2000);
		bonuscalculator.greet();
		bonuscalculator.policyType();
		BonusCalculator.staticMethod();

	}
}