package com.lumen.def;

public interface AllowenceCalculator {
	void calculate(int amount);
	default void policyType() {
		 System.out.println("this is policy type");
	 }


}
