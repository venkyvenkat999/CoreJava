package com.oops.abs;

public class SubBranch extends Branch2 {

	@Override
	void carLoan() {
		System.out.println("car loan in sub branch");
	}
	void subPay() {
		System.out.println("payment in sub branch");
	}
	@Override
	void eduLoan() {
		// TODO Auto-generated method stub
		System.out.println("this is branch2 education loan");
		super.eduLoan();
	}
	

}
