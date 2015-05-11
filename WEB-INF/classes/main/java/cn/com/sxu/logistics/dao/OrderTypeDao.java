/*
订单类型数据接口层
 */
package main.java.cn.com.sxu.logistics.dao;

import main.java.cn.com.sxu.logistics.model.OrderType;

public interface OrderTypeDao {
	/* 根据订单类型编号查询寻订单状态信息 */
	public OrderType getOrderTypeByOrder_Type_Id(String order_type_id);

	/* 根据订单类型名查询寻订单状态信息 */
	public OrderType getOrderTypeByOrder_Type(String order_type);
}
