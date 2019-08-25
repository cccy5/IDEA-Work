package com.cy.dao;

import com.cy.entity.Admin;

import java.util.List;

public interface IAdmin {
    /**
    * @Description: 增加管理员
    * @Param:  admin
    * @return:  admin
    * @Author: Mr.chen
    * @Date: 2019/5/23
    */
    void saveAdmin(Admin admin) ;

    /** 
    * @Description: 通过id删除Admin 
    * @Param:  id
    * @return:  admin
    * @Author: Mr.chen
    * @Date: 2019/5/23 
    */ 
    void deleteAdmin(int adminId) ;

    /** 
    * @Description: 修改admin
    * @Param:  admin
    * @return:  admin
    * @Author: Mr.chen
    * @Date: 2019/5/23 
    */ 
    void uopdateAdmin(Admin admin) ;

    /**
    * @Description: 通过id获取admin
    * @Param:  id
    * @return:  admin
    * @Author: Mr.chen
    * @Date: 2019/5/23
    */
    void getAdminById(int adminId) ;


    /** 
    * @Description: 获取所有admin 
    * @Param:  list
    * @return:  adminList
    * @Author: Mr.chen
    * @Date: 2019/5/23 
    */ 
    List<Admin> findAll() ;
}
