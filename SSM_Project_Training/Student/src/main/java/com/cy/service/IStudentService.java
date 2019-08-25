package com.cy.service;

import com.cy.entity.Student;

import java.util.List;

public interface IStudentService {
    /**
     * @param: 查询所有
     * @return:
     * @date: 2019/8/18
     */
    List<Student> findAll() ;

    /**
     * @param: 保存
     * @return:
     * @date: 2019/8/18
     */
    void saveStudent(Student student) ;

    /**
     * @param: 通过id删除学生
     * @return:
     * @date: 2019/8/18
     */
    void deleteStudent(int id) ;

    /**
     * @param: 更新学生
     * @return:
     * @date: 2019/8/18
     */
    int updateStudent(Student student) ;

    /**
     * @param: 通过id获取学生
     * @return:
     * @date: 2019/8/18
     */
    Student getById(int id ) ;

    /**
     * @param: 通过名字模糊查询
     * @return:
     * @date: 2019/8/18
     */
    List<Student> findByName(String name) ;
    /**
     * @param: 通过账号和密码登录
     * @return:
     * @date: 2019/8/18
     */
    Student login(Student student) ;
}
