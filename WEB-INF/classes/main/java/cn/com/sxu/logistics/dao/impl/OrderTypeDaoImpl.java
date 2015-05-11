/*
订单类型数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.OrderTypeDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.OrderType;

@Component("orderTypeDaoImpl")
public class OrderTypeDaoImpl implements OrderTypeDao {
	OrderType orderType;
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;

	/* 根据任务类型号查询任务类型 */
	@Override
	public OrderType getOrderTypeByOrder_Type_Id(String order_type_id) {

		try {
			String sql = "select * from orderType where order_type_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_type_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderType = new OrderType();
				orderType.setOrder_type_id(rs.getString("order_type_id"));
				orderType.setOrder_type(rs.getString("task_type"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderType;
	}

	/* 根据任务状态查询任务状态 */
	@Override
	public OrderType getOrderTypeByOrder_Type(String order_type) {
		try {
			String sql = "select * from orderType where order_type = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_type);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderType = new OrderType();
				orderType.setOrder_type_id(rs.getString("order_type_id"));
				orderType.setOrder_type(rs.getString("task_type"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderType;
	}

}
