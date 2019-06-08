package com.fdmgroup.cataloguetest.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatalogueTest {

	@Mock
	ArrayList<Book> bookDatabase;
	List<Book> bookList;
	
	
	@InjectMocks
	Catalogue catalogueTest;
	
	@Before
	public void setup(){
		
		bookList = new ArrayList<>();
	}
	
	
	@Test
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
		//Test cod
//		Arrange
//		o	You will need a Catalogue object
//		Act
//		o	Call getAllBooks() method of your Catalogue object and store the returned Book list
//		Assert
//		o	Assert that the size of the Book list should be equal to zero
		
		//catalogueTest = new Catalogue();
		List<Book> listB = catalogueTest.GetAllBooks();
		assertEquals(0, listB.size());

	}
	
//When we make a call to the getAllBooks method, it should make a call to the readAll method of the ReadItemCommand.
	
	@Test
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
		ReadItemCommand readItemCommandObject = mock(ReadItemCommand.class);

		catalogueTest.GetAllBooks();
		//when(catalogueTest.GetAllBooks())
		//verify(bookDatabase, times(1)).ReadAllMethod();
		//DatabaseReader mockDatabaseReader =mock(DatabaseReader.class);
		//o	You will need a mock ReadItemCommandObject
		//verify(mockDatabaseReader,times(1)).readQuantity(anyString());

		verify(readItemCommandObject, times(1)).ReadAll(bookList);
	
		
		
		
	}
	
	
	
	

	
	//When we make a call to the getAllBooks method, it should make a call to the readAll method of the ReadItemCommand.
	
//	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
//		//Test code
////		catalogueTest.GetAllBooks();
////		assertEquals(expected, actual);
////		
//		@Mock
//		catalogueTest = new Catalogue();
//		ReadItemCommand readObject = Mockito.mock(Catalogue.class);
//		
//		@InjectMocks
//		readObject
//		
//		catalogueTest.getAllBooks();
//		
//		when(mockDao.getAllEmployees()).thenReturn(employees);
//	}


}
