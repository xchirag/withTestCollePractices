package com.fdmgroup.mocktdd;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
import org.mockito.runners.MockitoJUnitRunner;


//import com.fdmgroup.javaWeek1Assessment.Trainee;

@RunWith(MockitoJUnitRunner.class)
public class CatalogueTest2 {

	@Mock
	ReadItemCommand mockReader;
	@Mock
	WriteItemCommand mockWriter;
	@Mock
	List<Book> mockList;
	@Mock
	Book mockBook, mockBook2;
	
	

	@InjectMocks
	Catalogue target;

	@Before
	public void setup() {
		mockBook2 = new Book("title", "author", 123, 234, 25);
		mockBook = mock(Book.class);
	}

	// // If we ask the catalogue to give us a list of all items when there are
	// // none, it should return an empty list.
	@Test
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {

		// System.out.println(target.getAllBooks().size());
		assertEquals(0, target.getAllBooks().size());
	}

	// When we make a call to the getAllBooks method, it should make a call to
	// the readAll method of the ReadItemCommand.
	@Test
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled() {
		// Test code
		target.getAllBooks();
		verify(mockReader, times(1)).readAll();
	}

	// If we make a call to getAllBooks command and it receives a List of books
	// from the readAll method of the ReadItemCommand,
	// it should return that same List.

	@Test
	public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled() {
		List<Book> temp = mockReader.readAll();
		mockList = target.getAllBooks();
		assertEquals(mockList, temp);

	}

	// The add book method of Catalogue should make a call to the insertItem
	// method of WriteItemCommand
	
	
	@Test
	public void test_testAddBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled(){
		target.addBook(mockBook);
		//verify(mockWriter, times(1)).insertItem(mockBook);
		verify(mockWriter, times(1)).insertItem(any(Book.class));
		//when(mockWriter.insertItem(mockBook)
	}
	
	
	@Test
	public void test_testAddBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled_2ndWay(){
		
		//Mockito.verify(target.addBook(mockBook), times(1)).insertItem(mockBook);
		//act
		target.addBook(mockBook);
		
		//assert
		verify(mockWriter, times(1)).insertItem(mockBook);
	
	}
	@Test
	public void test_AddBook_CallsInsertItemMethod_of_WriterItemCommand_WhenCalled(){
		
		mockWriter.insertItem(new Book());
		Mockito.verify(mockWriter, times(1)).insertItem(any(Book.class));
	}
	
	
//	public void test_AddBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled() {
//		target.addBook(mockBook);
//		verify(mockWriter, times(1)).insertItem(mockBook);
//		
//	}
		/*
		 * @Test
	public void test_AddTraineeMethod_CallsAddTraineeMethodOfDatabaseWriter_WhenCalled(){
		traineeGroupController.addTrainee(mockTrainee);
		verify(mockWriter, times(1)).addTrainee(any(Trainee.class));
	}
	
	
	@Test
	public void test_AddTraineeMethod_CallsAddTraineeMethodOfDatabaseWriterPassingTraineeObjectDefinedAsInput_WhenCalled(){
		traineeGroupController.addTrainee(mockTrainee);
		verify(mockWriter, times(1)).addTrainee(mockTrainee);
		 */
		
		// Test code

				//book = new Book("titl2", "aut", 456, 223, 90);
				//System.out.print(target.addBook(book));
				//mockWriter.insertItem(new Book());
				//Mockito.verify(mockWriter, times(1)).insertItem(book);
				
				//target.addBook(book);
				//verify(mockWriter, times(1)).insertItem(Book.class);
		
	

}
