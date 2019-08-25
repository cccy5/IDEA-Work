package com.cy.myservlet.Service;

import com.cy.myservlet.entity.User;

import java.sql.SQLException;
import java.util.List;

//业务逻辑接口
public interface IuserService  {
    /**
     * @Description:
     * @Param:  登录方法
     * @return:  用户
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public User loginService (String username,String userpassword) throws SQLException  ;
    /**
     * @Description:
     * @Param:  增加用户
     * @return:  用户
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public boolean  insertService(User user) throws SQLException ;
    /**
     * @Description:
     * @Param:  通过id获取用户
     * @return:  id
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public  User getService(int id) throws SQLException ;
    /**
     * @Description:
     * @Param:  删除方法
     * @return:  用户
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public boolean deleteService(int id) throws SQLException;
    /**
     * @Description:
     * @Param:  查询方法
     * @return:  用户列表
     * @Author: Mr.chen
     * @Date: 2019/4/15
     */
    public List<User> listService() throws SQLException;

    public void update(User user)throws SQLException  ;
}
