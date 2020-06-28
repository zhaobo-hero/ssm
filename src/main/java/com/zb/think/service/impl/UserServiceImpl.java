package com.zb.think.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zb.think.dao.IUserDao;
import com.zb.think.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private IUserDao iUserDao;
	@Override
	public String findById(int id) {
		return iUserDao.findById(id);
	}

}
