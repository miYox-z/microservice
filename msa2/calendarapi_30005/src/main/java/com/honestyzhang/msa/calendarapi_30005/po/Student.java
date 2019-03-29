package com.honestyzhang.msa.calendarapi_30005.po;

import java.io.Serializable;

/**
 * @Author: zhuxuelin
 * @CreateTime: 2019-03-29
 * @Description: TODO
 */
public class Student implements Serializable {

    private Long id;
    private String name;
    private Integer age;
    private Integer sex;
    private String cardNumber;
    private Long classId;

    public Student() {
    }

    public Student(String name, Integer age, Integer sex, String cardNumber, Long classId) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.cardNumber = cardNumber;
        this.classId = classId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }
}
