package com.fdmgroup.bookstroe3;

import java.util.Iterator;
import java.util.List;

public class Checkout {

	double finalPrice = 0, bookPrice = 0;
	int discountPercent = 0;// = 0;

	public double calculatePrice(List<Book> bookList) {

		double price;
		price = priceOfBook(bookList);
		discountPercent = calculateDiscount(bookList.size());
		finalPrice = price - (price * discountPercent / 100);
		return finalPrice;
	}

	private int calculateDiscount(int size) {

		if (size >= 10)
			discountPercent += 10;

		for (int i = size; i > 0; i--) {
			if (i % 3 == 0)
				discountPercent++;
		}

		return discountPercent;
	}

	private double priceOfBook(List<Book> bookList) {
		// return bookList.get(0).getPrice();

		Iterator<Book> bookIt = bookList.iterator();
		while (bookIt.hasNext())
			bookPrice += bookIt.next().getPrice();
		return bookPrice;
	}

	/*
	 * 	//
	// public double calculatePrice(List<Book> bookList) {
	//
	// double price;
	//
	//// if (bookList.size() == 0)
	//// return 0;
	//// else {
	// price = priceOfBook(bookList);
	// discountPercent = calculateDiscount(bookList.size());
	// finalPrice = price - (price * discountPercent / 100);
	//// }
	// return finalPrice;
	 */
}
