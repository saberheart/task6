package com.boco.rmi.service.dao;

/**
 * Created by 56929 on 2017/5/25.
 */
import java.io.Serializable;

/**
 * Title:User
 * Description:
 * Copyright:Copyright(c) 2013
 * Company:boco
 * author:zhangtao
 */
public class User implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    private String name;
    /**
     * age
     */
    private int age;
    /**
     *
     */
    public User(){};
    /**
     * @param name
     * @param age
     */
    public User(String name, int age){
        this.name= name;
        this.age=age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }


}