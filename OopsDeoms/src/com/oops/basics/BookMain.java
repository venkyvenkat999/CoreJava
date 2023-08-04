package com.oops.basics;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		Book book1=new Book();
		book.title="rich dad";
		book.author="ven";
		book.price=20000;
		
		book1.title="poor dad";
		book1.author="pupil";
		book1.price=20;
		book.getDiscountedPrice(2000.0,200);
		book1.getDiscountedPrice(4000.0,400);
		book.printDetails();
		book1.printDetails();

	}

}
