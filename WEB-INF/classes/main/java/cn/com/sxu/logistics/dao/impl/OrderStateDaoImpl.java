/*
订单状态信息数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.OrderStateDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.OrderState;

@Component("orderStateDaoImpl")
public class OrderStateDaoImpl implements OrderStateDao {
	OrderState orderState;
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;

	/* 根据订单状态号查询订单 */
	@Override
	public OrderState getOrderStateByOrder_State_Id(String order_state_id) {

		try {
			String sql = "select * from orderState where order_state_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderState = new OrderState();
				orderState.setOrder_state_id(rs.getString("order_state_id"));
				orderState.setOrder_state(rs.getString("order_state"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderState;
	}

	/* 根据订单状态查询订单 */
	@Override
	public OrderState getOrderStateByOrder_State(String order_state) {
		try {
			String sql = "select * from orderState where order_state = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_state);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderState = new OrderState();
				orderState.setOrder_state_id(rs.getString("order_state_id"));
				orderState.setOrder_state(rs.getString("order_state"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderState;
	}

}
