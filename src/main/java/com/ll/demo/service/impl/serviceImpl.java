package com.ll.demo.service.impl;

import com.ll.demo.config.config;
import com.ll.demo.pojo.person;
import com.ll.demo.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements service {

    @Autowired
    config config;
    person person;

    @Override
    public String getCarName() {
        return config.getCar().getName();
    }

    @Override
    public String getPersonName() {
        return person.getName();
    }
}
