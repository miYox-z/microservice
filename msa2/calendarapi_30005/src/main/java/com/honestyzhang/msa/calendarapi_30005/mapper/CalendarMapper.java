package com.honestyzhang.msa.calendarapi_30005.mapper;


import com.honestyzhang.msa.calendarapi_30005.po.TblCalendar;
import com.honestyzhang.msa.calendarapi_30005.po.ViewUserCalendar;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CalendarMapper {
	//insert
	@Insert("insert into tblCalendar(userId,title,content,ifOK,importance,finishDate)"
			+ " values(#{userId},#{title},#{content},#{ifOK},#{importance},#{finishDate})")
	public int calendarInsert(TblCalendar tblCalendar);
	//delete
	@Delete("delete from tblCalendar where id = #{id}")
	public int calendarDelete(int id);	
	//update
	@Update("update tblCalendar set title=#{title},importance=#{importance},"
			+ "finishDate=#{finishDate} where id =#{id}")
	public int calendarUpdate(TblCalendar tblCalendar);
	//selectOne
	@Select("select * from tblCalendar where id = #{id} order by id desc limit 1 ")
	public TblCalendar calendarSelectOne(int id);	
	//selectAll
	@Select("SELECT tblcalendar.*,tbluser.userName FROM tblcalendar INNER JOIN tbluser ON tblcalendar.userId = tbluser.id order by tblcalendar.id asc limit #{np},#{size}")
	public List<ViewUserCalendar> calendarSelectAll(@Param("np") int np, @Param("size") int size);
}
