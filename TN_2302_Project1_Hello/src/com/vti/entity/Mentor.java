package com.vti.entity;

public class Mentor extends Person {

	private int yearsofexperience;

	public void intro() {
		System.out.println("id: " + super.getId());
		System.out.println("name" + super.getName());
		System.out.println("address: " + super.getAddress());
		System.out.println("yearsofexperience: " + this.yearsofexperience);
	}

	public int getYearsofexperience() {
		return yearsofexperience;
	}

	public void setYearsofexperience(int yearsofexperience) {
		this.yearsofexperience = yearsofexperience;
	}

};