package main;

import inface.BaseService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 56929 on 2017/5/24.
 */
public class BaseserviceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BaseService baseService = (BaseService) context.getBean("baseRmiservice");
        System.out.print("baseRmiService start...........");
    }
}
