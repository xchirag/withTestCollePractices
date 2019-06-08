package com.fdmgroup.animalkingdom.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.xml.bind.helpers.AbstractUnmarshallerImpl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.stubbing.answers.ThrowsException;

import com.fdmgroup.animalkingdom.model.Animal;
import com.fdmgroup.animalkingdom.model.Lion;

public class AnimalTest {
		
	@InjectMocks
	private Lion target;
	
	@Before
	public void setup() {
		
		target = new Lion(15, 250, "india", 7, 2578, "shera");
	}
	@Test
	public void test_GetFamilySizeMethodofAnimal_whenCalledReturnsIntegerValue(){
		assertEquals(7, target.getFamilySize());
		
		
		//verify(target, times(1)).getFamilySize(); this will not work as verify only takes mocks not the actual objects
		
		// to think logically we have follow arrange, act and assert steps
		// arrange an ojbect of the class Lion which is done @InjectMocks
		// have to initialise the Lion with some data under setup()
		// otherwise there will be null pointer error!
		
		// act and getFamilySize() which should be = number of familySize done in setup();
		
		// assert that value with that afterwards!
	}
	
	@Test
	public void test_whenSetFamilySizeMethodofAnimalCalled_itSetsValueOfFamilSize(){
		
		target.setFamilySize(55);
		assertEquals(55, target.getFamilySize());
	}
	
	@Test
	public void test_WhenGetOtherNameMethodcalls_itReturnsStringValue(){

//		when(target.getOthername()).thenReturn("familySize");
//		String expected = "familySize";
//		assertEquals(expected, target.getOthername());
		//not a mock error!

		target.setOthername("OtherName");
		assertEquals("OtherName", target.getOthername());
	}
	
	//@Test (expected = IllegalStateException.class)
//	public void test_SetPopulationMethodonlyTakesPositiveIntegerValues(){
//		doThrow(IllegalStateException.class)
//		.when(target)
//		.setPopulation(23);
//		
//		target.setPopulation(23);
//		
//	}
	
	@Test
	public void test_test(){
		target.setPopulation(2490);
		assertEquals(2490, target.getPopulation());
	}
}
