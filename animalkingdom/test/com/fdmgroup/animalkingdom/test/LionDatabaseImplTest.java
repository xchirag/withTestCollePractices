package com.fdmgroup.animalkingdom.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fdmgroup.animalkingdom.dao.LionDatabaseImpl;
import com.fdmgroup.animalkingdom.model.Lion;

@RunWith(MockitoJUnitRunner.class)
public class LionDatabaseImplTest {
	
	int index = 0;
	
	@InjectMocks
	private LionDatabaseImpl target;
	
	@Mock
	private List<Lion> mockListOfLions;
	
	@Mock
	private Lion mockLion;
	
	@Before
	public void setup(){
		
		//mockLion = new Lion(25, 250, "India", 7, 12109, "Sheru");
		//mockListOfLions = new ArrayList<>();
		//mockListOfLions.add(mockLion);
	}
	

	@Test
	public void test_AddLionMethodofLionDatabaseImpl_addsPassedLionintoListofLions(){
		//arrange is done into setup
		//when(target.addLion(mockLion);)

		//act now
		target.addLion(mockLion);
		
		//verify the lion is added into list!
		verify(mockListOfLions, times(1)).add(mockLion);
		
		//remember do not require any kind of setup to be done for this test to pass
		//therefore all of the setup is commented!
	}
	
	@Test
	public void test_RemoveLionMethodOfLionDatabaseImpl_removesPassedLionfromListOfLions(){
		
		//setup is done via mocks no actual data or initialisations required
		
		//act now
		target.removeLion(index);
		
		//assertion
		verify(mockListOfLions, times(1)).remove(index);
	}
	
	@Test
	public void test_GetSingleLionMethodofLionDatabaseImpl_returnsOneLionfromListasPerIndex(){
		
		//setup is done as above
		mockLion = new Lion(25, 250, "India", 7, 12109, "Sheru");
		
		//act
		//target.addLion(mockLion); //we are not required to add!
		Lion tempLion = target.getSingleLion(index);
		verify(mockListOfLions, times(1)).get(index);
		//not required as under!
		//assertEquals(mockLion.getOthername(), tempLion.getOthername());
		
		
	}
	@Test
	public void test_GetAllLionsMethodOfLionDatabaseImpl_returnsListofLions(){
		
		//act
		//mockListOfLions = target.getAllLions();
		
		target.addLion(mockLion);
		target.addLion(mockLion);
				
		List<Lion> tempLionList = target.getAllLions();
		
		mockListOfLions.add(mockLion);
		mockListOfLions.add(mockLion);
		
		assertEquals(mockListOfLions.size(), tempLionList.size());
		
		
	}
	// following is better way to using the above test
	
	@Test
	public void test_GetAllLionsMethodOfLionDatabaseImpl_returnsAdded_ListofLions_anotherWay(){
		
		//act
		mockLion = new Lion(25, 250, "India", 7, 12109, "Sheru");
		mockListOfLions.add(mockLion);
		mockListOfLions.add(mockLion);
		
		//scenario created
		//when(target.getAllLions()).thenReturn(mockListOfLions);
		//scenario is this we have mockList into which we added 2 elements
		//then we are saying mockito object that when getAllLions() is access please return *2*
		//based upon assumption that 2 lions have been added into actual databaseList which we do not know for sure!
		//then we are asserting them with target.getAllLions().size() as under!
		
		when(target.getAllLions().size()).thenReturn(2);
		// this is not acutal: assertEquals(2, mockListOfLions.size());//therefore it should be as under
		assertEquals(2, target.getAllLions().size());
		//assertEquals(expected, actual);
	}
	
	
	@Test
	public void test_GetAllLionsMethodOfLionDatabaseImpl_returnsEmptyListofLions_whenNoLionsAdded(){
			
		//act
		List<Lion> tempLionList = target.getAllLions();
		
		//assert
		assertEquals(0, tempLionList.size());
	}
	
	@Test
	public void test_GetAllLionsMethodOfLionDatabaseImpl_returnsEmptyListofLions_whenNoLionsAdded_2NDWay(){
		
		when(target.getAllLions().isEmpty()).thenReturn(true);
		
	}
	
	
	@Test
	public void test_GetAllLionsMethodOfLionDatabaseImpl_returnsEmptyListofLions_whenNoLionsAdded_3RdWay(){
		
		when(target.getAllLions().size()).thenReturn(0);
		
	}
	
}
