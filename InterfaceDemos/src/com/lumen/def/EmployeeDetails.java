package com.lumen.def;

public class EmployeeDetails implements BonusCalculator,AllowenceCalculator{

	public void calculate(int amount) {
		System.out.println("amount:"+amount);
	}
	@Override
	public void greet() {
		BonusCalculator.super.greet();
	}

	@Override
	public void policyType() {
		AllowenceCalculator.super.policyType();
	}
	
}
