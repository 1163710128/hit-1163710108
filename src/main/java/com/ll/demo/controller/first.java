package com.ll.demo.controller;
import com.ll.demo.pojo.person;
import com.ll.demo.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class first {

    @Autowired
    person person;
    service service;

    @ResponseBody
    @RequestMapping("/hello")
    String Hello(){
        return "Hello World!";
    }

    @RequestMapping("/person")
    ModelAndView getPerson(){
        ModelAndView m = new ModelAndView();
        m.setViewName("person");
        m.addObject("person",person);
//        m.addObject("car",service.getCarName());
        return m;
    }
    //得到数据
    @ResponseBody
    @RequestMapping("/person1")
    Map<String,person> person(){
        Map<String,person> map = new HashMap<>();
        map.put("person",person);
        return map;
    }
}