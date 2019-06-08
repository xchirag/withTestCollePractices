package com.fdmgroup.mocktdd;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	private List<Book> books;
	private ReadItemCommand readDatabase;
	private WriteItemCommand writeDatabase;
	private Book mockBook;

	public Catalogue() {

		books = new ArrayList<>();
		readDatabase = new ReadItemCommand();
		writeDatabase = new WriteItemCommand();
	}

	public void removeBook(int isbnNumber) {

	}

	public List<Book> getAllBooks() {

		books = readDatabase.readAll();
		return books;
	}

	public void changePrice(Book b) {

	}

	// The add book method of Catalogue should make a call to the insertItem
	// method of WriteItemCommand

//	public void addBook(Book b) {
//		
//		this.book = b;
//		writeDatabase.insertItem(book);
//
//	}

	public void addBook(Book mockBook){
		writeDatabase.insertItem(mockBook);
	}
	
	
}
