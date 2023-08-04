package com.oops.basics;

public class Book {
String title;
String author;
double price;

void printDetails() {
	System.out.println("title:"+title);
	System.out.println("author:"+author);
	System.out.println("price:"+price);   
}

double getDiscountedPrice(double amount,double discount) {
	
	return price=(amount-discount);
	
}

}
