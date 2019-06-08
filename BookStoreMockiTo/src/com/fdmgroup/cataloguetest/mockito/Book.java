package com.fdmgroup.cataloguetest.mockito;

public class Book {

//	title, an author, a unique ISBN number, a price and the number of pages the book contains.
	
	private String title, author;
	private Long isbnNumber;
	private double price;
	private int numberOfPages;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Long getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(Long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Book(String title, String author, Long isbnNumber, double price, int numberOfPages) {
		super();
		this.title = title;
		this.author = author;
		this.isbnNumber = isbnNumber;
		this.price = price;
		this.numberOfPages = numberOfPages;
	}
	
	
}
