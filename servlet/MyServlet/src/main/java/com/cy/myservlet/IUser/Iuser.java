package com.cy.myservlet.IUser;

import com.cy.myservlet.entity.User;

import java.util.List;

public interface Iuser {
    /**
     * @Description:
     * @Param:  登录方法
     * @return:  用户
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public User login (String username,String userpassword)  throws  Exception;
    /**
     * @Description:
     * @Param:  增加用户
     * @return:  用户
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public void update(User user) throws  Exception;
    public void insert(User user) throws  Exception;
    /**
     * @Description:
     * @Param:  通过id获取用户
     * @return:  id
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public  User get(int id) throws  Exception;
    /**
     * @Description:
     * @Param:  删除方法
     * @return:  用户
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public void delete(int id) throws  Exception;
    /**
     * @Description:
     * @Param:  查询方法
     * @return:  用户列表
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public List<User> list() throws  Exception;


}
