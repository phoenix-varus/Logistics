/*
用户信息数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.cn.com.sxu.logistics.dao.UserManagerDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.User;

import org.springframework.stereotype.Component;

@Component("userManagerDaoImpl")
public class UserManagerDaoImpl implements UserManagerDao {
	User user;
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;

	/* 根据用户名查询用户信息 */
	@Override
	public User getUserByUserName(String username) {

		try {
			String sql = "select * from user where username = ?";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				System.out.println("password is " + rs.getString("password"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	/* 添加用户 */
	@Override
	public void addUser(User user) {

		try {

			String sql = "insert into user values(?,?) ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.executeUpdate();
			db.closePs();
			db.closeConn();
			System.out.println("save success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* 根据用户名修改用户信息 */
	@Override
	public void updateUserByUserName(User user) {
		try {

			String sql = "update user set password = ? where username = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getUsername());
			ps.executeUpdate();
			db.closePs();
			db.closeConn();
			System.out.println("update success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* 根据用户名删除用户 */
	@Override
	public void deleteUserByUserName(String username) {
		try {

			String sql = "delete from user where username = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, username);
			ps.execute();
			db.closePs();
			db.closeConn();
			System.out.println("update success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
