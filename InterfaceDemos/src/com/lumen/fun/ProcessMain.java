package com.lumen.fun;

public class ProcessMain {

	public static void main(String[] args) {
		Processor processor=new Processor();
		/*NewCalculator adder=new Adder();
		processor.processData(adder, 10, 20);
		processor.processData(new Adder(), 10, 20);
		
		//anonymous
		processor.processData(new NewCalculator() {
			
			@Override
			public void calculate(int x, int y) {
				// TODO Auto-generated method stub
				
			}
		}, 10, 20);
		*/
		//lamda
		processor.processData((x, y)->{
			System.out.println(x-y);
			
		}, 10, 20);
		processor.processData((int x,int y)->System.out.println(x-y), 10, 20);
	}

}
