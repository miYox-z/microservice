package com.honestyzhang.msa.calendarapi_30005.service.impl;


import com.honestyzhang.msa.calendarapi_30005.mapper.ClassInfoMapper;
import com.honestyzhang.msa.calendarapi_30005.po.ClassInfo;
import com.honestyzhang.msa.calendarapi_30005.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassInfoServiceImpl implements ClassInfoService{

     @Autowired
    private ClassInfoMapper classInfoMapper;

    public int classInfoInsert(ClassInfo classInfo){

      return  classInfoMapper.classInfoInsert(classInfo);
    }


    public int classInfoDelete(int id){

        return classInfoMapper.classInfoDelete(id);

    }



}
