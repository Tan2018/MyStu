package com.tan.Mybatis.Mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.tan.Mybatis.entity.Student;

public interface AnnotationMapper {
	//添加注释不需要写StudentMapper.xml文件了，直接用Insert,Update,Delete,Select注释标签，如果返回的是多个结果集，要注释Results标签。
	@Insert("insert into student value(null ,#{age},#{name},1)")
	public int insert(Student student);
	@Select("select * from student where id = #{id}")
	public Student findById(int id);
	
	@Select("select * from student")
	@Results({
		@Result(id=true,column = "id", property = "id"),
		@Result(column = "name" ,property="name")
	})
	public List<Student> find();
	
}
