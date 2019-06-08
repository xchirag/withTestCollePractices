//package com.fdmgroup.animalkingdom.test;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import com.fdmgroup.animalkingdom.controller.LionController;
//import com.fdmgroup.animalkingdom.controller.LionControllerImpl;
//import com.fdmgroup.animalkingdom.model.Lion;
//import com.fdmgroup.animalkingdom.view.AnimalApp;
//
//@RunWith(MockitoJUnitRunner.class)
//public class AnimalAppTest {
//	
//	@InjectMocks
//	private AnimalApp target;
//	
//	@Mock
//	private LionControllerImpl mockLionController;
//	
//	@Mock
//	private Iterator<Lion> mockLionListIterator;
//	
//	@Mock
//	private Lion mockLion;
//	
//	@Mock
//	private List<Lion> mockLionList;
//
//	@Test
//	public void test() {
////		
//		//Lion mockLion = new Lion(25, 250, "India", 7, 12109, "Sheru");
//		//mockLionController = new LionControllerImpl();
//		mockLionList = new ArrayList<>();
////		
////		mockLionList.add(mockLion);
////		mockLionList.add(mockLion);
////		mockLionList.add(mockLion);
//
////		target.displayLion(mockLionController, mockLionListIterator);
////		//when(target.displayLion(mockLionController, mockLionListIterator))
////		verify(mockLionController, times(1)).getSingleLion(1);
//		
//		target.addLion(mockLionController);
//		verify(mockLionController, times(1)).addLion(mockLion);
//	}
//
//}
