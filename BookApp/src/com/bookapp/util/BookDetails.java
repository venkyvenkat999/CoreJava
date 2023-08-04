package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book>showBooks(){
		return Arrays.asList(
				new Book("java in action","johndavid","tech",1,19000.90),
				new Book("python","john","tech",2,19000.90),
				new Book("javaScript","david","smart",3,19000.90),
				new Book("nodeJs","vijay","tekky",4,19000.90));

				
	}
}
