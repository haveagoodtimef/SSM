package com.yzt.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.yzt.model.User;


public interface UserDao {
	
    public User getByUsername(String username);

    public Set<String> getRoles(String username);

    public Set<String> getPermissions(String username);
}