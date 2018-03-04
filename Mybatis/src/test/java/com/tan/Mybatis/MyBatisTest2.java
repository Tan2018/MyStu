package com.tan.Mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tan.Mybatis.Mappers.StudentMapper;
import com.tan.Mybatis.entity.Student;
import com.tan.Mybatis.util.SqlSessionFactoryUtil;

public class MyBatisTest2 {
	private static Logger logger = Logger.getLogger(MyBatisTest2.class);
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
	public void TestFindByIdWithAddress() {
		logger.info("根据id查找学生和地址！");
		Student stu =  mapper.findWithAddress(123);
		logger.info(stu.toString());
	}
	
	public void findAddressWithStus() {
		logger.info("根据id查找学生和地址！");
		Student stu =  mapper.findWithAddress(123);
		logger.info(stu.toString());
	}

}
