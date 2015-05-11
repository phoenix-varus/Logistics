/*
商品收款信息数据处理实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.ProductFormDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.ProductForm;

@Component("productFormDaoImpl")
public class ProductFormDaoImpl implements ProductFormDao {
	ProductForm productForm;
	List<ProductForm> productFormList = new ArrayList<ProductForm>();
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;

	/* 根据订单号查询商品收款信息列表 */
	@Override
	public List<ProductForm> getProductFormListByOrder_Id(String order_id) {

		try {
			String sql = "select * from productform where order_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, order_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productForm = new ProductForm();
				productForm.setProduct_id(rs.getString("product_id"));
				productForm.setOrder_id(rs.getString("order_id"));
				productForm.setProduct_name(rs.getString("product_name"));
				productForm.setProduct_num(rs.getString("product_num"));
				productForm.setCollection(rs.getString("collection"));
				productForm.setRefund(rs.getString("refund"));
				productFormList.add(productForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productFormList;
	}

	/* 根据订单号和商品号查询商品收款信息 */
	@Override
	public ProductForm getProductFormByOrder_Product_Id(String order_id,
			String product_id) {
		try {
			String sql = "select * from productform where product_id = ? and order_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, product_id);
			ps.setString(2, order_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productForm = new ProductForm();
				productForm.setProduct_id(rs.getString("product_id"));
				productForm.setOrder_id(rs.getString("order_id"));
				productForm.setProduct_name(rs.getString("product_name"));
				productForm.setProduct_num(rs.getString("product_num"));
				productForm.setCollection(rs.getString("product_collection"));
				productForm.setRefund(rs.getString("product_refund"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productForm;
	}

	/* 查询商品收款单列表 */
	@Override
	public List<ProductForm> getProductFormList() {
		try {
			String sql = "select * from productform";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productForm = new ProductForm();
				productForm.setProduct_id(rs.getString("product_id"));
				productForm.setOrder_id(rs.getString("order_id"));
				productForm.setProduct_name(rs.getString("product_name"));
				productForm.setProduct_num(rs.getString("product_num"));
				productForm.setCollection(rs.getString("collection"));
				productForm.setRefund(rs.getString("refund"));
				productFormList.add(productForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productFormList;
	}

	/* 根据订单号删除收款单 */
	@Override
	public void deleteProductForm(String order_id) {
		try {
			String sql = "delete from productform where order_id = ? ";
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

	@Override
	public void addProductForm(OrderForm orderForm) {
		try {
			String sql = "insert into productform (product_id,product_name,product_num,product_collection,product_refund,order_id) values (?,?,?,?,?,?) ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, orderForm.getProduct_id());
			ps.setString(2, orderForm.getProduct_name());
			ps.setString(3, orderForm.getProduct_num());
			ps.setString(4, orderForm.getProduct_collection());
			ps.setString(5, orderForm.getProduct_refund());
			ps.setString(6, orderForm.getOrder_id());
			ps.executeUpdate();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
