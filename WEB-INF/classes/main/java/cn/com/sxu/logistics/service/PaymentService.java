/*
缴费查询业务逻辑接口
 */
package main.java.cn.com.sxu.logistics.service;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.ProductForm;

public interface PaymentService {
	/* 缴纳信息列表查询 */
	public List<ProductForm> getProductFormList(String task_date1,
			String task_date2);

	/* 根据任务单号查询缴纳信息 */
	public List<ProductForm> getProductFormListByOrder_Id(String order_id);

	/* 根据订单号添加收款单 */
	public void addProductForm(OrderForm orderForm);

	/* 根据订单号删除收款单 */
	public void deleteProductForm(String order_id);
}
