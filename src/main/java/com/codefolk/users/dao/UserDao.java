package com.codefolk.users.dao;

import com.codefolk.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}