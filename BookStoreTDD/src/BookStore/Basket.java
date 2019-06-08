package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<Book> basketOfbooks;
	private static int countBooks = 0;
	
	
	public List<Book> getBooksinBasket() {
		// TODO Auto-generated method stub
		//return null;
		return this.basketOfbooks;
	}
	
	public Basket(){
		basketOfbooks = new ArrayList<Book>();
	}

	public List<Book> getBasketOfbooks() {
		return basketOfbooks;
	}

	public void setBasketOfbooks(ArrayList<Book> basketOfbooks) {
		this.basketOfbooks = basketOfbooks;
	}
	
	public void addBooksinBasket(Book bm){
		
		basketOfbooks.add(bm);
		countBooks++;
		
	}

	public int returnBooks() {
		// TODO Auto-generated method stub
		//return 0;
//		if (basketOfbooks.isEmpty())
//			return 0;
//		else
//			return (basketOfbooks.size());
		
		return countBooks;
	}


//	public ArrayList<BookModel> returnBooks() {
//		// TODO Auto-generated method stub
//		
//		return basketOfbooks;
//		
//	}

//	public ArrayList<BookModel> returnBooks() {
//		// TODO Auto-generated method stub
//		// return null;
//		if (!basketOfbooks.isEmpty())
//				return basketOfbooks;
//		else
//				return null;
//	}
	
	
	
	
}
