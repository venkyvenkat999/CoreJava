package com.lumen.fun;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunDemo {

	public static void main(String[] args) {
		//implementing consumer using lambda
		Consumer<String> consumer=(str)->System.out.println(str.toUpperCase());
		//call the method
		consumer.accept("venkatesh");
		//do it for integer
		Consumer<Integer> consumer1=(number)->System.out.println(number);
		consumer1.accept(999999);
		
		Consumer<Book> book1=(book)->System.out.println(book.getTitle());
		Book book=new Book();
		book1.accept(book);
		
		Supplier<String> supplier=()->"hello".toUpperCase();
		String result=supplier.get();
		System.out.println(result);
		
		//do it for integer
		Supplier<Integer> supplier1=()-> 100;
		Integer result1=supplier1.get();
		System.out.println(result1);
		
		//for book
		
		Supplier<Book> supp=()->new Book("a","b","v",1990,1900.0);
		System.out.println(supp.get());
		
	}

}
