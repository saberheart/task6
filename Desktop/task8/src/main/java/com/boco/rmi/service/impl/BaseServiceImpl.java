package com.boco.rmi.service.impl;

/**
 * Created by 56929 on 2017/5/25.
 */
import com.boco.rmi.service.dao.User;
import com.boco.rmi.service.inface.BaseService;

/**
 * Title:BaseServiceImpl
 * Description:
 * Copyright:Copyright(c) 2013
 * Company:boco
 * author:zhangtao
 */
public class BaseServiceImpl implements BaseService {

    /* (non-Javadoc)
     *Title:getHelloword
     *Description</p>
     *@param name
     *@return
     * @see com.boco.rmi.service.inface.BaseService#getHelloword(java.lang.String)
     */
    @Override
    public String getHelloword(String name) {
        // TODO Auto-generated method stub
        return "Welcome to boco,"+name+"!";
    }

    /* (non-Javadoc)
     *Title:getUser
     *Description</p>
     *@param user
     *@return
     * @see com.boco.rmi.service.inface.BaseService#getUser(com.boco.rmi.service.dao.User)
     */
    @Override
    public String getUser(User user) {
        // TODO Auto-generated method stub
        return "name:"+user.getName()+"-------->"+"age"+user.getAge();
    }

}