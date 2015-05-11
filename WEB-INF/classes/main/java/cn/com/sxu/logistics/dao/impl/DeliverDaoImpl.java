/*
配送员数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.DeliverDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.Deliver;

@Component("deliverDaoImpl")
public class DeliverDaoImpl implements DeliverDao {
	Deliver deliver;
	List<Deliver> deliverList = new ArrayList<Deliver>();
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;

	/* 根据配送员号获得配送员信息 */
	@Override
	public Deliver getDeliverByDeliver_Id(String deliver_id) {

		try {
			String sql = "select * from deliver where deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, deliver_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				deliver = new Deliver();
				deliver.setDeliver_id(rs.getString("deliver_id"));
				deliver.setDeliver_name(rs.getString("deliver_name"));
				deliver.setDeliver_state(rs.getString("deliver_state"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deliver;
	}

	/* 根据配送员姓名获得配送员信息 */
	@Override
	public Deliver getDeliverByDeliver_Name(String deliver_name) {
		try {
			String sql = "select * from deliver where deliver_name = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, deliver_name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				deliver = new Deliver();
				deliver.setDeliver_id(rs.getString("deliver_id"));
				deliver.setDeliver_name(rs.getString("deliver_name"));
				deliver.setDeliver_state(rs.getString("deliver_state"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deliver;
	}

	/* 根据配送员状态获得配送员信息 */
	@Override
	public List<Deliver> getDeliverListByDeliver_State(String deliver_state) {
		try {
			String sql = "select * from deliver where deliver_state = ?";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, deliver_state);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				deliver = new Deliver();
				deliver.setDeliver_id(rs.getString("deliver_id"));
				deliver.setDeliver_name(rs.getString("deliver_name"));
				deliver.setDeliver_state(rs.getString("deliver_state"));
				deliverList.add(deliver);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deliverList;
	}

	/* 添加配送员 */
	@Override
	public void addDeliver(Deliver deliver) {
		try {
			String sql = "insert into deliver (deliver_id,deliver_name,deliver_state) values (?,?,?) ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, deliver.getDeliver_id());
			ps.setString(2, deliver.getDeliver_name());
			ps.setString(3, deliver.getDeliver_state());
			ps.executeUpdate();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* 修改配送员 */
	@Override
	public void updateDeliverByDeliver_Id(Deliver deliver) {
		try {
			String sql = "update deliver set deliver_name = ? , deliver_state = ? where deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, deliver.getDeliver_name());
			ps.setString(2, deliver.getDeliver_state());
			ps.setString(3, deliver.getDeliver_id());
			ps.executeUpdate();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* 删除配送员 */
	@Override
	public void deleteDeliverByDeliver_Id(String deliver_id) {
		try {
			String sql = "delete * from deliver where deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, deliver.getDeliver_id());
			ps.execute();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* 查询配送员列表信息 */
	@Override
	public List<Deliver> getDeliverList() {
		try {
			String sql = "select * from deliver";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				deliver = new Deliver();
				deliver.setDeliver_id(rs.getString("deliver_id"));
				deliver.setDeliver_name(rs.getString("deliver_name"));
				deliver.setDeliver_state(rs.getString("deliver_state"));
				deliverList.add(deliver);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deliverList;
	}
}
