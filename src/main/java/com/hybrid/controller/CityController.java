package com.hybrid.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hybrid.model.City;
import com.hybrid.model.CityList;
import com.hybrid.model.CityPage;
import com.hybrid.util.Pagination;

@Controller
@RequestMapping("/city")
public class CityController {
   static Log log = LogFactory.getLog(CityController.class);
   
   @RequestMapping("/city.html")
   public String getView() {
      log.info("getView()...");
      
      return "city/city"; // /WEB-INF/view/city/city.jsp
   }
   
   @RequestMapping(value={"", "/"})
   @ResponseBody
   public CityList getCityAll() {
      CityList list = new CityList();
      
      List<City> citys = new ArrayList<City>();
      City city = new City();
      city.setId(100);
      city.setName("seoul");
      citys.add(city);
      
      City city2 = new City();
      city2.setId(200);
      city2.setName("pusan");
      citys.add(city2);
      
      list.setCitys(citys);
      
      return list;
   }
   @RequestMapping("/page/{pageNo}")
   @ResponseBody
   public CityPage getCityPage(@PathVariable int pageNo) {
      
      log.info("pageNo ="+pageNo );
      CityPage citys = new CityPage();
      Pagination paging = new Pagination();
      paging.setPageNo(pageNo);
      paging.setTotalItem(4079);
      citys.setPaging(paging);
      
      return citys;
      
      
      
      
   }
   
   
}