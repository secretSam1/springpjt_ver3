package com.example.springpjt_ver4.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CovidMapper {

	String getUserDetail(HashMap<String,Object> paramMap);
	
}
