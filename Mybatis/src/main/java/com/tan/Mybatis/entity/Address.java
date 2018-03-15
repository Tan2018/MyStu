package com.tan.Mybatis.entity;

import java.util.List;

/**
 * 
 * @author tan
 *
 */
public class Address {
	private int id;
	private String sheng;
	private String shi;
	private List<Student> stus;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String sheng, String shi) {
		super();
		this.sheng = sheng;
		this.shi = shi;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSheng() {
		return sheng;
	}
	public void setSheng(String sheng) {
		this.sheng = sheng;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	
	public List<Student> getStus() {
		return stus;
	}

	public void setStus(List<Student> stus) {
		this.stus = stus;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", sheng=" + sheng + ", shi=" + shi + ", stus=" + stus + "]";
	}

}
