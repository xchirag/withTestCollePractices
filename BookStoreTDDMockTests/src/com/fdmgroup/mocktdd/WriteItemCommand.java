package com.fdmgroup.mocktdd;


import java.util.ArrayList;
import java.util.List;

import org.omg.PortableInterceptor.SUCCESSFUL;


public class WriteItemCommand {

	private List<Book> booksInDatabase; // = new ArrayList<>();
	private Book mockBook;
	
	public WriteItemCommand(){
		mockBook = new Book();
		booksInDatabase = new ArrayList<>();
	}
//	public void insertItem(Book b) {
//		this.book = b;
//		booksInDatabase.add(book);
//	}
	public void insertItem(Book mockBook) {
		// TODO Auto-generated method stub
	booksInDatabase.add(mockBook);
	//boolean p = true;
	//System.out.println(p);
	}


	
}
