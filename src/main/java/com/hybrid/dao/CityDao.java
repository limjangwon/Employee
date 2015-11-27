package com.hybrid.dao;

import java.util.List;

import com.hybrid.mapper.CityMapper;
import com.hybrid.model.City;
import com.hybrid.util.Pagination;

public class CityDao {
	CityMapper cityMapper;
	
	public void setCityMapper(CityMapper mapper) {
		this.cityMapper = mapper;
	}
	
	public int selectCount(){
		return 0;
	}
	public List<City> selectAll() {
		return null;
	}
	public List<City> selectPage(Pagination paging){
		return null;
	}
	public List<City> selectByCountryCode(String countryCode){
		return null;
	}
	
	public int insert(City city){
		return 0;
	}
	public int deleteAll(){
		return 0;
	}
}