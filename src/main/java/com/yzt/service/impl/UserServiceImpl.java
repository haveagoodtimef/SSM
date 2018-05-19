package com.yzt.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

import com.yzt.dao.UserDao;
import com.yzt.model.User;
import com.yzt.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;

	public User getByUsername(String username) {
		User byUsername = userDao.getByUsername(username);
		return byUsername;
	}
	
	public Set<String> getRoles(String username) {
	        return userDao.getRoles(username);
	}

    public Set<String> getPermissions(String username) {
        return userDao.getPermissions(username);
    }
	
}
