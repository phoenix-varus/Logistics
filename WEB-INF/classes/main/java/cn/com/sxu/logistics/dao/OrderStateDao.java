/*
订单状态数据接口层
 */
package main.java.cn.com.sxu.logistics.dao;

import main.java.cn.com.sxu.logistics.model.OrderState;

public interface OrderStateDao {
	/* 根据订单状态编号查询订单状态信息 */
	public OrderState getOrderStateByOrder_State_Id(String order_state_id);

	/* 根据订单状态名查询订单状态信息 */
	public OrderState getOrderStateByOrder_State(String order_state);
}
