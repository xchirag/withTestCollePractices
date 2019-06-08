package com.fdmgroup.mocktdd;


public class Book {

	private String title, author;
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
	public int getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(int isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(){
		
	}
	private int isbnNumber, totalPages;
	private double price;
	public Book(String title, String author, int isbnNumber, int totalPages, double price) {
		super();
		this.title = title;
		this.author = author;
		this.isbnNumber = isbnNumber;
		this.totalPages = totalPages;
		this.price = price;
	}

	
	
	
}
