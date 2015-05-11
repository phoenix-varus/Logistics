package main.java.cn.com.sxu.logistics.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String username = "root";
			String password = "mysql";
			String dbname = "logistics";
			conn = DriverManager.getConnection("jdbc:mysql://localhost/"
					+ dbname + "?user=" + username + "&password=" + password
					+ "&useUnicode=true&characterEncoding=utf8");
		} catch (Exception e) {
			System.out.println("OpenConnection:" + e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}

	public void closeConn() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closePs() {
		try {
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeRs() {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
