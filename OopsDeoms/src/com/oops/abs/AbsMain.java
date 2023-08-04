package com.oops.abs;

public class AbsMain {

	public static void main(String[] args) {
		Bank bank=new Branch1();
		Branch1 branch1=(Branch1)bank;
		
		Branch2 branch2=new SubBranch();
		SubBranch subbranch=(SubBranch)branch2;
//		bank.admin();
//		bank.carLoan();
//		bank.eduLoan();
//		Branch1 branch1=new Branch1();
//		
//		branch1.admin();
//		branch1.carLoan();
//		branch1.eduLoan();
//		branch1.staffDetails();
//		Branch1 branch1=(Branch1)bank;
//		branch1.admin();
	}

}
