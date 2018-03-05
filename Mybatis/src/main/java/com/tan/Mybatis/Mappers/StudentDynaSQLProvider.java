package com.tan.Mybatis.Mappers;

import org.apache.ibatis.jdbc.SQL;

import com.tan.Mybatis.entity.Student;

public class StudentDynaSQLProvider {
	public String insertStudentDyna(final Student student) {
		//匿名内部类来拼接sql
		return new SQL(){
			//对象实例初始化执行拼接sql，然后用tonString把对象给转为String返回
			{INSERT_INTO("student");
			if(student.getName()!=null) {
				VALUES("name", "#{name}");
			}
			if(student.getAge()!=null) {
				VALUES("age", "#{age}");
			}
			}
		}.toString();
	}
	
	public String findStudents(final Student student) {
		return new SQL(){{
			SELECT("*");
			FROM("student");
			StringBuffer sb = new StringBuffer();
			if(student.getName()!=null) {
				sb.append("and name='"+student.getName()+"'");
			}
			if(student.getAge()!=null) {
				sb.append("and age='"+student.getAge()+"'");
			}
			WHERE(sb.toString().replaceFirst("and", ""));
		}}.toString();
		
	}

}
