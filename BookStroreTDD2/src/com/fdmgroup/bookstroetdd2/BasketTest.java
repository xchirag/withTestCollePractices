package com.fdmgroup.bookstroetdd2;

import static org.junit.Assert.*;

import java.util.List;


import org.junit.Before;
import org.junit.Test;
 class BasketTest {
	
	private Basket basket;
	//private Book b1, b2, b3, b4, b5, b6, b7;
	//private Book 
	
//	@Before
//	public void setup(){
//		//basket = new Basket();
//		//b1 = new Book("aut1", "book1", "2556", 15);
//		//b2 = new Book("aut2", "book2", "14556", 25);
//		//b3 = new Book(authorName, bookName, isbnNumber, price)
//	}
//	
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		//Test code
		//arrange
		//If we ask a basket for its contents before adding any Book objects, we should get an empty List of Books.
		Basket basket = new Basket();// now added into before setup()
		
		//act
		List<Book> baseketedBooks = basket.GetBooksInBasket();
		
		//assert
		assertEquals(0, baseketedBooks.size());
	}

	
//	//If we add a book to the Basket, then number of books in the basket should be equal to one
//
//	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
//		
//		//Test code
//		
//		//arrange : require Basket object & a book object which is added into setup and AddBookMethod() in it
//		basket.addBook(b1);
//		
//		//act
//		basket.GetBooksInBasket();
//		
//		//assert
//	}


}
