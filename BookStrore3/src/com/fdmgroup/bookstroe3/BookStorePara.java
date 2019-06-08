package com.fdmgroup.bookstroe3;

import static org.junit.Assert.*;

//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.*;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import junitparams.converters.Param;
//import junitparams.custom.combined.CombinedParameters;
//import junitparams.mappers.CsvWithHeaderMapper;
//import junitparams.naming.TestCaseName;
//
//
//import static junitparams.JUnitParamsRunner.*;

@RunWith(JUnitParamsRunner.class)
public class BookStorePara {

	@Test
	@Parameters({"1, 2", "2, 4"})
	public void test(final int a, final int b){
		assertEquals(doubleDo(a), b);
	}

	private Object doubleDo(int c) {
		// TODO Auto-generated method stub
		return c*2;
	}
	
	
	
//	@Test
//	  @Parameters({"17, false", 
//	               "22, true" })
//	  public void personIsAdult(int age, boolean valid) throws Exception {
//	    assertThat(new Person(age).isAdult(), is(valid));
//	  }
//	Checkout che = new Checkout();
//	List<Book> bookList = new ArrayList<>();
//	
//	@Test
//	@Parameters(method = "containsParameters")
//	public void testContains_usingNamedMethodParameters(final List<Book> list, final double expected){
//		
//		assertEquals(list., actual);
//	}
//            
//	//@Parameters({ "0, 0" , " 2, 40" , "3, 54.45" })
////	public void test(final List<Book> listofBook, final double actual){
////		
////		
////		actual = che.calculatePrice(bookList);
////		assertEquals(expected, actual, 0.001);
////		
////	}
	

}
