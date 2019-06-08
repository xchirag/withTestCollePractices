package com.fdmgroup.cataloguetest.mockito;

import java.util.ArrayList;
import java.util.List;

public class Catalogue implements ReadItemCommand{
	
	private List<Book> bookList;
	
	public Catalogue(){
		bookList = new ArrayList<>();
	}
	public List<Book> GetAllBooks(){
		
		return ReadAll(bookList);
		
	}
	@Override
	public List<Book> ReadAll(List<Book> bookList2) {
		// TODO Auto-generated method stub
		return bookList2;
			
	}

}
