package com.fdmgroup.bookstroe3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class BasketTest {

	private Basket basket;
	private List<Book> bookList;
	private Book b1, b2;//, b3, b4, b5;
	private Checkout checkout;
	private double price;

	@Before
	public void setUp() {
		basket = new Basket();
		bookList = new ArrayList<>();
		b1 = new Book("book1", "authoer1", 1985, 15);
		b2 = new Book("book2", "author2", 1987, 25);
		checkout = new Checkout();

	}
	
	// public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
	// If we ask a basket for its contents before adding any Book objects, we should get an empty List of Books.
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		bookList = basket.getBooksInBasket();
		assertEquals(0, bookList.size());
	}
	
	//If we add a book to the Basket, then number of books in the basket should be equal to one
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		//Test code
		//arrange for basket object, book object to add and method addBook()
		basket.addBook(b1);
//		bookList = basket.getBooksInBasket();
//		assertEquals(1, bookList.size());
		
		assertEquals(1,basket.getBooksInBasket().size());
	}

	//If we add two books to the Basket, then the number of books in the basket should be equal to 2
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithOneBook(){
		
		basket.addBook(b1);
		basket.addBook(b2);
		
		assertEquals(2, basket.getBooksInBasket().size());
	}

	//If the calculatePrice method of the checkout is passed an empty Basket, it should return a price, as a double of 0.0
	
	@Test
	public void test_CalculatePrice_Returnszero_WhenBasketIsEmpty(){
		
		//have to arrange for Checkout object and calculatePrice() method of it
		
		price = checkout.calculatePrice(bookList);
		assertEquals(0, price,0.001);
	}
	
	//If the calculatePrice method of checkout is called with a basket with one book in, 
	//it should return the price of that one book.
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook(){
		
		//price 
		
		//assertEquals(expected, actual);
		bookList.add(b1);
		assertEquals(bookList.get(0).getPrice(), checkout.calculatePrice(bookList), 0.001);
		
	}
	
	//If the calculatePrice method of checkout is called with a basket with two books in, 
	//it should return the sum of the price those books.
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_WhenPassedBasketWithTwoBook(){
		
		bookList.add(b1);
		bookList.add(b2);
		//checkout.calculatePrice(bookList);
		assertEquals(40, checkout.calculatePrice(bookList), 0.001);
	}
	
	//If the calculate price method of checkout is called with a basket three books, 
	//it should return the sum of the prices, minus 1%.
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_With1percentDiscount_WhenPassedBasketWithThreeBook(){
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b1);
		
		assertEquals(54.45, checkout.calculatePrice(bookList),0.001);
		
	}
	
	//If the calculate price method of checkout is called with a basket 7 books, 
	//it should return the sum of the prices, minus 2%.
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_With2percentDiscount_WhenPassedBasketWithT7Books(){
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b1); // 135 total of these books - 2% = 132.3

		assertEquals(132.3,checkout.calculatePrice(bookList),0.001);
	}
	
	
	//If the calculate price method of checkout is called with 10 books, it should return the sum of the price of those books, minus a 13% discount. 
	//10% for having ten books, 3% for having three multiples of 3 books
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_With13percentDiscount_WhenPassedBasketWith10Books(){
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b1);
		bookList.add(b2); //200 total of these book - 13% = 174
		
		assertEquals(174, checkout.calculatePrice(bookList),0.001);
	}
	
	//Using @Parameter for Field injection instead of Constructor for parameterized tests
	
//	@Parameters
//    public static Collection<Object[]> data() {
//        return Arrays.asList(new Object[][] {
//                 { 0, 0 }, { 2, 40 }, { 3, 54.45 }, { 4, 72.8 }  
//           });
//    }
//
//    @Parameter // first data value (0) is default
//    public /* NOT private */ int fInput;
//	
	
	@After
	public void teardown(){
		basket = null;
		checkout = null;
		bookList = null;
		b1 = b2 = null;
	}
}
