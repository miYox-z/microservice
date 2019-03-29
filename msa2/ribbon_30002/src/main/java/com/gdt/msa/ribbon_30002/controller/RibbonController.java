package com.gdt.msa.ribbon_30002.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/calendarInsert")
    public Object calendarInsert(HttpServletRequest request) {
        System.out.println(request.getParameter("userId"));
        return restTemplate.getForObject("http://CLIENT/calendarInsert?userId="+request.getParameter("userId"), String.class);
    }

    @RequestMapping("/calendarSelectAll")
    public Object calendarSelectAll(HttpServletRequest request) {
        String np = (request.getParameter("np"));
        String size = (request.getParameter("size"));
//        Map map=new HashMap();
//        map.put("np",request.getParameter("np"));
//        map.put("size",request.getParameter("size"));
        return restTemplate.getForObject("http://CLIENT/calendarSelectAll?np=" + np + "&size=" + size, String.class);

    }
}
