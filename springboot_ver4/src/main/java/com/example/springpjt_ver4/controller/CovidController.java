package com.example.springpjt_ver4.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springpjt_ver4.service.CovidService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/covid")
public class CovidController {

//	public ResponseEntity<Map<String,String>> getIndex(){
//		
//		Map<String,String> resultMap = new HashMap<>();
//		
//		
//		
//		return (ResponseEntity<Map<String, String>>) resultMap;
//	}
	
	@Autowired
	CovidService covidService;
	
	@GetMapping("/index")
	public String index() {
		HashMap<String,Object> paramMap = new HashMap<String,Object>();
		String userid = "111";
		String str = null;
		try {
			paramMap.put("USERID", userid);
			str = covidService.getList(paramMap);
		} catch (Exception e) {
		}
		return str;
	}
	
}

