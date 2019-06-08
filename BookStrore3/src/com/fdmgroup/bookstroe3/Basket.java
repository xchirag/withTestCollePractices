package com.fdmgroup.bookstroe3;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	List<Book> basketedBooks = new ArrayList<>();

	public List<Book> getBooksInBasket() {
		return basketedBooks;
	}

	public void addBook(Book b1) {
		basketedBooks.add(b1);
	}

}
