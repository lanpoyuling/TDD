package com.example.tdd.entity;

/**
 * @ClassName Student
 * @Description 学生
 * @Author 10932
 * @Date 7/19/2021 5:51 PM
 **/


public class Student {

    private Long id;
    private String name;

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
}
