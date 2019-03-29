package com.honestyzhang.msa.calendarapi_30005.mapper;


import com.honestyzhang.msa.calendarapi_30005.po.ClassInfo;
import com.honestyzhang.msa.calendarapi_30005.po.TblCalendar;
import com.honestyzhang.msa.calendarapi_30005.po.ViewUserCalendar;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClassInfoMapper {
	//insert
	@Insert("insert into t_class(class_id,class_name,class_master,create_time,class_desc,state)"
			+ " values(#{classId},#{className},#{classMaster},#{classDesc},#{createTime},#{state})")
	public int classInfoInsert(ClassInfo classInfo);
	//delete
	@Delete("delete from t_class where class_id = #{id}")
	public int classInfoDelete(int id);

}
