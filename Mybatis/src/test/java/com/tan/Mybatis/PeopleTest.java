package com.tan.Mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tan.Mybatis.Mappers.PeopleMapper;
import com.tan.Mybatis.entity.People;
import com.tan.Mybatis.util.SqlSessionFactoryUtil;


public class PeopleTest {
	
	private Logger logger = Logger.getLogger(PeopleTest.class);
	private SqlSession session = null;
	private PeopleMapper mapper = null;
	
	@Before
	public void doStart() {
		session = SqlSessionFactoryUtil.openSession();
		mapper = session.getMapper(PeopleMapper.class);//接口不能直接新建对象，只可以通过反射完成读取方法。
	}
	
	@After
	public void doEnd(){
		session.close();
	}
	
	@Test
	public void testIfandWhere() {
		logger.info("测试if和where");
		Map<String, String> map = new HashMap<String,String >();
		//map.put("name", "娇娇");
		map.put("sex", "m");
		List<People> ps = mapper.findByNameAndAge(map);
		for(People p :ps) {
			logger.info(p);
		}
		
	}
	
	@Test
	public void testChoose() {
		logger.info("测试choose");
		Map<String, String> map = new HashMap<String,String >();
		map.put("searchPro", "sex");
		//map.put("val", "娇娇");
		map.put("val", "m");
		List<People> ps = mapper.findUseChoose(map);
		for(People p :ps) {
			logger.info(p);
		}
		
	}

}
