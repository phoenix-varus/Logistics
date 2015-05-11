/*
系统用户管理
 */
package main.java.cn.com.sxu.logistics.service;

import main.java.cn.com.sxu.logistics.model.User;

public interface UserManagerService {
	/*检查用户信息*/
	public boolean userCheck(User user);
	/*查询用户信息*/
	public User getUserByUsername(String username);
}
