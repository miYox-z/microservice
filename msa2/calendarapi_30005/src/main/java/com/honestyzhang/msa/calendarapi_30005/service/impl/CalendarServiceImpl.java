package com.honestyzhang.msa.calendarapi_30005.service.impl;


import com.honestyzhang.msa.calendarapi_30005.mapper.CalendarMapper;
import com.honestyzhang.msa.calendarapi_30005.po.TblCalendar;
import com.honestyzhang.msa.calendarapi_30005.po.ViewUserCalendar;
import com.honestyzhang.msa.calendarapi_30005.service.CalendarServivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarServivce {
	
	//定义一个生产部分
	//CalendarMapper calendarMapper=new CalendarMapper();
	@Autowired
	private CalendarMapper calendarMapper;
	
	@Override
	public int calendarInsert(TblCalendar tblCalendar) {
		// TODO Auto-generated method stub
		return calendarMapper.calendarInsert(tblCalendar);
	}

	@Override
	public int calendarDelete(int id) {
		// TODO Auto-generated method stub
		return calendarMapper.calendarDelete(id);
	}

	@Override
	public int calendarUpdate(TblCalendar tblCalendar) {
		// TODO Auto-generated method stub
		return calendarMapper.calendarUpdate(tblCalendar);
	}

	@Override
	public TblCalendar calendarSelectOne(int id) {
		// TODO Auto-generated method stub
		return calendarMapper.calendarSelectOne(id);
	}

	/**
	 * 页面传递过来的数字是np
	 * 但是业务层需要对np进行操控,使其-1
	 */
	@Override
	public List<ViewUserCalendar> calendarSelectAll(int np, int size) {
		// TODO Auto-generated method stub
		return calendarMapper.calendarSelectAll((np-1)*size, size);
	}

}
