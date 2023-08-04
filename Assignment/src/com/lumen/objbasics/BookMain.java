package com.lumen.objbasics;

public class BookMain {

	public static void main(String[] args) {
		Book book=new Book("rich dad","kiosaki",1000);
		Book book1=new Book("poor dad","robert",100);
		book.getDetails();
		book.checkBookType();
		book1.getDetails();
		book1.checkBookType();
	}

}
