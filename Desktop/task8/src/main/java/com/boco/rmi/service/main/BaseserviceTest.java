package com.boco.rmi.service.main;

/**
 * Created by 56929 on 2017/5/25.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.boco.rmi.service.inface.BaseService;

/**
 * Title:BaseserviceTest
 * Description:
 * Copyright:Copyright(c) 2013
 * Company:boco
 * author:zhangtao
 */
public class BaseserviceTest {

    /**
     *Title:main
     *Description:
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BaseService baseService = (BaseService) context.getBean("baseRmiService");
        System.out.println("baseRmiServicee start...........");
    }

}