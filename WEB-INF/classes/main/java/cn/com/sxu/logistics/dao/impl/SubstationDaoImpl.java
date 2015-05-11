/*
分站信息数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.SubstationDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.Substation;

@Component("substationDaoImpl")
public class SubstationDaoImpl implements SubstationDao {
	List<Substation> substationList = new ArrayList<Substation>();
	Substation substation;
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;

	/* 根据分站号查询分站信息 */
	@Override
	public Substation getSubstationBySubstation_Id(String substation_id) {

		try {
			String sql = "select * from substation where substation_id = ?";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, substation_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				substation = new Substation();
				substation.setSubstation_id(rs.getString("substation_id"));
				substation.setSubstation_name(rs.getString("substation_name"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return substation;
	}

	/* 根据分站名查询分站信息 */
	@Override
	public Substation getSubstationBySubstation_Name(String substation_name) {
		try {
			String sql = "select * from substation where substation_name = ?";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, substation_name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				substation = new Substation();
				substation.setSubstation_id(rs.getString("substation_id"));
				substation.setSubstation_name(rs.getString("substation_name"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return substation;
	}

	/* 查询分站信息列表 */
	@Override
	public List<Substation> getSubstationList() {
		try {
			String sql = "select * from substation ";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				substation = new Substation();
				substation.setSubstation_id(rs.getString("substation_id"));
				substation.setSubstation_name(rs.getString("substation_name"));
				substationList.add(substation);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return substationList;
	}

}
