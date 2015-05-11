/*
发票信息数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.InvoiceDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.Invoice;
import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.TaskForm;

@Component("invoiceDaoImpl")
public class InvoiceDaoImpl implements InvoiceDao {
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;
	Invoice invoice = new Invoice();
	List<Invoice> invoiceList = new ArrayList<Invoice>();

	/* 根据发票编号查询发票信息 */
	@Override
	public Invoice getInvoiceByInvoice_Id(String invoice_id) {
		try {
			String sql = "select * from invoice where invoice_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, invoice_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				invoice = new Invoice();
				invoice.setOrder_id(rs.getString("order_id"));
				invoice.setOriginal_invoice_id(rs
						.getString("original_invoice_id"));
				invoice.setDeliver_id(rs.getString("deliver_id"));
				invoice.setInvalid_date(rs.getString("invalid_date"));
				invoice.setInvalid_man(rs.getString("invalid_man"));
				invoice.setInvoice_amount(rs.getString("invoice_amount"));
				invoice.setInvoice_id(rs.getString("invoice_id"));
				invoice.setInvoice_state_id(rs.getString("invoice_state_id"));
				invoice.setIsrequired(rs.getString("isrequired"));
				invoice.setProduct_id(rs.getString("product_id"));
				invoice.setProduct_name(rs.getString("product_name"));
				invoice.setProduct_num(rs.getString("product_num"));
				invoice.setReceived_date(rs.getString("received_date"));
				invoice.setReceived_man(rs.getString("received_man"));
				invoice.setRemark(rs.getString("remark"));
				invoice.setSubstation_id(rs.getString("substation_id"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return invoice;
	}

	@Override
	public Invoice getInvoiceByOriginal_Invoice_Id(String original_invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice getInvoiceByOrder_Id(String order_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getInvoiceListBySubstation_Id(String substation_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getInvoiceListByDeliver_Id(String deliver_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getInvoiceListByReceived_Date(String received_date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getInvoiceListByInvalid_Date(String invalid_date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getInvoiceListByIsrequired(String isrequired) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getInvoiceListByInvoice_State_Id(
			String invoice_state_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice addInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice updateInvoiceByInvoice_id(String invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice deleteInvoiceByInvoice_id(String invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getInvoiceList() {
		try {
			db.getConnection();
			String sql = "select * from invoice";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				invoice = new Invoice();
				invoice.setOrder_id(rs.getString("order_id"));
				invoice.setOriginal_invoice_id(rs
						.getString("original_invoice_id"));
				invoice.setDeliver_id(rs.getString("deliver_id"));
				invoice.setInvalid_date(rs.getString("invalid_date"));
				invoice.setInvalid_man(rs.getString("invalid_man"));
				invoice.setInvoice_amount(rs.getString("invoice_amount"));
				invoice.setInvoice_id(rs.getString("invoice_id"));
				invoice.setInvoice_state_id(rs.getString("invoice_state_id"));
				invoice.setIsrequired(rs.getString("isrequired"));
				invoice.setProduct_id(rs.getString("product_id"));
				invoice.setProduct_name(rs.getString("product_name"));
				invoice.setProduct_num(rs.getString("product_num"));
				invoice.setReceived_date(rs.getString("received_date"));
				invoice.setReceived_man(rs.getString("received_man"));
				invoice.setRemark(rs.getString("remark"));
				invoice.setSubstation_id(rs.getString("substation_id"));
				invoiceList.add(invoice);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return invoiceList;
	}

	/* 根据发票编号删除发票信息 */
	@Override
	public void deleteInvoiceByOrder_id(String order_id) {
		try {
			String sql = "delete from invoice where order_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_id);
			ps.execute();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* 查询发票信息 */
	@Override
	public Invoice getInvoice() {
		try {
			String sql = "select * from invoice ";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				invoice = new Invoice();
				invoice.setOrder_id(rs.getString("order_id"));
				invoice.setOriginal_invoice_id(rs
						.getString("original_invoice_id"));
				invoice.setDeliver_id(rs.getString("deliver_id"));
				invoice.setInvalid_date(rs.getString("invalid_date"));
				invoice.setInvalid_man(rs.getString("invalid_man"));
				invoice.setInvoice_amount(rs.getString("invoice_amount"));
				invoice.setInvoice_id(rs.getString("invoice_id"));
				invoice.setInvoice_state_id(rs.getString("invoice_state_id"));
				invoice.setIsrequired(rs.getString("isrequired"));
				invoice.setProduct_id(rs.getString("product_id"));
				invoice.setProduct_name(rs.getString("product_name"));
				invoice.setProduct_num(rs.getString("product_num"));
				invoice.setReceived_date(rs.getString("received_date"));
				invoice.setReceived_man(rs.getString("received_man"));
				invoice.setRemark(rs.getString("remark"));
				invoice.setSubstation_id(rs.getString("substation_id"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return invoice;
	}

	/* 添加发票 */
	@Override
	public void addInvoiceByOrder_id(OrderForm orderForm, TaskForm taskForm) {
		try {
			String sql = "insert into invoice (invoice_id,order_id,product_id,product_name,product_num,invoice_amount,substation_id,remark,deliver_id) values (?,?,?,?,?,?,?,?,?) ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, "I-" + orderForm.getOrder_id());
			ps.setString(2, orderForm.getOrder_id());
			ps.setString(3, orderForm.getProduct_id());
			ps.setString(4, orderForm.getProduct_name());
			ps.setString(5, orderForm.getProduct_num());
			ps.setString(6, orderForm.getProduct_collection());
			ps.setString(7, orderForm.getSubstation_id());
			ps.setString(8, orderForm.getRemark());
			ps.setString(9, taskForm.getDeliver_id());
			ps.executeUpdate();
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
