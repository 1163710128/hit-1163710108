package com.ll.demo;

import com.ll.demo.config.config;
import com.ll.demo.pojo.person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
    person person;

    @Test
    public void contextLoads() {
        System.out.println(person.toString());
    }

}
