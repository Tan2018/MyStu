package com.tan.Mybatis.entity;

public class Student {
	private Integer id;
	private Integer age;
	private String name;
	private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public Student(Integer id,Integer age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}

}
