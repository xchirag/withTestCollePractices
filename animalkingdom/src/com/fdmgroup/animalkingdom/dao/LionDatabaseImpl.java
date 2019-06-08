package com.fdmgroup.animalkingdom.dao;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.animalkingdom.model.Lion;

public class LionDatabaseImpl implements LionDatabase {
	
	//private Animal lion;
	private List<Lion> arrOfLion;
	
	public LionDatabaseImpl() {
		// TODO Auto-generated constructor stub
		//lion = new Lion(height, weight, country, familySize, population, othername);
		arrOfLion = new ArrayList<Lion>();
	}

	@Override
	public void addLion(Lion lion) {
		// TODO Auto-generated method stub
		arrOfLion.add(lion);	

	}

	@Override
	public void removeLion(int index) {
		// TODO Auto-generated method stub
		arrOfLion.remove(index);
	}

	@Override
	public Lion getSingleLion(int index) {
		// TODO Auto-generated method stub
		return arrOfLion.get(index);
	}

	@Override
	public List<Lion> getAllLions() {
		// TODO Auto-generated method stub
		return arrOfLion;
	}

}
