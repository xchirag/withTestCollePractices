package com.fdmgroup.bookstroetdd2;

//import org.junit.experimental.theories.Theories;

public class Book {

	private String authorName, bookName, isbnNumber;
	private double price;
	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", bookName=" + bookName + ", isbnNumber=" + isbnNumber + ", price="
				+ price + "]";
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String authorName, String bookName, String isbnNumber, double price) {
		super();
		this.authorName = authorName;
		this.bookName = bookName;
		this.isbnNumber = isbnNumber;
		this.price = price;
	}
	
	// the above method allos sysout(b1) to print all information wihtout worrying about arranging then in output!
//	public static void main(String args[]){
//		Book b1 = new Book();
//		b1.bookName= "chi";
//		b1.isbnNumber ="124";
//		System.out.println(b1);
//	}
	
	
}
