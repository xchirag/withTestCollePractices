package BookStore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest1 {
	private Basket basket;
	private List<Book> bookList;
	private Book book;

	@Before
	public void setup(){
		basket = new Basket();
		bookList = new ArrayList<Book>();
		//book = new Book();
	}
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		//Test code
		bookList=  basket.getBooksinBasket();
		//assertEquals(true, bookList.isEmpty());
		//or use as under
		assertEquals(0, bookList.size());
		
		//assertFalse(!bookList.isEmpty());
		//assertEquals(expected, actual);
		
//		if (bookList = null)
//			System.out.println("empty list");
//		else
//			System.out.println("not empty");
	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		//Test code
		
		//arrange
		//need book and basket object
		book = new Book("bookName", "authorName", 25.3);
		basket.addBooksinBasket(book);
		//asserting this whether added or not!
		assertEquals(1, basket.getBooksinBasket().size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithTwoBook(){
		//Test code
		
		//arrange
		//need book and basket object
		book = new Book("bookName", "authorName", 25.3);
		Book book2 = new Book("bookName2", "autho2rName", 5.3);
		basket.addBooksinBasket(book);
		basket.addBooksinBasket(book);
		//asserting this whether added or not!
		assertEquals(2, basket.getBooksinBasket().size());
	}
	
	
}
