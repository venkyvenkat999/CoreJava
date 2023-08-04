package com.bookapp.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.util.BookDetails;

public class Client {

	public static void main(String[] args) {
		IBookService iBookService=new BookServiceImpl();
		//Scanner scanner=new Scanner(System.in);
		List<Book> books=new ArrayList<>();
		List<Book> books1=new ArrayList<>();

		books=iBookService.getAll();
		for (Book book : books) {
			System.out.println(book);
		}
		
		
		books1=iBookService.getByAuthorContains("david");
		for (Book book : books1) {
			System.out.println(book);
		}
		
		books=iBookService.getByCategory("tech");
		for (Book book : books1) {
			System.out.println(book);
		}
		
		books=iBookService.getByPriceLessThan(9999);
		for (Book book : books1) {
			System.out.println(book);
		}
		books=iBookService.getAuthorContainsAndCategory("david","tech");
		for (Book book : books1) {
			System.out.println(book);
		}
		System.out.println(iBookService.getById(3));
		
		
		
	}

	
}
