/*
发票状态数据接口层
 */
package main.java.cn.com.sxu.logistics.dao;

import main.java.cn.com.sxu.logistics.model.InvoiceState;

public interface InvoiceStateDao {
	/* 根据发票状态编号查询发票状态信息 */
	public InvoiceState getInvoiceStateByInvoice_State_Id(
			String invoice_state_id);

	/* 根据发票状态名查询发票状态信息 */
	public InvoiceState getInvoiceStateByInvoice_State(String invoice_state);
}
