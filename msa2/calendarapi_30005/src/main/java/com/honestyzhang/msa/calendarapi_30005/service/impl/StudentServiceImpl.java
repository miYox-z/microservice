package com.honestyzhang.msa.calendarapi_30005.service.impl;

import com.honestyzhang.msa.calendarapi_30005.mapper.StudentMapper;
import com.honestyzhang.msa.calendarapi_30005.po.Student;
import com.honestyzhang.msa.calendarapi_30005.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhuxuelin
 * @CreateTime: 2019-03-29
 * @Description: TODO
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int delete(int id) {
        return studentMapper.delete(id);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public Student selectOne(Long id) {
        return studentMapper.selectOne(id);
    }

    @Override
    public List<Student> selectAll(int np, int size) {
        return studentMapper.selectAll(np, size);
    }
}
