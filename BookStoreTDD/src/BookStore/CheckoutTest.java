package BookStore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckoutTest {
	private Checkout checkout;
	private Basket basket;
	private Book book0, book1, book2, book3, book4, book5, book6, book7;
	private List<Book> bookList;
	private Book book8, book9;

	@Before
	public void setup() {
		checkout = new Checkout();
		basket = new Basket();
		bookList = new ArrayList<>();
		book0 = new Book("Java", "Doe", 15);
		book1 = new Book("bookName", "George", 25);
		book2 = new Book("Csharp", "Kady Kaga", 25);
		book3 = new Book("C#", "KyuBatau", 25);
		book4 = new Book("vb.net", "Daniel", 25);
		book5 = new Book("asp.net", "Victor", 35);
		book6 = new Book("java.net", "Pazzi", 35);
		book7 = new Book("netFlix", "Zoro", 5);
		book8 = new Book("YouTube", "Money", 5);
		book9 = new Book("webDesign", "Chris", 10); // 205
	}

	// public void test() {
	// fail("Not yet implemented");
	// If the calculatePrice
	// method of the checkout is passed an empty Basket, it should return a
	// price, as a double of 0.0
	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		// test code
		// arrange required checkout object and basket object

		// checkout.calculatePrice(bookList);
		assertEquals(0.00, checkout.calculatePrice(bookList), 0.00);
	}

	// }
	// If the calculatePrice method of
	// checkout is called with a basket with one book in, it should return the
	// price of that one book.
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {

		bookList.add(book0);
		checkout.calculatePrice(bookList);
		assertEquals(15, checkout.calculatePrice(bookList), 0.00);
		// test code

		assertEquals(bookList.get(0).getBookPrice(), checkout.calculatePrice(bookList), 0.01);
	}

	// test 3 for refactoring the code
	// If the calculatePrice method of checkout is called with a basket with two
	// books in,
	// it should return the sum of the price those books.
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBooks() {

		// bookList.clear();
		bookList.add(book0);
		bookList.add(book2);

		checkout.calculatePrice(bookList);
		assertEquals(40, checkout.calculatePrice(bookList), 0.01);
		// test code or as under

		assertEquals((bookList.get(0).getBookPrice() + bookList.get(1).getBookPrice()),
				checkout.calculatePrice(bookList), 0.00);
	}

	// 4: If the calculate price method of checkout is called with a basket
	// three books,
	// it should return the sum of the prices, minus 1%.

	// divided into two parts discount percent and final price

	// following is test for discount percent first

	@Test
	public void test_calculateDiscount_Returns1percent_WhenPassedBasketWithThreeBooks() {

		// book = new Book("bookName", "authorName", 25.3);
		bookList.add(book0);

		// Book book1 = new Book("bookName", "authorName", 18.3);
		bookList.add(book1);

		// Book book2 = new Book("bookName", "authorName", 18.3);
		bookList.add(book2);

		// assertEquals(1, checkout.discountPercent(bookList));
		assertEquals(1, checkout.calculateDiscountPercent(bookList));
	}

	@Test
	public void test_calculateFinalPrice_ReturnsfinalPrice_whichisLessThan1per_WhenPassedBasketWithThreeBooks() {

		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);

		assertEquals(74.25, checkout.calculateFinalPrice(bookList), 0.01);
	}

	@Test
	public void test_calculateFinalPrice_with7books_totalDiscount2percent() {

		// for (int i = 0; i < 10; i++) {
		// bookList.add(book) how to use here***********
		// }
		
//		for (int i = 0; i < bookList.size(); i++) {
//			bookList.add(book[i]);
//		}
//		
		

		bookList.add(book0);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6);

		assertEquals(181.3, checkout.calculateFinalPrice(bookList), 0.01);
	}

	// If the calculate price method of checkout is called with 10 books, it
	// should return the sum of the price of those books, minus a 13% discount.
	// 10% for having ten books, 3% for having three multiples of 3 books

	@Test
	public void test_calculateFinalPrice_with10books_totalDiscount13percent() {

		// for (int i = 0; i < 10; i++) {
		// bookList.add(book) how to use here***********
		// }

		bookList.add(book0);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6);
		bookList.add(book7);
		bookList.add(book8);
		bookList.add(book9);

		assertEquals(178.35, checkout.calculateFinalPrice(bookList), 0.01);
	}

	//@Test
	public void test_calculateFinalPrice_withTENbooks_totalDiscount13percent() {

		for (int i = 0; i < 10; i++) {
			Object temp = "book" + i;
			Book b = (Book) temp;
			bookList.add(b);
		}
		assertEquals(178.35, checkout.calculateFinalPrice(bookList), 0.01);
	}

	@After
	public void teardown() {
		bookList.clear();
	}
}
