package com.test.service;

import com.test.domain.User;

public interface UserService {

	User selectByPrimaryKey(long id);
}
