package com.ll.demo.pojo;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@PropertySource(value = "classpath:config/bean.properties")
@Component
@ConfigurationProperties(prefix = "person")
public class person {
    private String name;
    private Map<String,String> map;
    private List<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", map=" + map +
                ", list=" + list +
                '}';
    }
}
