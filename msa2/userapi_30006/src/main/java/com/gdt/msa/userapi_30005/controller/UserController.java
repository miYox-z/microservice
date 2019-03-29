package com.gdt.msa.userapi_30005.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {

    @RequestMapping("/userSelectOne")
    public Object userSelectOne(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("有此人，您输入的用户姓名是"+req.getParameter("userId")+",他的用户编号是1,即将返回给您");
        return 1;
    }
}
