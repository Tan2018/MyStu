package com.tan.Mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tan.Mybatis.Mappers.StudentMapper;
import com.tan.Mybatis.entity.Student;
import com.tan.Mybatis.util.SqlSessionFactoryUtil;

public class MyBatisTest {
	private static Logger logger = Logger.getLogger(MyBatisTest.class);
	private SqlSession session = null;
	private StudentMapper mapper = null;
	
	@Before
	public void before() {
		session = SqlSessionFactoryUtil.openSession();
	    mapper = session.getMapper(StudentMapper.class);
	}
	
	@After
	public void after() {
		session.close();
	}
	
	@Test
	public void TestInsert() {
		logger.info("添加！");
		Student student=new Student(11,"李四");
		int result=mapper.add(student);
		session.commit();
		if(result>0){
			logger.info("添加成功！");
		}
	}
	
	@Test
	public void TestUpdate() {
		logger.info("修改！");
		Student student=new Student(124,22,"王八蛋");
		int result=mapper.update(student);
		session.commit();
		if(result>0){
			logger.info("修改成功！");
		}
	}
	
	@Test
	public void TestDelete() {
		logger.info("删除！");
		mapper.delete(127);
		session.commit();
	}
	
	
	@Test
	public void TestFindById() {
		logger.info("根据id查找！");
		Student stu =  mapper.find(123);
		logger.info(stu.toString());
	}
	
	@Test
	public void TestFindAll() {
		logger.info("查找所有！");
		List<Student> stus =  mapper.findAll();
		for(Student s :stus) {
			logger.info(s.toString());
		}
	}

}
