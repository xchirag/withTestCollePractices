package com.fdmgroup.animalkingdom.controller;

import java.util.List;

import com.fdmgroup.animalkingdom.model.Lion;

public interface LionController {
	
	// same contract as LionDatabase because this is a separation layer between
	//following MVC terminologies
	
	public void addLion(Lion lion);
	public void removeLion(int index);
	public Lion getSingleLion(int index);
	public List<Lion> getAllLions();

}
