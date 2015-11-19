package com.hybrid.model;

import java.util.Date;
import com.hybrid.exception.PasswordNotMatchingException;

/*
 * Model object
 * Value object
 * Transfer object
 * Beans 1.property ==> setter, getter
 *       2.event
 *       3.기능(method)
 */
public class City {
	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int population;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountrycode() {
		return countryCode;
	}
	public void setcountrycode(String countrycode) {
		this.countryCode = countrycode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
}