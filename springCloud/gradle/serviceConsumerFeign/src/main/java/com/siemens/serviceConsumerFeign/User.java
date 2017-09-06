package com.siemens.serviceConsumerFeign;

/**
 * Created by h7gsbw on 9/5/2017.
 */
public class User {
    public User() {
    }

    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
