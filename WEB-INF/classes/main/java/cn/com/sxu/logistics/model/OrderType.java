/*
订单状态信息
 */
package main.java.cn.com.sxu.logistics.model;

import org.springframework.stereotype.Component;

@Component("orderType")
public class OrderType {
	/* 订单状态编号 */
	private String order_type_id;
	/* 订单状态名 */
	private String order_type;

	public String getOrder_type_id() {
		return order_type_id;
	}

	public void setOrder_type_id(String order_type_id) {
		this.order_type_id = order_type_id;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
}
