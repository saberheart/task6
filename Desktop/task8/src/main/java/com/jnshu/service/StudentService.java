package com.jnshu.service;

import com.jnshu.model.Student;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Administrator on 2017/4/14.
 */

public interface StudentService extends Remote {

    Student Login(String stu_name, String stu_pwd)throws RemoteException;

    List<Student> getAllStudent()throws RemoteException;

    int addStudent(Student stu)throws RemoteException;

    void deleteStudentById(int id)throws RemoteException;

    void updateStudentById(Student stu)throws RemoteException;
    public boolean verification(String stu_name, String stu_pwd)throws RemoteException;

    Student Login(String stu_name)throws RemoteException;
    long insert(String stu_name, String stu_pwd)throws RemoteException;
    public Student select(long id)throws RemoteException;
    public int OP()throws RemoteException;
}
