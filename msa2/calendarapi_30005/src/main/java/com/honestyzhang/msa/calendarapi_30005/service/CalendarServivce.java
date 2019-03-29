package com.honestyzhang.msa.calendarapi_30005.service;



import com.honestyzhang.msa.calendarapi_30005.po.*;

import java.util.List;

/**
 * 
 * author laozhang
 * date 20180418
 * descritpion:xxx
 */
public interface CalendarServivce {
	/**
	 * 
	 * @param tblCalendar
	 * @return
	 */
	public int calendarInsert(TblCalendar tblCalendar);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int calendarDelete(int id);	
	
	/**
	 * 
	 * @param tblCalendar
	 * @return
	 */
	public int calendarUpdate(TblCalendar tblCalendar);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public TblCalendar calendarSelectOne(int id);	
	/**
	 * 
	 * @param np
	 * @param size
	 * @return
	 */
	public List<ViewUserCalendar> calendarSelectAll(int np, int size);
}
