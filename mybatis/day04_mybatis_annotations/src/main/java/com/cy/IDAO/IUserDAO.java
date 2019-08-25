package com.cy.IDAO;

import com.cy.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IUserDAO {

    /**
    * @Description: 保存用户
    * @Param:
    * @return:
    * @Author: Mr.chen
    * @Date: 2019/6/15
    */
    @ResultMap("userMap")
    @Insert("insert into user(username,address,sex,birthday) values(#{userName},#{address},#{sex},#{bithday})")
    void save(User user) ;

    /**
    * @Description: 通过id删除用户
    * @Param:
    * @return:
    * @Author: Mr.chen
    * @Date: 2019/6/15
    */
    @ResultMap("userMap")
    @Delete("delete from user where id = #{id}")
    void delete(int id);

    /**
    * @Description: 更新用户信息
    * @Param:
    * @return:
    * @Author: Mr.chen
    * @Date: 2019/6/15
    */
    @ResultMap("userMap")
    @Update("update user set username = #{userName},address = #{address},sex = #{sex},birthday = #{Bithday} where id = #{uid}")
    void update(User user) ;

    /**
    * @Description: 通过id获取用户
    * @Param:
    * @return:
    * @Author: Mr.chen
    * @Date: 2019/6/15
    */
    @ResultMap("userMap")
    @Select("select * from user where id = #{id}")
    User  getUserById(int id) ;


    /**
     * 根据用户名称模糊查询
     * @param username
     * @return
     */
//    @Select("select * from user where username like #{username} ")
    @Select("select * from user where username like '%${value}%' ")
    @ResultMap("userMap")
    List<User> findUserByName(String username);


    /**
     * 查询总用户数量
     * @return
     */
    @ResultMap("userMap")
    @Select("select count(*) from user ")
    int findTotalUser();

    @Select("select * from user")
    @Results(id = "userMap" , value = {
            @Result(id = true ,column = "id" , property = "uid"),
            @Result(property = "userName" ,column = "username"),
            @Result(property = "Sex" ,column = "sex"),
            @Result(property = "Bithday" ,column = "birthday"),
            @Result(property = "Address" ,column = "address"),
            @Result(property = "accounts",column = "uid",
                    many = @Many(select = "com.cy.IDAO.IAccount.findAccountById",
                    fetchType = FetchType.LAZY))
    })           //  com.cy.IDAO.IAccount.findAccountById
    //column = "uid"  user表中的id
    List<User> findAll() ;
}
