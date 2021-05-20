package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class ZipCodeDao {
	Logger logger = LogManager.getLogger(ZipCodeController.class);
	private static final String NAMESPACE= "com.example.demo.";
	@Autowired(required = false)
	private SqlSession sqlsession = null;
	public List<Map<String, Object>> getZipCodeLst(){
		logger.info("getZipCdeList 호출 성공");
		List<Map<String,Object>> zipList = null;
		return zipList;
		Map<String,Object> rmap = new HashMap<>();
		rmap.put("mem_name","이순신");
		zipList.add(rmap);
		rmap = null;
		rmap = new HashMap<>();
		rmap.put("good_name", "비누");
		zipList.add(rmap);
		return zipList;

		
	}
}
