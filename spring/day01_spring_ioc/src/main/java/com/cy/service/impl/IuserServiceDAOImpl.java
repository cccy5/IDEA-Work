package com.cy.service.impl;

import com.cy.dao.IUsserDAO;
import com.cy.dao.impl.UserDAOImpl;
import com.cy.service.IUserServiceDAO;

/**
 * @program: day01_spring_ioc
 * @description: 业务层实现类   业务层调用持久层
 * @author: MrChen
 * @create: 2019-06-18 22:23
 */
public class IuserServiceDAOImpl implements IUserServiceDAO {
   // IUserServiceDAO serviceDAO = new IuserServiceDAOImpl() ;

    private IUsserDAO usserDAO = new UserDAOImpl();
    public void save() {
        usserDAO.save();
    }
}