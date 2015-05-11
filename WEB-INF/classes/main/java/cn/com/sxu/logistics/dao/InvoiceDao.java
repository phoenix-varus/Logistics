/*
发票信息接口层
 */
package main.java.cn.com.sxu.logistics.dao;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.Invoice;
import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.TaskForm;

public interface InvoiceDao {
	/* 根据发票编号查询发票信息 */
	public Invoice getInvoiceByInvoice_Id(String invoice_id);

	/* 查询发票信息 */
	public Invoice getInvoice();

	/* 根据原来的发票编号修改发票信息 */
	public Invoice getInvoiceByOriginal_Invoice_Id(String original_invoice_id);

	/* 根据订单编号查询发票信息 */
	public Invoice getInvoiceByOrder_Id(String order_id);

	/* 根据分站编号查询发票信息列表 */
	public List<Invoice> getInvoiceListBySubstation_Id(String substation_id);

	/* 根据配送员编号查询发票信息列表 */
	public List<Invoice> getInvoiceListByDeliver_Id(String deliver_id);

	/* 根据发票领取日期查询发票信息列表 */
	public List<Invoice> getInvoiceListByReceived_Date(String received_date);

	/* 根据发票作废日期查询发票信息列表 */
	public List<Invoice> getInvoiceListByInvalid_Date(String invalid_date);

	/* 根据是否需要发票查询发票信息列表 */
	public List<Invoice> getInvoiceListByIsrequired(String isrequired);

	/* 根据发票状态查询发票信息列表 */
	public List<Invoice> getInvoiceListByInvoice_State_Id(
			String invoice_state_id);

	/* 查询发票信息列表 */
	public List<Invoice> getInvoiceList();

	/* 增加发票信息 */
	public Invoice addInvoice(Invoice invoice);

	/* 根据发票编号修改发票信息 */
	public Invoice updateInvoiceByInvoice_id(String invoice_id);

	/* 根据发票编号删除发票信息 */
	public Invoice deleteInvoiceByInvoice_id(String invoice_id);

	/* 根据发票编号删除发票信息 */
	public void deleteInvoiceByOrder_id(String order_id);

	/* 根据发票编号删除发票信息 */
	public void addInvoiceByOrder_id(OrderForm orderForm, TaskForm taskForm);
}
