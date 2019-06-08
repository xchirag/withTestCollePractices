package com.fdmgroup.animalkingdom.model;

public class Lion extends Animal {

	private int familySize, population;
	private String othername;

	public Lion(double height, double weight, String country, int familySize, int population, String othername) {
		super(height, weight, country);
		this.familySize = familySize;
		this.population = population;
		this.othername = othername;
	}

	public int getFamilySize() {
		return familySize;
	}

	public void setFamilySize(int familySize) {
		this.familySize = familySize;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getOthername() {
		return othername;
	}

	public void setOthername(String othername) {
		this.othername = othername;
	}
	
	

}
