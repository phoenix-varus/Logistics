/*
商品收款单信息处理接口
 */
package main.java.cn.com.sxu.logistics.dao;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.ProductForm;

public interface ProductFormDao {
	/* 根据订单号查询商品收款列表信息 */
	public List<ProductForm> getProductFormListByOrder_Id(String order_id);

	/* 根据商品号查询相应收款信息 */
	public ProductForm getProductFormByOrder_Product_Id(String order_id,
			String product_id);

	/* 查询商品收款单列表 */
	public List<ProductForm> getProductFormList();

	/* 根据订单号删除收款单 */
	public void deleteProductForm(String order_id);

	/* 根据订单号修改收款单 */
	public void addProductForm(OrderForm orderForm);
}
