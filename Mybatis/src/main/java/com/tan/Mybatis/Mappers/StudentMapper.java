package com.tan.Mybatis.Mappers;

import java.util.List;

import com.tan.Mybatis.entity.Student;

public interface StudentMapper {
	//查询或执行的sql接口类
	public int add(Student student);
	public int update(Student student);
	public void delete(Integer id);
	public Student find(Integer id);
	public List<Student> findAll();
	
	public Student findByAddressId(Integer addressId);
	public Student findWithAddress(Integer id);
}
