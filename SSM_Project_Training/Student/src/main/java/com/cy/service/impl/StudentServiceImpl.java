package com.cy.service.impl;

import com.cy.dao.IStudentDAO;
import com.cy.entity.Student;
import com.cy.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/8/18 18:57
 * @Description:表现层
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDAO studentDAO ;


    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDAO.updateStudent(student);

    }

    @Override
    public Student getById(int id) {
        return studentDAO.getById(id);

    }

    @Override
    public List<Student> findByName(String name) {
        return studentDAO.findByName(name);
    }

    @Override
    public Student login(Student student) {
        Student s = studentDAO.login(student) ;
       return s;
    }
}