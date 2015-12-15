package com.hybrid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;

import com.hybrid.dao.CityDao;
import com.hybrid.exception.CityRegisterException;
import com.hybrid.model.City;

public class CityRegisterService {

	CityDao cityDao;
	@Autowired
	public void setCityDao(CityDao Dao) {
		this.cityDao = Dao;
	}
	
	@Transactional
	public int regist(City city) {
		int id=0;
		try {
			id = cityDao.insert(city);
		} catch(DataIntegrityViolationException e) {
			throw new CityRegisterException();
		}
		
		return id;
	}
}