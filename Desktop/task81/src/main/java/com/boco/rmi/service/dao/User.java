package com.boco.rmi.service.dao;

import java.io.Serializable;

/**
 * Created by 56929 on 2017/5/25.
 */
public class User implements Serializable{
    private static final long seriaVersionUID = 1L;
    private String name;
    private int age;
    public User(){}

    public static long getSeriaVersionUID() {
        return seriaVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
