package com.fdmgroup.animalkingdom.dao;

import java.util.List;

import com.fdmgroup.animalkingdom.model.Lion;

public interface LionDatabase {
	
//LionDatabase has four contracts with implimented classes as under
	
public void addLion(Lion lion);
public void removeLion(int index);
public Lion getSingleLion(int index);
public List<Lion> getAllLions();

// the above contract must be implemented by the class 

}
