package com.lumen.fun;

public class Processor {
	void processData(NewCalculator calculator,int para1,int para2) {
		System.out.println("processing");
		calculator.calculate(para1,para2);
		System.out.println("completed");
	}
}
