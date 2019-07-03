package com.ll.demo.pojo;

public class car {
    private String name ;

    public car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                '}';
    }
}
