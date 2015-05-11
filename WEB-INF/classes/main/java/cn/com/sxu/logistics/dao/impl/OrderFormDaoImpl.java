/*
订单信息数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.OrderFormDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.OrderForm;

@Component("orderFormDaoImpl")
public class OrderFormDaoImpl implements OrderFormDao {
	OrderForm orderForm;
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;
	List<OrderForm> orderFormList = new ArrayList<OrderForm>();

	/* 根据订单号查询订单信息 */
	@Override
	public OrderForm getOrderFormByOrder_Id(String order_id) {

		try {
			String sql = "select * from orderForm where order_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setProduct_num(rs.getString("product_num"));
				orderForm.setProduct_collection(rs
						.getString("product_collection"));
				orderForm.setProduct_refund(rs.getString("product_refund"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderForm;
	}

	/* 根据原订单号查询订单 */
	@Override
	public OrderForm getOrderFormByOriginal_Order_Id(String original_order_id) {
		try {
			String sql = "select * from orderForm where original_order_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, original_order_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderForm;
	}

	/* 根据分站号查询订单列表 */
	@Override
	public List<OrderForm> getOrderFormListBySubstation_Id(String substation_id) {
		try {
			String sql = "select * from orderForm where substation_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, substation_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
				orderFormList.add(orderForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderFormList;
	}

	/* 根据订单状态查询订单信息列表 */
	@Override
	public List<OrderForm> getOrderFormListByOrder_State_Id(
			String order_state_id) {
		try {
			String sql = "select * from orderForm where order_state_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
				orderFormList.add(orderForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderFormList;
	}

	/* 根据订单类型查询订单信息列表 */
	@Override
	public List<OrderForm> getOrderFormListByOrder_Type_Id(String order_type_id) {
		try {
			String sql = "select * from orderForm where order_type_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_type_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
				orderFormList.add(orderForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderFormList;
	}

	/* 添加订单 */
	@Override
	public void addOrderForm(OrderForm orderForm) {
		try {
			String sql = "insert into orderForm (order_id,order_state_id,order_type_id,original_order_id,task_id,task_date,customer_address,customer_call,customer_name,customer_zipcode,product_id,substation_id,remark) values (?,?,?,?,?,?,?,?,?,?,?,?,?) ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, orderForm.getOrder_id());
			ps.setString(2, orderForm.getOrder_state_id());
			ps.setString(3, orderForm.getOrder_type_id());
			ps.setString(4, orderForm.getOriginal_order_id());
			ps.setString(5, orderForm.getTask_id());
			ps.setString(6, orderForm.getTask_date());
			ps.setString(7, orderForm.getCustomer_address());
			ps.setString(8, orderForm.getCustomer_call());
			ps.setString(9, orderForm.getCustomer_name());
			ps.setString(10, orderForm.getCustomer_zipcode());
			ps.setString(11, orderForm.getProduct_id());
			ps.setString(12, orderForm.getSubstation_id());
			ps.setString(13, orderForm.getRemark());
			ps.executeUpdate();
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* 修改订单 */
	@Override
	public void updateOrderFormByOrder_Id(OrderForm orderForm) {
		try {
			String sql = "update orderForm set order_state_id = ? , order_type_id = ? , original_order_id = ? , task_id = ? , task_date = ? , customer_address = ? , customer_call = ? , customer_name = ? , customer_zipcode = ? , product_id = ? ,product_num = ? , product_collection = ? , product_refund = ? , substation_id = ? , remark = ? where order_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, orderForm.getOrder_state_id());
			ps.setString(2, orderForm.getOrder_type_id());
			ps.setString(3, orderForm.getOriginal_order_id());
			ps.setString(4, orderForm.getTask_id());
			ps.setString(5, orderForm.getTask_date());
			ps.setString(6, orderForm.getCustomer_address());
			ps.setString(7, orderForm.getCustomer_call());
			ps.setString(8, orderForm.getCustomer_name());
			ps.setString(9, orderForm.getCustomer_zipcode());
			ps.setString(10, orderForm.getProduct_id());
			ps.setString(11, orderForm.getProduct_num());
			ps.setString(12, orderForm.getProduct_collection());
			ps.setString(13, orderForm.getProduct_refund());
			ps.setString(14, orderForm.getSubstation_id());
			ps.setString(15, orderForm.getRemark());
			ps.setString(16, orderForm.getOrder_id());
			ps.executeUpdate();
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* 删除订单 */
	@Override
	public void deleteOrderFormByOrder_Id(String order_id) {
		try {

			String sql = "delete from orderForm where order_id= ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_id);
			ps.execute();
			db.closePs();
			db.closeConn();
			System.out.println("update success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* 根据开始日期之后查询订单信息列表 */
	@Override
	public List<OrderForm> getOrderFormListByStart_Date(String task_date) {
		try {
			String sql = "select * from orderForm where task_date >= ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
				orderFormList.add(orderForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderFormList;
	}

	/* 根据截止日期之前查询订单信息列表 */
	@Override
	public List<OrderForm> getOrderFormListByEnd_Date(String task_date) {
		try {
			String sql = "select * from orderForm where task_date <= ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
				orderFormList.add(orderForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderFormList;
	}

	/* 根据两段时间中间查询订单信息列表 */
	@Override
	public List<OrderForm> getOrderFormListByTask_Date(String task_date1,
			String task_date2) {
		try {
			String sql = "select * from orderForm where task_date >= ? and task_date <= ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date1);
			ps.setString(2, task_date2);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
				orderFormList.add(orderForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderFormList;
	}

	/* 查询订单信息列表 */
	@Override
	public List<OrderForm> getOrderFormList() {
		try {
			String sql = "select * from orderForm ";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
				orderFormList.add(orderForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderFormList;
	}

	/* 根据任务号查询订单信息 */
	@Override
	public OrderForm getOrderFormByTask_Id(String task_id) {
		try {
			String sql = "select * from orderForm where task_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setProduct_num(rs.getString("product_num"));
				orderForm.setProduct_collection(rs
						.getString("product_collection"));
				orderForm.setProduct_refund(rs.getString("product_refund"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderForm;
	}

	/* 根据订单号修改订单信息 */
	@Override
	public void updateOrderFormState(OrderForm orderForm) {
		try {
			String sql = "update orderForm set order_state_id = ? , task_id = ? where order_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, orderForm.getOrder_state_id());
			ps.setString(2, orderForm.getTask_id());
			ps.setString(3, orderForm.getOrder_id());
			ps.executeUpdate();
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* 根据订单状态查询订单信息 */
	@Override
	public OrderForm getOrderFormByOrder_State_Id(String order_state_id) {
		try {
			String sql = "select * from orderForm where order_state_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				orderForm = new OrderForm();
				orderForm.setOrder_id(rs.getString("order_id"));
				orderForm.setOrder_state_id(rs.getString("order_state_id"));
				orderForm.setOrder_type_id(rs.getString("order_type_id"));
				orderForm.setOriginal_order_id(rs
						.getString("original_order_id"));
				orderForm.setTask_id(rs.getString("task_id"));
				orderForm.setTask_date(rs.getString("task_date"));
				orderForm.setCustomer_address(rs.getString("customer_address"));
				orderForm.setCustomer_call(rs.getString("customer_call"));
				orderForm.setCustomer_name(rs.getString("customer_name"));
				orderForm.setCustomer_zipcode(rs.getString("customer_zipcode"));
				orderForm.setProduct_id(rs.getString("product_id"));
				orderForm.setProduct_name(rs.getString("product_name"));
				orderForm.setProduct_num(rs.getString("product_num"));
				orderForm.setProduct_collection(rs
						.getString("product_collection"));
				orderForm.setProduct_refund(rs.getString("product_refund"));
				orderForm.setSubstation_id(rs.getString("substation_id"));
				orderForm.setRemark(rs.getString("remark"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderForm;
	}

}
