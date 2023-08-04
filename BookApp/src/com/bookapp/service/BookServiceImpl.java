package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		List<Book>books=BookDetails.showBooks();
		return books;
		}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getbyauthorcontains=new ArrayList<>();
		try {
			for (Book book : books) {
				if(book.getAuthor().equals(author))
					 getbyauthorcontains.add(book);
				
			}
			if(getbyauthorcontains.isEmpty())
				throw new BookNotFoundException("Book not found with this author name");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return getbyauthorcontains;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		ArrayList<Book> getbycategory=new ArrayList<>();
		List<Book> books=BookDetails.showBooks();
		try {
		for(Book book:books) {
			if(book.getCategory().equals(category))
				getbycategory.add(book);
			}
		if(getbycategory.isEmpty())
			throw new BookNotFoundException("Book not found with this author name");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return getbycategory;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=BookDetails.showBooks();
		ArrayList<Book> getbypricelessthan=new ArrayList<>();
		try {
		for (Book book : books) {
			if(book.getPrice()>=price)
				getbypricelessthan.add(book);
			}
			if(getbypricelessthan.isEmpty())
				throw new BookNotFoundException("Book not found with this author name");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			}
		return getbypricelessthan;
	}

	@Override
	public List<Book> getAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books=BookDetails.showBooks();
		ArrayList<Book> getauthorcontainsandcategory=new ArrayList<>();
		try {
		for (Book book : books) {
			if(book.getAuthor().equals(author)&&book.getCategory().equals(category))
				getauthorcontainsandcategory.add(book);
			}
		if(getauthorcontainsandcategory.isEmpty())
			throw new BookNotFoundException();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			}
		return getauthorcontainsandcategory;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book> books=BookDetails.showBooks();
		List<Book>getbyid=new ArrayList<Book>();
		try {
		for (Book book : books) {
			if(book.getBookId()==((Integer)bookId))
				getbyid.add(book);
		}
		if(getbyid.isEmpty())
			throw new BookNotFoundException("Book not found with this author name");
				
		}catch (Exception e) {
			System.out.println(e.getMessage());
			}
		return (Book)getbyid;
	}

	

}
