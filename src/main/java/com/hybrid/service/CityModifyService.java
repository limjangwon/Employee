package com.hybrid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hybrid.dao.CityDao;
import com.hybrid.model.City;

public class CityModifyService {

	CityDao cityDao;
	@Autowired
	public void setCityDao(CityDao Dao) {
		this.cityDao = Dao;
	}
	
	@Transactional
	public int modify(City city) {
		
		cityDao.update(city);
		
		return city.getId();
	}
}