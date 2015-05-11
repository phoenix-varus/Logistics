/*
订单信息数据实现接口
 */
package main.java.cn.com.sxu.logistics.dao;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.OrderForm;

public interface OrderFormDao {
	/* 根据订单号查询订单信息 */
	public OrderForm getOrderFormByOrder_Id(String order_id);

	/* 根据原来的订单号查询订单信息 */
	public OrderForm getOrderFormByOriginal_Order_Id(String original_order_id);

	/* 根据分站编号查询订单信息列表 */
	public List<OrderForm> getOrderFormListBySubstation_Id(String substation_id);

	/* 根据订单状态查询订单信息列表 */
	public List<OrderForm> getOrderFormListByOrder_State_Id(
			String order_state_id);

	/* 根据订单类型查询订单信息列表 */
	public List<OrderForm> getOrderFormListByOrder_Type_Id(String order_type_id);

	/* 查询订单信息列表 */
	public List<OrderForm> getOrderFormList();

	/* 根据开始日期之后查询订单信息列表 */
	public List<OrderForm> getOrderFormListByStart_Date(String task_date);

	/* 根据截止日期之前查询订单信息列表 */
	public List<OrderForm> getOrderFormListByEnd_Date(String task_date);

	/* 根据两段时间中间查询订单信息列表 */
	public List<OrderForm> getOrderFormListByTask_Date(String task_date1,
			String task_date2);

	/* 添加订单信息 */
	public void addOrderForm(OrderForm orderForm);

	/* 根据订单号修改订单信息 */
	public void updateOrderFormByOrder_Id(OrderForm orderForm);

	/* 根据订单号删除订单信息 */
	public void deleteOrderFormByOrder_Id(String order_id);

	/* 根据任务号查询订单信息 */
	public OrderForm getOrderFormByTask_Id(String task_id);

	/* 根据订单号修改订单信息 */
	public void updateOrderFormState(OrderForm orderForm);

	/* 根据订单状态查询订单信息 */
	public OrderForm getOrderFormByOrder_State_Id(String order_state_id);

}
