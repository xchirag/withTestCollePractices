//package com.fdmgroup.mocktdd;
//
//import org.mockito.*;
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.lang.annotation.Target;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//
//
//
//@RunWith(MockitoJUnitRunner.class)
//public class CatalogueTest {
//
//	//private Catalogue target;// = new Catalogue();
//	//private ReadItemCommand mockReader;
//	//private List<Book> mockList;
//	
//	@Mock
//	ReadItemCommand mockReader;
//	List<Book> mockList;
//	
//	@InjectMocks
//	Catalogue target;
//	
//	@Before
//	public void setup() {
//
//		//target = new Catalogue();
//		//mockReader = mock(ReadItemCommand.class);
//		//mockList = mock(List.class);
//		when(mockReader.readAll()).thenReturn(mockList);
//	}
//
//	// If we ask the catalogue to give us a list of all items when there are
//	// none, it should return an empty list.
//	@Test
//	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {
//		// Test code
//		//assertEquals(0, target.getAllBooks().size());
//		// when(mockMap.size()).thenReturn(0);
//		//Map<String, Trainee> allTrainees = traineeGroupController.getAllTrainees();
//		//assertEquals(0, allTrainees.size());
//		//assertNull(target.getAllBooks());
//		//when(mockReader.readGroup()).thenReturn(mockMap);
//		
//		when(mockList.size()).thenReturn(0);
//		List<Book> mockList1 = target.getAllBooks();
//		assertEquals(0, mockList1.size());
//		
//		
//	}
//
//	// When we make a call to the getAllBooks method, it should make a call to the readAll method of the ReadItemCommand.
//	
//	@Test
//	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
//		//Test code
//		
//		target.getAllBooks();
//		verify(mockReader, times(1)).readAll();
//	}
//
//}
