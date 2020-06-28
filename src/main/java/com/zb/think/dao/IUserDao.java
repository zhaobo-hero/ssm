package com.zb.think.dao;

import org.apache.ibatis.annotations.Param;

import com.zb.think.entity.User;

public interface IUserDao {
	String findById(@Param("id") int id);
}
