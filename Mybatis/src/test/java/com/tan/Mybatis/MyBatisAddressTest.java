package com.tan.Mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tan.Mybatis.Mappers.AddressMapper;
import com.tan.Mybatis.Mappers.StudentMapper;
import com.tan.Mybatis.entity.Address;
import com.tan.Mybatis.entity.Student;
import com.tan.Mybatis.util.SqlSessionFactoryUtil;

public class MyBatisAddressTest {
	private static Logger logger = Logger.getLogger(MyBatisAddressTest.class);
	private SqlSession session = null;
	private AddressMapper mapper = null;
	
	@Before
	public void before() {
		session = SqlSessionFactoryUtil.openSession();
	    mapper = session.getMapper(AddressMapper.class);
	}
	
	@After
	public void after() {
		session.close();
	}
	
	@Test
	public void findAddressWithStus() {
		logger.info("根据id查找学生和地址！");
		Address add =  mapper.findById(1);
		logger.info(add.toString());
	}
}
