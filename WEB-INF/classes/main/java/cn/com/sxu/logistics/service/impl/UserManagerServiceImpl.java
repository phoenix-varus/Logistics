/*
系统用户管理
 */
package main.java.cn.com.sxu.logistics.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.UserManagerDao;
import main.java.cn.com.sxu.logistics.dao.impl.UserManagerDaoImpl;
import main.java.cn.com.sxu.logistics.model.User;
import main.java.cn.com.sxu.logistics.service.UserManagerService;

@Component("userManagerServiceImpl")
public class UserManagerServiceImpl implements UserManagerService {
	private UserManagerDao userManagerDao = new UserManagerDaoImpl();
private User user=new User();
	/*
	 * getter--setter
	 */
	public UserManagerDao getUserManagerDao() {
		return userManagerDao;
	}

	@Resource(name = "userManagerDaoImpl")
	public void setUserManagerDao(UserManagerDao userManagerDao) {
		this.userManagerDao = userManagerDao;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/*
	 * getter--setter
	 */

	/* 校验用户信息 */
	@Override
	public boolean userCheck(User user) {
		User u = userManagerDao.getUserByUserName(user.getUsername());
		if (u == null || !(u.getPassword().equals(user.getPassword()))) {
			return false;
		} else
			return true;
	}
/*根据用户名查询用户信息*/
	@Override
	public User getUserByUsername(String username) {
		user=userManagerDao.getUserByUserName(username);
		return user;
	}

	
}
