package com.tan.Mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tan.Mybatis.Mappers.AnnotationMapper;
import com.tan.Mybatis.entity.Student;
import com.tan.Mybatis.util.SqlSessionFactoryUtil;

public class AnnotationTest {
	private static Logger logger = Logger.getLogger(MyBatisTest.class);
	private SqlSession session = null;
	private AnnotationMapper mapper = null;
	
	@Before
	public void before() {
		session = SqlSessionFactoryUtil.openSession();
	    mapper = session.getMapper(AnnotationMapper.class);
	}
	
	@After
	public void after() {
		session.close();
	}
	
	@Test
	public void annotationTest() {
		logger.info("添加！");//使用注释添加
		Student student = new Student(11,"注释的值2");
		int result = mapper.insert(student);
		session.commit();
		logger.info(result);
	}
	
	@Test
	public void annotationTestFind() {
		logger.info("查询！");//使用注释添加
		List<Student> ss = mapper.find();
		for(Student s:ss) {
			System.out.println(s);
		}
	}
	
	
	//测试动态sql插入一个数据。
	@Test
	public void insertStuDyna() {
		logger.info("测试动态插入sql数据");
		Student student = new Student(12,"动态注释的值");
		int result = mapper.InsertProviderStu(student);
		session.commit();
		logger.info(result);
	}
	
	//测试动态sql插入一个数据。
		@Test
		public void findStuDyna() {
			logger.info("测试动态查询sql数据");
			Student student = new Student(12,"动态注释的值");
			List<Student> stus = mapper.findProviderStu(student);
			for(Student stu:stus) {
				System.out.println(stu.toString());
			}
		}
	

}
