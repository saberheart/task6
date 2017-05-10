package com.test.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.IDao.UserDAO;
import com.test.domain.User;
import com.test.service.UserService;
@Service("userService")
public class UserServiceImp implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User selectByPrimaryKey(long id) {
		// TODO Auto-generated method stub
		return this.userDAO.selectByPrimaryKey(id);
	}

}
