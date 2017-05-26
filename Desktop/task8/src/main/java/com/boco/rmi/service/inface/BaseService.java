package com.boco.rmi.service.inface;

/**
 * Created by 56929 on 2017/5/25.
 */
import com.boco.rmi.service.dao.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Title:BaseService
 * Description:服务接口
 * Copyright:Copyright(c) 2013
 * Company:boco
 * author:zhangtao
 */
public interface BaseService extends Remote{
    /**
     *Title:getHelloword
     *Description:
     * @param name
     * @return
     */
    public String getHelloword(String name) throws RemoteException;
    /**
     *Title:getUser
     *Description:
     * @param user
     * @return
     * @throws RemoteException
     */
    public String getUser(User user) throws RemoteException;

}