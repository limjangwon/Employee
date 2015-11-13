package com.hybrid.model;

import java.util.List;

/*
 * Model object
 * Value object
 * Transfer object
 * Beans 1.property ==> setter, getter
 *       2.event
 *       3.기능(method)
 */
public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	private List<Emp> emps; //Has-many
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	
}