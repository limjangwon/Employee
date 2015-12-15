package com.hybrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hybrid.dao.CityDao;
import com.hybrid.model.City;
import com.hybrid.model.CityList;

public class CityListService {
	CityDao cityDao;
	@Autowired
	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	public CityList getList() {
		List<City> citys = cityDao.selectAll();
		CityList rtn = new CityList();
		rtn.setCitys(citys);
		
		return rtn;
	}
}
