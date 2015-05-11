/*
发票状态信息
 */
package main.java.cn.com.sxu.logistics.model;

public class InvoiceState {
	/* 发票状态编号 */
	private String invoice_state_id;
	/* 发票状态名 */
	private String invoice_state;

	public String getInvoice_state_id() {
		return invoice_state_id;
	}

	public void setInvoice_state_id(String invoice_state_id) {
		this.invoice_state_id = invoice_state_id;
	}

	public String getInvoice_state() {
		return invoice_state;
	}

	public void setInvoice_state(String invoice_state) {
		this.invoice_state = invoice_state;
	}
}
