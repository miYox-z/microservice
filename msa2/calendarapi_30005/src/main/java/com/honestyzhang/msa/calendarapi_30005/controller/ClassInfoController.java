package com.honestyzhang.msa.calendarapi_30005.controller;

import com.alibaba.fastjson.JSON;
import com.honestyzhang.msa.calendarapi_30005.po.TblCalendar;
import com.honestyzhang.msa.calendarapi_30005.service.CalendarServivce;
import com.honestyzhang.msa.calendarapi_30005.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.honestyzhang.msa.calendarapi_30005.po.ClassInfo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;

@RestController
public class ClassInfoController {
	
	@Autowired
	private ClassInfoService classInfoService;
	
	@RequestMapping("/deptInsert")
	public Object deptInsert(@RequestBody ClassInfo classInfo) {

      int count = 0;
		try {
			count =	classInfoService.classInfoInsert(classInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}

	@RequestMapping("/deptDelete")
	public Object deptDelete(HttpServletRequest req, HttpServletResponse resp) {
		String id=req.getParameter("id");
		return classInfoService.classInfoDelete(Integer.parseInt(id));
	}
	

}
