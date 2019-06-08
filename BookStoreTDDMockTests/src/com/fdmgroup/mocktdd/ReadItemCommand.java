package com.fdmgroup.mocktdd;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.List;

public class ReadItemCommand {
	
	private List<Book> booksInDatabase;
	
	public ReadItemCommand(){
		
		booksInDatabase = new ArrayList<>();
	}

	public List<Book> readAll() {
		
		if (booksInDatabase.isEmpty())
			return null;
		else 
			return booksInDatabase;
	}

}
