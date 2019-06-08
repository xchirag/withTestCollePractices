package BookStore;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.xml.transform.Templates;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {
	
	
	private Basket target = null;
	private ArrayList<Book> temp;
	private int cou = -1;
	
	@Before
	public void setup(){
		target = new Basket();
		temp = new ArrayList<>();
		
	}
	
	@Test
	public void test_ReturnBooks_isZeroatFirst(){
		
		cou = target.returnBooks();
		assertEquals(0, cou);
		//temp.size();
//		if (!temp.isEmpty())
//			System.out.println("this should be empty at beginning");
//		else
//			System.out.println("this is empty as expecte!");
		
		//assertTrue(!temp.isEmpty());
		
		//assertEq
	}
//	//ArrayList<BookModel> basketOfbooks;
//	BookModel testBook; 
//	BasketModel testBasket;
//
//	@Before
//	public void setup() {
//		// TODO Auto-generated constructor stub
//		testBook = new BookModel();
//		testBasket = new BasketModel();
//		//basketOfbooks = new ArrayList<>();
//		
//	}
//	
//	@Test
//	public void whenAddOneBasketQuantityShouldIncreaseByOne() {
//		fail("Not yet implemented");
//		
////		Arrange
//		
////		Act
//		//basketOfbooks.add(testBook);
//		
//		int actual = basketOfbooks.size();
//		
////		Assert
//		//assertEquals(1, ac);
//		assertEquals(1, actual);
//
//	}

}
