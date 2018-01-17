package com.gx.dao;

import com.gx.entity.CommonUser;

public interface CommonUserDao {
	public CommonUser getUserByEmail(String userEmail);
}
