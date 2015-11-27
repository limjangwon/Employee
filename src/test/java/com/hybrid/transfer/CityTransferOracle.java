package com.hybrid.transfer;

import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.hybrid.mapper.CityMapper;
import com.hybrid.mapper.CityMapperTest;
import com.hybrid.model.City;
import com.hybrid.util.Pagination;

public class CityTransferOracle {

   static Log log = LogFactory.getLog(CityMapperTest.class);
   
   public static void main(String[] args) {
      
      GenericXmlApplicationContext ctx = null; 
      ctx = new GenericXmlApplicationContext("spring/beans_mysql.xml","spring/beans_oracle.xml");
      
      CityMapper mysqlCityMapper = (CityMapper) ctx.getBean("mysqlCityMapper");
      CityMapper oracleCityMapper = (CityMapper) ctx.getBean("oracleCityMapper");
      /*
       * Oracle --> MySQL
       */
      int deleteCount = mysqlCityMapper.deleteAll();
      log.info("MySQL City Delete Count = " + deleteCount);
      
      List<City> list = oracleCityMapper.selectAll();
//      	Pagination paging = new Pagination();
//      	paging.setTotalItem(4079);
//      	paging.setPageNo(10);
//      	List<City> list = mysqlCityMapper.selectPage(paging);
      	
      log.info("city = " + list.size());
      
      list.forEach(new Consumer<City>() {

         @Override
         public void accept(City t) {
            System.out.print(".");
            System.out.flush();
            
            if (t.getDistrict()==null)
            	t.setDistrict("");
            
            int rtn = mysqlCityMapper.insert(t);
            log.info("rtn="+rtn);
            
         }
      });
      
      int cityCount = mysqlCityMapper.selectCount();
      log.info("MySQL City Total Count = " + cityCount);
      
      ctx.close();

   }

}