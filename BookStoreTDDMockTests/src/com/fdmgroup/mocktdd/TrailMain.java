package com.fdmgroup.mocktdd;

public class TrailMain {

public static void main(String args[]){
		
		Catalogue c = new Catalogue();
		WriteItemCommand w = new WriteItemCommand();
		Book mockBook2 = new Book("p", "q", 23, 4, 9);
		c.addBook(mockBook2);
		System.out.println("hi");
		
	}
}
