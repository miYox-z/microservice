package com.honestyzhang.msa.calendarapi_30005;

import com.alibaba.fastjson.JSON;
import com.honestyzhang.msa.calendarapi_30005.po.Student;
import com.honestyzhang.msa.calendarapi_30005.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Calendarapi30005ApplicationTests {

    @Autowired
    private StudentService studentService;

    @Test
    //@Transactional
    public void contextLoads() {
        Student student = new Student(
                "test", 20, 1, "20100023", 1L
        );
        studentService.insert(student);
    }

    @Test
    public void test2(){
        Student student = new Student(
                "test", 21, 1, "20100023", 1L
        );
        student.setId(2L);
       studentService.update(student);
    }

    @Test
    public void test3(){
        Student student = studentService.selectOne(2L);
        System.out.println(JSON.toJSONString(student));
    }

    @Test
    public void test4(){
        List<Student> students = studentService.selectAll(0, 10);
        System.out.println(JSON.toJSONString(students));
    }

}
