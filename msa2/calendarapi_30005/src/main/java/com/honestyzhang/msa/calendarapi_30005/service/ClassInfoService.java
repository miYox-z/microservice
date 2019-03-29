package com.honestyzhang.msa.calendarapi_30005.service;


import com.honestyzhang.msa.calendarapi_30005.po.ClassInfo;

public interface ClassInfoService {

    /**
     *
     * @param tblCalendar
     * @return
     */
    public int classInfoInsert(ClassInfo classInfo);
    /**
     *
     * @param id
     * @return
     */
    public int classInfoDelete(int id);

}
