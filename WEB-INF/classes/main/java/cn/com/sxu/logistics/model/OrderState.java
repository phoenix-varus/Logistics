/*
订单状态信息
 */
package main.java.cn.com.sxu.logistics.model;

import org.springframework.stereotype.Component;

@Component("orderState")
public class OrderState {
	/* 订单状态编号 */
	private String order_state_id;
	/* 订单状态 */
	private String order_state;

	public String getOrder_state_id() {
		return order_state_id;
	}

	public void setOrder_state_id(String order_state_id) {
		this.order_state_id = order_state_id;
	}

	public String getOrder_state() {
		return order_state;
	}

	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}
}
