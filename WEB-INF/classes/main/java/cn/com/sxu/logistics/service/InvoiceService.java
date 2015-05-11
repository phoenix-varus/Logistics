/*
发票管理业务逻辑接口
 */
package main.java.cn.com.sxu.logistics.service;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.Invoice;
import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.TaskForm;

public interface InvoiceService {
	/* 检查发票是否已经领用 */
	public boolean isInvoiceGet();

	/* 根据发票号发票信息查询 */
	public Invoice getInvoice(String invoice_id);

	/* 查询发票列表 */
	public List<Invoice> getInvoiceList();

	/* 根据订单号删除发票 */
	public void deleteInvoiceByOrder_Id(String order_id);

	/* 根据订单号添加发票 */
	public void addInvoiceByOrder_Id(OrderForm orderForm, TaskForm taskForm);
}
