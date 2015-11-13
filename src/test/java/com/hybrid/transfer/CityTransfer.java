package com.hybrid.transfer;

import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.hybrid.mapper.CityMapper;
import com.hybrid.mapper.CityMapperTest;
import com.hybrid.model.City;

public class CityTransfer {

   static Log log = LogFactory.getLog(CityMapperTest.class);
   
   public static void main(String[] args) {
      
      GenericXmlApplicationContext ctx = null; 
      ctx = new GenericXmlApplicationContext("spring/beans_mysql.xml","spring/beans_oracle.xml");
      
      CityMapper mysqlCityMapper = (CityMapper) ctx.getBean("mysqlCityMapper");
      CityMapper oracleCityMapper = (CityMapper) ctx.getBean("oracleCityMapper");
      
      List<City> list = mysqlCityMapper.selectAll();
      
      log.info("city = " + list.size());
      
      list.forEach(new Consumer<City>() {

         @Override
         public void accept(City t) {
            System.out.print(".");
            oracleCityMapper.insert(t);
            
         }
      });      
      
      ctx.close();

   }

}