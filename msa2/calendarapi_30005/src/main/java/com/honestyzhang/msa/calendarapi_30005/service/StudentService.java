package com.honestyzhang.msa.calendarapi_30005.service;

import com.honestyzhang.msa.calendarapi_30005.po.Student;

import java.util.List;

/**
 * @Author: zhuxuelin
 * @CreateTime: 2019-03-29
 * @Description: TODO
 */
public interface StudentService {

    int insert(Student student);


    int delete(int id);



    int update(Student student);


    Student selectOne(Long id);


    List<Student> selectAll(int np, int size);
}
