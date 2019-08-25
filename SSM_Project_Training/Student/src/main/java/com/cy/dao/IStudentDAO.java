package com.cy.dao;

import com.cy.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @param: 学生类接口
 * @return: 
 * @date: 2019/8/18 
 */
@Repository
public interface IStudentDAO {
    
    /**
     * @param: 查询所有
     * @return: 
     * @date: 2019/8/18 
     */
    @Select("select * from student")
    List<Student> findAll() ;
    
    /**
     * @param: 保存
     * @return: 
     * @date: 2019/8/18 
     */
    @Insert("insert into student (account,password,name,age,address) values(#{account},#{password},#{name},#{age},#{address})")
    void saveStudent(Student student) ;
    
    /**
     * @param: 通过id删除学生
     * @return: 
     * @date: 2019/8/18 
     */
    @Delete("delete from student where id = #{id}")
    void deleteStudent(int id) ;
    
    /**
     * @param: 更新学生
     * @return: 
     * @date: 2019/8/18 
     */
    @Update("update student set account=#{account},password=#{password},name=#{name},age=#{age},address=#{address} where id=#{id}")
    int updateStudent(Student student) ;
    
    /**
     * @param: 通过id获取学生
     * @return: 
     * @date: 2019/8/18 
     */
    @Select("select * from student where id = #{id}")
    Student getById(int id ) ;
    
    /**
     * @param: 通过名字模糊查询
     * @return: 
     * @date: 2019/8/18 
     */
    @Select(" select * from student where name like #{name}")
    List<Student> findByName(String name) ;

    /**
     * @param: 通过账号和密码登录
     * @return:
     * @date: 2019/8/18
     */
    @Select("select * from student where account=#{account} and password=#{password}")
    Student login(Student student) ;
}
