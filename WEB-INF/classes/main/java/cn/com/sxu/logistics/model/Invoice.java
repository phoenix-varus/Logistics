/*
发票信息
 */
package main.java.cn.com.sxu.logistics.model;

public class Invoice {
	/* 发票编号 */
	private String invoice_id;
	/* 原发票号 */
	private String original_invoice_id;
	/* 商品编号 */
	private String product_id;
	/* 商品名称*/
	private String product_name;
	/* 商品数量 */
	private String product_num;
	/* 发票金额 */
	private String invoice_amount;
	/* 领用日期 */
	private String received_date;
	/* 作废日期 */
	private String invalid_date;
	/* 领用人 */
	private String received_man;
	/* 作废人 */
	private String invalid_man;
	/* 发票状态编号 */
	private String invoice_state_id;
	/* 订单号 */
	private String order_id;
	/* 分站编号 */
	private String substation_id;
	/* 配送员编号 */
	private String deliver_id;
	/* 备注 */
	private String remark;
	/* 是否需要发票 */
	private String isrequired;

	public String getDeliver_id() {
		return deliver_id;
	}

	public void setDeliver_id(String deliver_id) {
		this.deliver_id = deliver_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_num() {
		return product_num;
	}

	public void setProduct_num(String product_num) {
		this.product_num = product_num;
	}

	public String getInvoice_amount() {
		return invoice_amount;
	}

	public void setInvoice_amount(String invoice_amount) {
		this.invoice_amount = invoice_amount;
	}

	public String getReceived_date() {
		return received_date;
	}

	public void setReceived_date(String received_date) {
		this.received_date = received_date;
	}

	public String getInvalid_date() {
		return invalid_date;
	}

	public void setInvalid_date(String invalid_date) {
		this.invalid_date = invalid_date;
	}

	public String getReceived_man() {
		return received_man;
	}

	public void setReceived_man(String received_man) {
		this.received_man = received_man;
	}

	public String getInvalid_man() {
		return invalid_man;
	}

	public void setInvalid_man(String invalid_man) {
		this.invalid_man = invalid_man;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getSubstation_id() {
		return substation_id;
	}

	public void setSubstation_id(String substation_id) {
		this.substation_id = substation_id;
	}

	public String getInvoice_state_id() {
		return invoice_state_id;
	}

	public void setInvoice_state_id(String invoice_state_id) {
		this.invoice_state_id = invoice_state_id;
	}

	public String getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}

	public String getOriginal_invoice_id() {
		return original_invoice_id;
	}

	public void setOriginal_invoice_id(String original_invoice_id) {
		this.original_invoice_id = original_invoice_id;
	}

	public String getIsrequired() {
		return isrequired;
	}

	public void setIsrequired(String isrequired) {
		this.isrequired = isrequired;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

}
