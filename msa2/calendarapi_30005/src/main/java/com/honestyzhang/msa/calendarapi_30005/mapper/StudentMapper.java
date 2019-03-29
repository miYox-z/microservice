package com.honestyzhang.msa.calendarapi_30005.mapper;

import com.honestyzhang.msa.calendarapi_30005.po.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: zhuxuelin
 * @CreateTime: 2019-03-29
 * @Description: TODO
 */
@Mapper
public interface StudentMapper {

    @Insert("INSERT INTO student(name,age,sex,card_number,class_id) VALUES(#{name}, #{age}, #{sex}, #{cardNumber}, #{classId})")
    @Results({
            @Result(property = "cardNumber",  column = "card_number"),
            @Result(property = "classId",  column = "class_id")
    })
    int insert(Student student);

    @Delete("DELETE FROM student where id = #{id}")
    int delete(int id);

    @Update("UPDATE student SET name = #{name},age = #{age},sex=#{sex},card_number=#{cardNumber},class_id=#{classId}")
    int update(Student student);

    @Select("SELECT * FROM student where id = #{id}")
    @Results({
            @Result(property = "cardNumber",  column = "card_number"),
            @Result(property = "classId",  column = "class_id")
    })
    Student selectOne(Long id);

    @Select("SELECT * FROM student limit #{np},#{size}")
    @Results({
            @Result(property = "cardNumber",  column = "card_number"),
            @Result(property = "classId",  column = "class_id")
    })
    List<Student> selectAll(@Param("np") int np, @Param("size") int size);
}
