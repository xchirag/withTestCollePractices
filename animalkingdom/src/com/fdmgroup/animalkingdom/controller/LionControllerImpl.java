package com.fdmgroup.animalkingdom.controller;

import java.util.List;

import com.fdmgroup.animalkingdom.dao.LionDatabase;
import com.fdmgroup.animalkingdom.dao.LionDatabaseImpl;
import com.fdmgroup.animalkingdom.model.Lion;

public class LionControllerImpl implements LionController {

	private LionDatabase dependInjLion;
	
	public LionControllerImpl() {
		// TODO Auto-generated constructor stub
		dependInjLion = new LionDatabaseImpl();
	}

	@Override
	public void addLion(Lion lion) {
		// TODO Auto-generated method stub
		dependInjLion.addLion(lion);

	}

	@Override
	public void removeLion(int index) {
		// TODO Auto-generated method stub
		dependInjLion.removeLion(index);

	}

	@Override
	public Lion getSingleLion(int index) {
		// TODO Auto-generated method stub
		//return null;
		return dependInjLion.getSingleLion(index);
	}

	@Override
	public List<Lion> getAllLions() {
		// TODO Auto-generated method stub
		//return null;
		return dependInjLion.getAllLions();
	}

}
