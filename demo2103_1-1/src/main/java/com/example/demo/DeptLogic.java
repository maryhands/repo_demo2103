package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class DeptLogic {
	Logger logger = LogManager.getLogger(RestDeptController.class);
	
	public List<Map<String,Object>> jsonDeptList(){
		logger.info("jsonDeptList 호출 성공");
		List<Map<String,Object>> deptList = null;
		deptList = new ArrayList<>();
		Map<String,Object> rmap = new Hashmap<>();
		rmap.put("deptno", 10);
		rmap.put("dname", "영업부");
		rmap.put("loc", "대전");
		deptList.add(rmap);
		rmap.put("deptno", 20);
		rmap.put("dname", "영업부2");
		rmap.put("loc", "대전2");
		deptList.add(rmap);
		rmap.put("deptno", 30);
		rmap.put("dname", "영업부3");
		rmap.put("loc", "대전3");
		deptList.add(rmap);
		
		return deptList;
	}
}
