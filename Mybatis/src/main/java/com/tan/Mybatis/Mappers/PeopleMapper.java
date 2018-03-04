package com.tan.Mybatis.Mappers;

import java.util.List;
import java.util.Map;

import com.tan.Mybatis.entity.People;

public interface PeopleMapper {
	public List<People> findByNameAndAge(Map<String,String > map);
	public List<People> findUseChoose(Map<String,String > map);
	
}
