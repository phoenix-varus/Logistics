/*
订单信息
 */
package main.java.cn.com.sxu.logistics.model;

import org.springframework.stereotype.Component;

@Component("orderForm")
public class OrderForm {
	/* 订单号 */
	private String order_id;
	/* 原订单号 */
	private String original_order_id;
	/* 任务单号 */
	private String task_id;
	/* 商品号 */
	private String product_id;
	/* 商品名称 */
	private String product_name;
	/* 商品数量 */
	private String product_num;
	/* 商品总价 */
	private String product_collection;
	/* 商品退货款总额 */
	private String product_refund;
	/* 送货日期 */
	private String task_date;
	/* 客户名 */
	private String customer_name;
	/* 客户地址 */
	private String customer_address;
	/* 客户电话 */
	private String customer_call;
	/* 客户邮编 */
	private String customer_zipcode;
	/* 分站编号 */
	private String substation_id;
	/* 订单类型编号 */
	private String order_type_id;
	/* 订单状态 编号 */
	private String order_state_id;
	/* 备注 */
	private String remark;

	public String getOrder_type_id() {
		return order_type_id;
	}

	public void setOrder_type_id(String order_type_id) {
		this.order_type_id = order_type_id;
	}

	public String getOrder_state_id() {
		return order_state_id;
	}

	public void setOrder_state_id(String order_state_id) {
		this.order_state_id = order_state_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getOriginal_order_id() {
		return original_order_id;
	}

	public void setOriginal_order_id(String original_order_id) {
		this.original_order_id = original_order_id;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getTask_date() {
		return task_date;
	}

	public void setTask_date(String task_date) {
		this.task_date = task_date;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getCustomer_call() {
		return customer_call;
	}

	public void setCustomer_call(String customer_call) {
		this.customer_call = customer_call;
	}

	public String getCustomer_zipcode() {
		return customer_zipcode;
	}

	public void setCustomer_zipcode(String customer_zipcode) {
		this.customer_zipcode = customer_zipcode;
	}

	public String getSubstation_id() {
		return substation_id;
	}

	public void setSubstation_id(String substation_id) {
		this.substation_id = substation_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getProduct_num() {
		return product_num;
	}

	public void setProduct_num(String product_num) {
		this.product_num = product_num;
	}

	public String getProduct_collection() {
		return product_collection;
	}

	public void setProduct_collection(String product_collection) {
		this.product_collection = product_collection;
	}

	public String getProduct_refund() {
		return product_refund;
	}

	public void setProduct_refund(String product_refund) {
		this.product_refund = product_refund;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

}
