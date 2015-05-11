/*
用户管理信息接口
 */
package main.java.cn.com.sxu.logistics.dao;

import main.java.cn.com.sxu.logistics.model.User;

public interface UserManagerDao {
	/* 根据用户名来查询用户信息 */
	public User getUserByUserName(String username);

	/* 增加用户信息 */
	public void addUser(User user);

	/* 根据用户名来修改用户信息 */
	public void updateUserByUserName(User user);

	/* 根据用户名来删除用户信息 */
	public void deleteUserByUserName(String username);

}
