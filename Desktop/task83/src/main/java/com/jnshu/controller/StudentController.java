package com.jnshu.controller;

import com.jnshu.model.Student;
import com.jnshu.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by 56929 on 2017/5/26.
 */
@Controller
@RequestMapping("/task8")
public class StudentController {
    private Logger log = Logger.getLogger(StudentController.class);

    @Qualifier("studentServiceImpl")
    @Resource
    private StudentService studentService;
    @RequestMapping(value = "/t8",method = RequestMethod.GET)
    public String list(Model model){
        log.info("查询所有用户信息");
        List<Student> studentList = null;
        try {
            studentList = studentService.getAllStudent();
        }catch (RemoteException e){
            e.printStackTrace();
        }
        model.addAttribute("studentlist",studentList);
        return "list";
    }
}
