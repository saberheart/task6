package com.jnshu.main;

import com.jnshu.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 56929 on 2017/5/26.
 */
public class StudentTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.print(1);
        StudentService studentService = (StudentService) context.getBean("StudentRmiService");
        System.out.print(2);
    }
}
