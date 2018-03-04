package com.tan.Mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//上传到git
public class SqlSessionFactoryUtil {
	
	private static SqlSessionFactory sqlSessionFactory;
	public static SqlSessionFactory getSqlSessionFactory() {
		if(sqlSessionFactory ==null) {
			InputStream inputStream = null;
			try{
				//从mybatis_conf.xml读取配置文件到inputStream中。Mybatis_conf.xml在class的根目录里面，
				//如果是maven构建的项目则在main/resources目录
				inputStream = Resources.getResourceAsStream("Mybatis_conf.xml");
				//通过inputStream构建session
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
	
	public static SqlSession openSession() {
		return getSqlSessionFactory().openSession();
	}

}
