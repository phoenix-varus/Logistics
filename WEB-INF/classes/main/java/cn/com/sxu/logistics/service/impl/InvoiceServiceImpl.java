/*
发票管理业务逻辑实现层
 */
package main.java.cn.com.sxu.logistics.service.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.cn.com.sxu.logistics.dao.InvoiceDao;
import main.java.cn.com.sxu.logistics.dao.impl.InvoiceDaoImpl;
import main.java.cn.com.sxu.logistics.model.Invoice;
import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.TaskForm;
import main.java.cn.com.sxu.logistics.service.InvoiceService;

public class InvoiceServiceImpl implements InvoiceService {
	private Invoice invoice = new Invoice();
	private List<Invoice> invoiceList = new ArrayList<Invoice>();
	private InvoiceDao invoiceDao = new InvoiceDaoImpl();

	@Override
	public boolean isInvoiceGet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Invoice getInvoice(String invoice_id) {
		if (invoice_id != null) {
			invoice = invoiceDao.getInvoiceByInvoice_Id(invoice_id);
		} else {
			invoiceList = invoiceDao.getInvoiceList();
			if (invoiceList.size() > 0) {
				invoice = invoiceList.get(0);
			} else
				invoice = null;
		}
		return invoice;
	}

	/* 查询发票列表 */
	@Override
	public List<Invoice> getInvoiceList() {
		invoiceList = invoiceDao.getInvoiceList();
		return invoiceList;
	}

	/* 根据订单号删除发票 */
	@Override
	public void deleteInvoiceByOrder_Id(String order_id) {
		invoiceDao.deleteInvoiceByOrder_id(order_id);
	}

	@Override
	public void addInvoiceByOrder_Id(OrderForm orderForm, TaskForm taskForm) {
		invoiceDao.addInvoiceByOrder_id(orderForm, taskForm);
	}

}
