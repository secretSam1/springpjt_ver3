package com.example.springpjt_ver4.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springpjt_ver4.mapper.CovidMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CovidService {

	@Autowired
	private CovidMapper covidMapper; 
	
	public String getList(HashMap<String,Object> paramMap) {
		return covidMapper.getUserDetail(paramMap);
	}
	
}
