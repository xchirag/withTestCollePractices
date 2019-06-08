package com.fdmgroup.bookstroe3;


public class Book {
	
	private String bookName, authorName;
	private int year;
	private double price;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String bookName, String authorName, int year, double price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.year = year;
		this.price = price;
	}
	
	

}
