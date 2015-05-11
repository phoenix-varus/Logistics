package main.java.cn.com.sxu.logistics.service.impl;

import main.java.cn.com.sxu.logistics.model.User;
import main.java.cn.com.sxu.logistics.service.UserManagerService;

import org.junit.Test;

public class UserManagerServiceTest {
	UserManagerService userManagerService = new UserManagerServiceImpl();
	User user = new User();

	@Test
	public void testUserCheck() {
		user.setUsername("yanjunfeng");
		user.setPassword("997882763");
		System.out.println(userManagerService.userCheck(user));
	}

}
