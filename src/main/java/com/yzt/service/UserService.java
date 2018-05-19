package com.yzt.service;

import org.springframework.stereotype.Repository;

import com.yzt.model.User;


public interface UserService {

	User getByUsername(String username);
	

}
