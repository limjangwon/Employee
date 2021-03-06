package com.hybrid.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.hybrid.model.Dept;

public class DeptUnRegisterServiceTest {

	static Log log = LogFactory.getLog(DeptUnRegisterServiceTest.class);
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=null;
		ctx = new GenericXmlApplicationContext("spring/beans_oracle.xml");
		
		DeptUnRegisterService service = ctx.getBean(DeptUnRegisterService.class);

		Dept dept = new Dept();
		dept.setDeptno(71);
		
//		service.unregist(dept);
		service.unregist(70);
		
		ctx.close();
	}

}
