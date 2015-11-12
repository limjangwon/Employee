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
	private String countertCode;
	private String district;
	private Integer population;
	
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
	public String getCountertCode() {
		return countertCode;
	}
	public void setCountertCode(String countertCode) {
		this.countertCode = countertCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	
}