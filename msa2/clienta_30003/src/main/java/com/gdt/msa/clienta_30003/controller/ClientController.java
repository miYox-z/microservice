package com.gdt.msa.clienta_30003.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/calendarInsert")
    public Object calendarInsert(HttpServletRequest request) {
        System.out.println(request.getParameter("userId"));
        if (Integer.parseInt(restTemplate.getForObject("http://USEAPI30006/userSelectOne", String.class)) > 0) {
            return restTemplate.getForObject("http://CALENDARAPI30005/calendarInsert?title=t1&content=c2&ifOK=1&importance=90&finishDate=2018-12-12 12:12:12&userId="+request.getParameter("userId"), String.class);
        }
        return -1;
    }

    @RequestMapping("/calendarSelectAll")
    public Object calendarSelectAll(HttpServletRequest request) {
        String np = (request.getParameter("np"));
        String size = (request.getParameter("size"));
        if (Integer.parseInt(restTemplate.getForObject("http://USEAPI30005/userSelectOne", String.class)) > 0) {
            return restTemplate.getForObject("http://CALENDARAPI30006/calendarSelectAll?np=" + np + "&size=" + size, String.class);
        }
        return -1;
    }
}
