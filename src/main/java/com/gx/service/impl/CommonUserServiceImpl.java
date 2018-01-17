package com.gx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gx.dao.CommonUserDao;
import com.gx.entity.CommonUser;
import com.gx.service.CommonUserService;

@Service
public class CommonUserServiceImpl implements CommonUserService {
	@Autowired
	private CommonUserDao commonUserDao;
	
	public CommonUser getUserByEmail(String userEmail) {
		// TODO Auto-generated method stub
		return commonUserDao.getUserByEmail(userEmail);
		 
	}
}
