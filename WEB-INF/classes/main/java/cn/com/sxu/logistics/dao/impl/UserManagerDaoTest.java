package main.java.cn.com.sxu.logistics.dao.impl;

import main.java.cn.com.sxu.logistics.dao.UserManagerDao;

import org.junit.Test;

public class UserManagerDaoTest {

	@Test
	public void testGetUserByUserName() {
		UserManagerDao userManagerDao = new UserManagerDaoImpl();
		System.out.println("hehe "
				+ userManagerDao.getUserByUserName("yanjunfeng"));
	}

}
