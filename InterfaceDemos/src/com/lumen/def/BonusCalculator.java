package com.lumen.def;

public interface BonusCalculator {
	void calculate(int amount);
	default void greet() {
		 System.out.println("hava a good day");
	 }
	 default void policyType() {
		 System.out.println("this is policy type");
	 }
	 //static method cannot be override.we can call by interface name
	 static void staticMethod() {
		 System.out.println("this is static method");
	 }

}
