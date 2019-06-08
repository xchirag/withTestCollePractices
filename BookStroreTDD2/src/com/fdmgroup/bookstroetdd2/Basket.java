package com.fdmgroup.bookstroetdd2;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	private List<Book> basket; //= new ArrayList<>();
	
	public Basket(){
		basket = new ArrayList<>();
	}

	public List<Book> GetBooksInBasket() {
		return basket;
	}

//	public void addBook(Book b1) {
//		
//		basket.add(b1);
//	}

}
