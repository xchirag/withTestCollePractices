package BookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.xml.transform.Templates;

public class Checkout {

	private List<Book> basket;
	double totalPrice, finalPrice;
	int discountPercent;
	double tempCalPrice;

	public Checkout() {
		basket = new ArrayList<Book>();
//		totalPrice = 0.0;
//		finalPrice = 0.0;
//		discountPercent = 0;
	}

	// public double calculatePrice(List<Book> basket) {
	// this.basket = basket;
	// totalPrice = 0.0;
	// if (basket.size() == 0) {
	// return 0;
	// } else {
	// ListIterator<Book> basketIterator = basket.listIterator();
	// while (basketIterator.hasNext())
	// totalPrice += basketIterator.next().getBookPrice();
	// // basketCheckout.
	// return totalPrice;
	// }

	// above code refactored as under:
	
	public double calculatePrice(List<Book> basket) {
		this.basket = basket;
		totalPrice = 0.0;
		ListIterator<Book> basketIterator = basket.listIterator();
		while (basketIterator.hasNext())
			totalPrice += basketIterator.next().getBookPrice();
		// basketCheckout.
		return totalPrice;
	}
	
	public int calculateDiscountPercent(List<Book> basket){
		
		this.basket = basket;
		int numberOfBooks = basket.size();
		//discountPercent = 0;
		
//		ListIterator<Book> basketIterator = basket.listIterator();
//		while (basketIterator.hasNext()){
//			if (numberOfBooks%3 == 0){
//				discountPercent++;
//			}
//		}
		
		for(int x=1; x<=numberOfBooks;x++){
			if(x%3 == 0)
				discountPercent++;
		}
		
		if (numberOfBooks >= 10)
			discountPercent += 10;
			//totalPrice += basketIterator.next().getBookPrice();
		// basketCheckout.
			
		return discountPercent;
		
	}

	public double calculateFinalPrice(List<Book> basket){
		
		this.basket = basket;
		double tempCalPrice = calculatePrice(basket);
		int tempDisPer= calculateDiscountPercent(basket);
		finalPrice = tempCalPrice-(tempCalPrice*tempDisPer/100);
		return finalPrice;
	}
	

}
