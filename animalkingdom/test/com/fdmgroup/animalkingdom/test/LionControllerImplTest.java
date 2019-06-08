package com.fdmgroup.animalkingdom.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fdmgroup.animalkingdom.controller.LionControllerImpl;
import com.fdmgroup.animalkingdom.dao.LionDatabase;
import com.fdmgroup.animalkingdom.model.Lion;

@RunWith(MockitoJUnitRunner.class)
public class LionControllerImplTest {

	int index = 0;
	
	@InjectMocks
	LionControllerImpl target;
	
	@Mock
	private LionDatabase mockLionDatabase;
	
	@Mock
	private Lion mockLion;
	
	@Before
	public void setup(){
		
		//int index = 0;
	}
	@Test
	public void test_AddLionMethodofLionControllerImpl_Calls_addLionMethodofLionDatabase() {
		//fail("Not yet implemented");
		//when(target.addLion(mockLion))
		//when then scenario is only available with methods which are returning something back!
		// therefore verify whether the method accessed or not by accessing the method as under
		//first access the mehtod then use VERIFY
		
		target.addLion(mockLion);
		verify(mockLionDatabase, times(1)).addLion(mockLion);
	}

	@Test
	public void test_removeLionMethodOfLionControllerImpl_Calls_removeLionMethodofLionDatabase(){
		//int index = 0;
		target.removeLion(index);
		verify(mockLionDatabase, times(1)).removeLion(index);
	}
	
	
	@Test
	public void test_getSingleLionMethodOfLionControllerImpl_Calls_getSingleLionofLionDatabase(){
		target.getSingleLion(index);
		verify(mockLionDatabase, times(1)).getSingleLion(index);
	}
	
	@Test
	public void test_getAllLionsMethodOfLionControllerImpl_Calls_getAllLionsofLionDatabase(){
		
		target.getAllLions();
		verify(mockLionDatabase, times(1)).getAllLions();
	}
	
}
