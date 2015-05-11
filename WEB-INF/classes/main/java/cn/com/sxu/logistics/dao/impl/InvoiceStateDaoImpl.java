/*
发票状态数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.InvoiceStateDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.InvoiceState;

@Component("invoiceStateDaoImpl")
public class InvoiceStateDaoImpl implements InvoiceStateDao {
	InvoiceState invoiceState;
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;

	@Override
	public InvoiceState getInvoiceStateByInvoice_State_Id(
			String invoice_state_id) {
		try {
			db.getConnection();
			String sql = "select * from invoicestate where invoice_state_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, invoice_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				invoiceState = new InvoiceState();
				invoiceState.setInvoice_state_id(rs.getString("task_state_id"));
				invoiceState.setInvoice_state(rs.getString("task_state"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return invoiceState;
	}

	@Override
	public InvoiceState getInvoiceStateByInvoice_State(String invoice_state) {
		// TODO Auto-generated method stub
		return null;
	}

}
