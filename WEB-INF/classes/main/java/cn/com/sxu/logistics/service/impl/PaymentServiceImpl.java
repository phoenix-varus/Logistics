/*
缴费查询业务逻辑实现层
 */
package main.java.cn.com.sxu.logistics.service.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.cn.com.sxu.logistics.dao.OrderFormDao;
import main.java.cn.com.sxu.logistics.dao.ProductFormDao;
import main.java.cn.com.sxu.logistics.dao.impl.OrderFormDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.ProductFormDaoImpl;
import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.ProductForm;
import main.java.cn.com.sxu.logistics.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
	private ProductForm productForm = new ProductForm();
	private List<ProductForm> productFormList = new ArrayList<ProductForm>();
	private ProductFormDao productFormDao = new ProductFormDaoImpl();
	private List<OrderForm> orderFormList = new ArrayList<OrderForm>();
	private OrderFormDao orderFormDao = new OrderFormDaoImpl();

	/* 查询商品收款列表 */
	@Override
	public List<ProductForm> getProductFormList(String task_date1,
			String task_date2) {
		if ((task_date1 != null && !task_date1.equals(""))
				&& (task_date2 != null && !task_date2.equals(""))) {
			orderFormList = orderFormDao.getOrderFormListByTask_Date(
					task_date1, task_date2);
		} else if ((task_date1 != null && !task_date1.equals(""))
				&& (task_date2 == null || task_date2.equals(""))) {
			orderFormList = orderFormDao
					.getOrderFormListByStart_Date(task_date1);
		} else if ((task_date1 == null || task_date1.equals(""))
				&& (task_date2 != null && !task_date2.equals(""))) {
			orderFormList = orderFormDao.getOrderFormListByEnd_Date(task_date2);
		} else {
			orderFormList = orderFormDao.getOrderFormList();
		}
		for (int i = 0; i < orderFormList.size(); i++) {
			productFormDao = new ProductFormDaoImpl();
			productForm = productFormDao.getProductFormByOrder_Product_Id(
					orderFormList.get(i).getOrder_id(), orderFormList.get(i)
							.getProduct_id());
			if (productForm != null) {
				productFormList.add(productForm);
			}
			productForm = null;
		}
		return productFormList;
	}

	/* 根据订单号查询商品收款列表 */
	@Override
	public List<ProductForm> getProductFormListByOrder_Id(String order_id) {
		productFormList = productFormDao.getProductFormListByOrder_Id(order_id);
		return productFormList;
	}

	/* 根据订单号修改收款单 */
	@Override
	public void addProductForm(OrderForm orderForm) {
		productFormDao.addProductForm(orderForm);
	}

	/* 根据订单号删除收款单 */
	@Override
	public void deleteProductForm(String order_id) {
		productFormDao.deleteProductForm(order_id);
	}

	/*
	 * getter--setter
	 */
	public ProductForm getProductForm() {
		return productForm;
	}

	public void setProductForm(ProductForm productForm) {
		this.productForm = productForm;
	}

	public List<ProductForm> getProductFormList() {
		return productFormList;
	}

	public void setProductFormList(List<ProductForm> productFormList) {
		this.productFormList = productFormList;
	}
	/*
	 * getter--setter
	 */

}
