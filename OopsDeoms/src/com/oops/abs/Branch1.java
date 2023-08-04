package com.oops.abs;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("car loan");
	}

	@Override
	void housingLoan() {
		System.out.println("house loan");

	}

	@Override
	void eduLoan() {
		System.out.println("education  loan");

	}
	void staffDetails() {
		System.out.println("staff in branch");
	}

	@Override
	void admin() {
		// TODO Auto-generated method stub
		System.out.println("in branch1 admin");
	}

}
