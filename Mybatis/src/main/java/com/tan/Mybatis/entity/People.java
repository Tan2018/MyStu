package com.tan.Mybatis.entity;

public class People {
	private int id;
	private String name;
	private String sex;
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public People(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	
}
