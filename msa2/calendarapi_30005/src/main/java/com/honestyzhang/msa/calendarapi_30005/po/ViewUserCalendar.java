package com.honestyzhang.msa.calendarapi_30005.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class ViewUserCalendar implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7928426186637217054L;
    //0定义字段
    private int id;
    private int userId;
    private String title;
    private String content;
    private int ifOK;
    private int importance;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date finishDate;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date recordDate;
    private String userName;

    //1定义属性 alt+shift+s

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getIfOK() {
        return ifOK;
    }
    public void setIfOK(int ifOK) {
        this.ifOK = ifOK;
    }
    public int getImportance() {
        return importance;
    }
    public void setImportance(int importance) {
        this.importance = importance;
    }
    public Date getFinishDate() {
        return finishDate;
    }
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
    public Date getRecordDate() {
        return recordDate;
    }
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
    //2封装


    //4构造重载 alt+shift+s

    //5重写toString() alt+shift+s
    @Override
    public String toString() {
        return "ViewUserCalendar{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", ifOK=" + ifOK +
                ", importance=" + importance +
                ", finishDate=" + finishDate +
                ", recordDate=" + recordDate +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
