package com.hybrid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hybrid.dao.CityDao;

public class CityUnRegisterService {

	CityDao cityDao;
	@Autowired
	public void setCityDao(CityDao Dao) {
		this.cityDao = Dao;
	}
	
	@Transactional
	public int unregist(int id) {
		
		cityDao.deleteById(id);
		
		return id;
	}
}