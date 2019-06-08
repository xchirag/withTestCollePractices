package com.fdmgroup.animalkingdom.model;

public abstract class Animal {
	private double height, weight;
	private String country;
	

	public Animal(double height, double weight, String country) {
		super();
		this.height = height;
		this.weight = weight;
		this.country = country;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
