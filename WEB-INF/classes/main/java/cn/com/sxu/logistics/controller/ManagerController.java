package main.java.cn.com.sxu.logistics.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.java.cn.com.sxu.logistics.dao.DeliverDao;
import main.java.cn.com.sxu.logistics.dao.OrderFormDao;
import main.java.cn.com.sxu.logistics.dao.SubstationDao;
import main.java.cn.com.sxu.logistics.dao.TaskStateDao;
import main.java.cn.com.sxu.logistics.dao.TaskTypeDao;
import main.java.cn.com.sxu.logistics.dao.impl.DeliverDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.OrderFormDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.SubstationDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskStateDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskTypeDaoImpl;
import main.java.cn.com.sxu.logistics.model.Deliver;
import main.java.cn.com.sxu.logistics.model.Invoice;
import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.ProductForm;
import main.java.cn.com.sxu.logistics.model.Reaction;
import main.java.cn.com.sxu.logistics.model.Substation;
import main.java.cn.com.sxu.logistics.model.TaskForm;
import main.java.cn.com.sxu.logistics.model.TaskState;
import main.java.cn.com.sxu.logistics.model.TaskType;
import main.java.cn.com.sxu.logistics.model.User;
import main.java.cn.com.sxu.logistics.service.InvoiceService;
import main.java.cn.com.sxu.logistics.service.PaymentService;
import main.java.cn.com.sxu.logistics.service.ReactionService;
import main.java.cn.com.sxu.logistics.service.TaskFormService;
import main.java.cn.com.sxu.logistics.service.UserManagerService;
import main.java.cn.com.sxu.logistics.service.impl.InvoiceServiceImpl;
import main.java.cn.com.sxu.logistics.service.impl.PaymentServiceImpl;
import main.java.cn.com.sxu.logistics.service.impl.ReactionServiceImpl;
import main.java.cn.com.sxu.logistics.service.impl.TaskFormServiceImpl;
import main.java.cn.com.sxu.logistics.service.impl.UserManagerServiceImpl;
import main.java.cn.com.sxu.logistics.tools.DateShow;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component("managerController")
public class ManagerController extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* 定义Request */
	private Map<String, Object> session;
	private UserManagerService userManagerService = new UserManagerServiceImpl();
	private User user = new User();
	private TaskFormService taskFormService = new TaskFormServiceImpl();
	private List<TaskForm> taskFormList = new ArrayList<TaskForm>();
	private TaskForm taskForm = new TaskForm();
	private TaskType taskType = new TaskType();
	private List<TaskType> taskTypeList = new ArrayList<TaskType>();
	private TaskTypeDao taskTypeDao = new TaskTypeDaoImpl();
	private List<TaskState> taskStateList = new ArrayList<TaskState>();
	private TaskState taskState = new TaskState();
	private TaskStateDao taskStateDao = new TaskStateDaoImpl();
	private List<Substation> substationList = new ArrayList<Substation>();
	private Substation substation = new Substation();
	private SubstationDao substationDao = new SubstationDaoImpl();
	private Deliver deliver = new Deliver();
	private List<Deliver> deliverList = new ArrayList<Deliver>();
	private DeliverDao deliverDao = new DeliverDaoImpl();
	private OrderForm orderForm = new OrderForm();
	private List<OrderForm> orderFormList = new ArrayList<OrderForm>();
	private OrderFormDao orderFormDao = new OrderFormDaoImpl();
	private Reaction reaction = new Reaction();
	private List<Reaction> reactionList = new ArrayList<Reaction>();
	private ReactionService reactionService = new ReactionServiceImpl();
	private List<ProductForm> productFormList = new ArrayList<ProductForm>();
	private PaymentService paymentService = new PaymentServiceImpl();
	private Invoice invoice = new Invoice();
	private List<Invoice> invoiceList = new ArrayList<Invoice>();
	private InvoiceService invoiceService = new InvoiceServiceImpl();
	// ---------------------------------------------------------------------
	private String username;
	private String password;
	private String task_state_id;
	private String task_type_id;
	private String task_date;
	private String task_id;
	private String deliver_id;
	private String deliver_state;
	private String task_date1;
	private String task_date2;
	private String product_name;
	private String substation_id;
	private String order_id;
	private String task_type;
	private String substation_name;
	private String satisfaction;
	private String deliver_name;
	private String remark;
	private String invoice_id;
	private String invoice_state_id;
	// ----------------------------------------------------------------------
	private String NOTASKERROR = "NOTASKERROR";
	private String NODELIVERERROR = "NODELIVERERROR";
	private String ADDTASKSUCCESS = "ADDTASKSUCCESS";
	private String DISTRIBUTETASKSUCCESS = "DISTRIBUTETASKSUCCESS";
	private String MODIFYREACTIONSUCCESS = "MODIFYREACTIONSUCCESS";
	private String MODIFYTASKSUCCESS = "MODIFYTASKSUCCESS";
	private String NODATAS = "NODATAS";
	private String PRINTINVOICESUCCESS = "PRINTINVOICESUCCESS";
	private String NOMODIFYTASK = "NOMODIFYTASK";

	// -----------------------------------------------------------------------
	/*
	 * getter---setter
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTask_state_id() {
		return task_state_id;
	}

	public void setTask_state_id(String task_state_id) {
		this.task_state_id = task_state_id;
	}

	public String getTask_type_id() {
		return task_type_id;
	}

	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}

	public String getTask_date() {
		return task_date;
	}

	public void setTask_date(String task_date) {
		this.task_date = task_date;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getDeliver_id() {
		return deliver_id;
	}

	public void setDeliver_id(String deliver_id) {
		this.deliver_id = deliver_id;
	}

	public String getTask_date1() {
		return task_date1;
	}

	public void setTask_date1(String task_date1) {
		this.task_date1 = task_date1;
	}

	public String getTask_date2() {
		return task_date2;
	}

	public void setTask_date2(String task_date2) {
		this.task_date2 = task_date2;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getSubstation_id() {
		return substation_id;
	}

	public void setSubstation_id(String substation_id) {
		this.substation_id = substation_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

	public String getSubstation_name() {
		return substation_name;
	}

	public void setSubstation_name(String substation_name) {
		this.substation_name = substation_name;
	}

	public String getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getDeliver_name() {
		return deliver_name;
	}

	public void setDeliver_name(String deliver_name) {
		this.deliver_name = deliver_name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}

	public String getInvoice_state_id() {
		return invoice_state_id;
	}

	public void setInvoice_state_id(String invoice_state_id) {
		this.invoice_state_id = invoice_state_id;
	}

	/*
	 * getter---setter
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/* 用户验证 */
	public String index() {
		boolean flag = true;
		user.setUsername(username);
		user.setPassword(password);
		flag = userManagerService.userCheck(user);
		if (flag == true) {
			session.put("user", user);
			return SUCCESS;
		} else
			return ERROR;
	}

	/* 添加任务单，前台展示 */
	public String addTaskForm() {
		orderFormList = orderFormDao.getOrderFormListByOrder_State_Id("0");
		if (orderFormList.size() > 0) {
			orderForm = orderFormList.get(0);

			/* 推送最为紧迫的任务 */
			for (int i = 1; i < orderFormList.size(); i++) {
				if (Date.valueOf(orderFormList.get(i).getTask_date()).before(
						Date.valueOf(orderForm.getTask_date()))) {
					orderForm = orderFormList.get(i);
				}
			}
			substationList = substationDao.getSubstationList();
			taskType = taskTypeDao.getTaskTypeByTask_Type_Id(orderForm
					.getOrder_state_id());
			session.put("orderForm", orderForm);
			session.put("substationList", substationList);
			session.put("taskType", taskType);
			return SUCCESS;
		} else
			return NODATAS;
	}

	/* 添加任务单，后台操作 */
	public String addTaskFormAction() {
		DateShow date = new DateShow();
		String d = date.dateShow();

		taskForm.setTask_id(task_id);
		taskForm.setOrder_id(order_id);
		taskForm.setSubstation_id(substation_id);
		taskForm.setTask_date(task_date);
		taskForm.setTask_type_id(task_type_id);
		if (Date.valueOf(taskForm.getTask_date()).before(Date.valueOf(d))) {
			taskForm.setTask_state_id("4");
		} else {
			taskForm.setTask_state_id("0");
		}
		taskFormService.addTaskForm(taskForm);
		// --------过期未分配任务直接作废
		// -------任务号存入订单表
		orderForm = orderFormDao.getOrderFormByOrder_Id(taskForm.getOrder_id());
		orderForm.setTask_id(task_id);
		orderForm.setOrder_state_id("1");
		orderFormDao.updateOrderFormByOrder_Id(orderForm);
		return ADDTASKSUCCESS;
	}

	/* 修改任务单，前台展示 */
	public String modifyTaskForm() {
		taskForm = taskFormService.getTaskFormByTask_Id(task_id, null);
		if (taskForm != null) {
			substation = substationDao.getSubstationBySubstation_Id(taskForm
					.getSubstation_id());
			taskTypeList = taskTypeDao.getTaskTypeList();
			session.put("taskForm", taskForm);
			session.put("substation", substation);
			session.put("taskTypeList", taskTypeList);

			if (Integer.parseInt(taskForm.getTask_state_id()) < 2) {
				return SUCCESS;
			} else {
				return NOMODIFYTASK;
			}
		} else
			return NODATAS;
	}

	/* 修改任务单，后台操作 */
	public String modifyTaskFormAction() {
		TaskForm taskForm1 = taskFormService
				.getTaskFormByTask_Id(task_id, null);
		taskForm.setTask_id(taskForm1.getTask_id());
		taskForm.setOrder_id(taskForm1.getOrder_id());
		taskForm.setTask_state_id(taskForm1.getTask_state_id());
		taskForm.setTask_type_id(task_type_id);
		taskForm.setTask_date(task_date);
		taskForm.setDeliver_id(taskForm1.getDeliver_id());
		taskForm.setSubstation_id(taskForm1.getSubstation_id());
		taskFormService.updateTaskForm(taskForm);
		return MODIFYTASKSUCCESS;
	}

	/* 删除任务单，后台操作 */
	public String deleteTaskForm() {
		taskForm = taskFormService.getTaskFormByTask_Id(task_id, null);
		// --------修改配送员状态
		if (Integer.valueOf(taskForm.getTask_state_id()) < 3) {
			deliver = deliverDao.getDeliverByDeliver_Id(taskForm
					.getDeliver_id());
			if (deliver != null) {
				deliver.setDeliver_state("0");
				deliverDao.updateDeliverByDeliver_Id(deliver);
			}
		}
		// ---------删除回执表
		reaction = reactionService.getReaction(task_id);
		if (reaction != null) {
			reactionService.deleteReaction(reaction.getTask_id());
		}
		// --------修改订单状态
		orderForm = orderFormDao.getOrderFormByTask_Id(task_id);
		if (orderForm != null) {
			orderForm.setOrder_state_id("0");
			orderForm.setTask_id(null);
			orderFormDao.updateOrderFormState(orderForm);
			// --------删除收款单
			paymentService.deleteProductForm(orderForm.getOrder_id());
			// ---------删除发票
			invoiceService.deleteInvoiceByOrder_Id(orderForm.getOrder_id());
		}
		taskFormService.deleteTaskForm(task_id);

		return MODIFYTASKSUCCESS;
	}

	/* 任务单查询列表 */
	public String showTaskFormList() {
		List<TaskForm> taskFormList1 = taskFormService.getTaskFormList(
				task_date, task_type_id, task_state_id);
		if (taskFormList1.size() > 0) {
			for (int i = 0; i < taskFormList1.size(); i++) {
				taskFormList.add(i,
						taskFormList1.get(taskFormList1.size() - 1 - i));
			}
			taskTypeList = taskTypeDao.getTaskTypeList();
			taskStateList = taskStateDao.getTaskStateList();
			session.put("taskFormList", taskFormList);
			session.put("taskTypeList", taskTypeList);
			session.put("taskStateList", taskStateList);
			return SUCCESS;
		} else
			return NODATAS;
	}

	/* 任务单查询详情 */
	public String showTaskForm() {
		taskForm = taskFormService.getTaskFormByTask_Id(task_id, null);
		if (taskForm != null) {
			taskType = taskTypeDao.getTaskTypeByTask_Type_Id(taskForm
					.getTask_type_id());
			taskState = taskStateDao.getTaskStateByTask_State_Id(taskForm
					.getTask_state_id());
			substation = substationDao.getSubstationBySubstation_Id(taskForm
					.getSubstation_id());
			deliver = deliverDao.getDeliverByDeliver_Id(taskForm
					.getDeliver_id());
			session.put("taskForm", taskForm);
			session.put("taskType", taskType);
			session.put("taskState", taskState);
			session.put("substation", substation);
			session.put("deliver", deliver);
			if (Integer.parseInt(taskForm.getTask_state_id()) < 2) {
				return SUCCESS;
			} else {
				return NOMODIFYTASK;
			}
		} else
			return NODATAS;
	}

	/* 可发送任务单查询列表 */
	public String hadDistributeTaskList() {
		List<TaskForm> taskFormList1 = taskFormService.getTaskFormList(
				task_date, task_type_id, task_state_id);
		if (taskFormList1.size() > 0) {
			for (int i = 0; i < taskFormList1.size(); i++) {
				taskFormList.add(i,
						taskFormList1.get(taskFormList1.size() - 1 - i));
			}
			taskTypeList = taskTypeDao.getTaskTypeList();
			taskStateList = taskStateDao.getTaskStateList();
			session.put("taskFormList", taskFormList);
			session.put("taskTypeList", taskTypeList);
			session.put("taskStateList", taskStateList);
			return SUCCESS;
		} else
			return NODATAS;
	}

	/* 可发送任务单查询详情,前台展示 */
	public String printDistributeForm() {
		taskForm = taskFormService.getTaskFormByTask_Id(task_id, null);
		orderForm = orderFormDao.getOrderFormByTask_Id(task_id);
		if (taskForm != null) {
			taskType = taskTypeDao.getTaskTypeByTask_Type_Id(taskForm
					.getTask_type_id());
			taskState = taskStateDao.getTaskStateByTask_State_Id(taskForm
					.getTask_state_id());
			substation = substationDao.getSubstationBySubstation_Id(taskForm
					.getSubstation_id());
			deliver = deliverDao.getDeliverByDeliver_Id(taskForm
					.getDeliver_id());
			session.put("taskForm", taskForm);
			session.put("orderForm", orderForm);
			session.put("taskType", taskType);
			session.put("taskState", taskState);
			session.put("substation", substation);
			session.put("deliver", deliver);
			return SUCCESS;
		} else
			return NODATAS;
	}

	/* 打印可发送任务单,后台操作 */
	public String printDistributeFormAction() {
		List<String> printList = new ArrayList<String>();
		TaskForm taskForm1 = taskFormService
				.getTaskFormByTask_Id(task_id, null);
		orderForm = orderFormDao.getOrderFormByTask_Id(task_id);
		substation = substationDao.getSubstationBySubstation_Id(orderForm
				.getSubstation_id());
		taskType = taskTypeDao.getTaskTypeByTask_Type_Id(taskForm1
				.getTask_type_id());
		deliver = deliverDao.getDeliverByDeliver_Id(taskForm1.getDeliver_id());

		taskForm.setTask_id(taskForm1.getTask_id());
		taskForm.setOrder_id(taskForm1.getOrder_id());
		taskForm.setSubstation_id(taskForm1.getSubstation_id());
		taskForm.setTask_date(taskForm1.getTask_date());
		taskForm.setTask_type_id(taskForm1.getTask_type_id());
		taskForm.setTask_state_id("2");
		taskForm.setDeliver_id(taskForm1.getDeliver_id());
		taskFormService.updateTaskForm(taskForm);

		orderForm.setOrder_state_id("2");
		orderForm.setTask_id(taskForm1.getTask_id());
		orderFormDao.updateOrderFormState(orderForm);

		String fname = "D:/" + taskForm1.getTask_id() + "_配送单.txt";
		try {
			File f = new File(fname);

			if (f.exists()) {
				System.out.println("文件存在");
			} else {
				System.out.println("文件不存在，正在创建...");
				if (f.createNewFile()) {
					System.out.println("文件创建成功！");
				} else {
					System.out.println("文件创建失败！");
				}
			}
			printList.add("订单号：" + taskForm1.getOrder_id() + "\r\n");
			printList.add("任务单号：" + taskForm1.getTask_id() + "\r\n");
			printList.add("商品名：" + orderForm.getProduct_name() + "\r\n");
			printList.add("客户姓名：" + orderForm.getCustomer_name() + "\r\n");
			printList.add("客户地址：" + orderForm.getCustomer_address() + "\r\n");
			printList.add("客户电话：" + orderForm.getCustomer_call() + "\r\n");
			printList.add("要求完成日期：" + orderForm.getTask_date() + "\r\n");
			printList.add("任务类型：" + taskType.getTask_type() + "\r\n");
			printList.add("处理分站：" + substation.getSubstation_name() + "\r\n");
			printList.add("配送员：" + deliver.getDeliver_name() + "\r\n");
			printList
					.add("------------------------------------------" + "\r\n");
			printList.add("备注：" + "__________________" + "\r\n");
			printList.add("满意度评分：" + "__（1-5分，5分为非常满意）" + "\r\n");
			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			for (int i = 0; i < printList.size(); i++) {
				output.write(printList.get(i));
				output.write("\r\n");
			}
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return MODIFYTASKSUCCESS;
	}

	/* 未分配任务单查询列表 */
	public String noDistributeTaskList() {
		List<TaskForm> taskFormList1 = taskFormService.getTaskFormList(
				task_date, task_type_id, task_state_id);
		if (taskFormList1.size() > 0) {
			for (int i = 0; i < taskFormList1.size(); i++) {
				taskFormList.add(i,
						taskFormList1.get(taskFormList1.size() - 1 - i));
			}
			taskTypeList = taskTypeDao.getTaskTypeList();
			taskStateList = taskStateDao.getTaskStateList();
			session.put("taskFormList", taskFormList);
			session.put("taskTypeList", taskTypeList);
			session.put("taskStateList", taskStateList);
			return SUCCESS;
		} else
			return NODATAS;
	}

	/* 任务分配，前台展示 */
	public String distributeTask() {
		task_state_id = "0";
		deliver_state = "0";
		taskForm = taskFormService.getTaskFormByTask_Id(task_id, task_state_id);
		if (taskForm != null) {
			taskType = taskTypeDao.getTaskTypeByTask_Type_Id(taskForm
					.getTask_type_id());
			taskState = taskStateDao.getTaskStateByTask_State_Id(taskForm
					.getTask_state_id());
			substation = substationDao.getSubstationBySubstation_Id(taskForm
					.getSubstation_id());
			deliverList = deliverDao
					.getDeliverListByDeliver_State(deliver_state);
			if (deliverList != null) {
				session.put("taskForm", taskForm);
				session.put("taskType", taskType);
				session.put("taskState", taskState);
				session.put("substation", substation);
				session.put("deliverList", deliverList);
				return SUCCESS;
			} else {
				return NODELIVERERROR;
			}
		} else
			return NOTASKERROR;

	}

	/* 任务分配，后台操作 */
	public String distributeTaskAction() {

		TaskForm taskForm1 = taskFormService
				.getTaskFormByTask_Id(task_id, null);
		/* 如果已有配送员需要将原先的配送员状态置为空闲 */
		if (taskForm1.getDeliver_id() != null) {
			deliver = deliverDao.getDeliverByDeliver_Id(taskForm1
					.getDeliver_id());
			deliver.setDeliver_state("0");
			deliverDao.updateDeliverByDeliver_Id(deliver);
		}

		taskForm.setTask_id(taskForm1.getTask_id());
		taskForm.setOrder_id(taskForm1.getOrder_id());
		taskForm.setSubstation_id(taskForm1.getSubstation_id());
		taskForm.setTask_date(taskForm1.getTask_date());
		taskForm.setTask_type_id(taskForm1.getTask_type_id());
		taskForm.setTask_state_id("1");
		taskForm.setDeliver_id(deliver_id);
		taskFormService.updateTaskForm(taskForm);
		// --------修改派送员状态
		deliver = deliverDao.getDeliverByDeliver_Id(deliver_id);
		deliver.setDeliver_state("1");
		deliverDao.updateDeliverByDeliver_Id(deliver);
		// ---------生成回执中任务单号
		reaction.setTask_id(task_id);
		reaction.setDeliver_id(deliver_id);
		reaction = reactionService.addReaction(reaction);
		// ----------修改订单状态
		orderForm = orderFormDao.getOrderFormByOrder_Id(taskForm.getOrder_id());
		if (orderForm != null) {
			orderForm.setOrder_state_id("1");
			orderForm.setTask_id(taskForm1.getTask_id());
			orderFormDao.updateOrderFormState(orderForm);
			// ----------添加发票
			invoiceService.addInvoiceByOrder_Id(orderForm, taskForm);
		}
		return DISTRIBUTETASKSUCCESS;
	}

	/* 任务回执单列表查询 */
	public String showReactionList() {
		reactionList = reactionService.getReactionList(task_date, task_type_id,
				task_state_id, deliver_id);
		taskTypeList = taskTypeDao.getTaskTypeList();
		taskStateList = taskStateDao.getTaskStateList();
		deliverList = deliverDao.getDeliverList();
		session.put("reactionList", reactionList);
		session.put("taskTypeList", taskTypeList);
		session.put("taskStateList", taskStateList);
		session.put("deliverList", deliverList);
		return SUCCESS;
	}

	/* 回执详情展示 */
	public String showReaction() {
		reaction = reactionService.getReaction(task_id);
		if (reaction != null) {
			deliver = deliverDao.getDeliverByDeliver_Id(reaction
					.getDeliver_id());
			session.put("reaction", reaction);
			session.put("deliver", deliver);
			return SUCCESS;
		} else
			return NODATAS;
	}

	/* 回执修改，前台展示 */
	public String modifyReaction() {
		reaction = reactionService.getReactionBySatisfaction(null);
		if (reaction != null) {
			deliver = deliverDao.getDeliverByDeliver_Id(reaction
					.getDeliver_id());
			session.put("reaction", reaction);
			session.put("deliver", deliver);
			return SUCCESS;
		} else
			return NODATAS;

	}

	/* 回执修改，后台操作 */
	public String modifyReactionAction() {
		reaction.setTask_id(task_id);
		Reaction reaction1 = reactionService.getReaction(task_id);
		reaction.setDeliver_id(reaction1.getDeliver_id());
		reaction.setRemark(remark);
		reaction.setSatisfaction(satisfaction);
		reactionService.updateReaction(reaction);
		// ---------修改配送员状态
		deliver = deliverDao.getDeliverByDeliver_Id(reaction1.getDeliver_id());
		deliver.setDeliver_state("0");
		deliverDao.updateDeliverByDeliver_Id(deliver);
		// ----------修改任务状态
		taskForm = taskFormService.getTaskFormByTask_Id(task_id, null);
		taskForm.setTask_state_id("3");
		taskFormService.updateTaskForm(taskForm);
		// ---------修改订单状态
		orderForm = orderFormDao.getOrderFormByOrder_Id(taskForm.getOrder_id());
		if (orderForm != null) {
			orderForm.setOrder_state_id("3");
			orderFormDao.updateOrderFormState(orderForm);
			// ---------修改收款单信息
			paymentService.addProductForm(orderForm);
		}
		return MODIFYREACTIONSUCCESS;
	}

	/* 商品缴费查询 */
	public String showPaymentList() {
		productFormList = paymentService.getProductFormList(task_date1,
				task_date2);
		session.put("productFormList", productFormList);
		return SUCCESS;
	}

	/* 发票列表查询 */
	public String showInvoiceList() {
		invoiceList = invoiceService.getInvoiceList();
		session.put("invoiceList", invoiceList);
		return SUCCESS;
	}

	/* 发票信息查询 */
	public String showInvoice() {
		invoice = invoiceService.getInvoice(invoice_id);
		if (invoice != null) {
			deliver = deliverDao
					.getDeliverByDeliver_Id(invoice.getDeliver_id());
			substation = substationDao.getSubstationBySubstation_Id(invoice
					.getSubstation_id());
			session.put("invoice", invoice);
			session.put("deliver", deliver);
			session.put("substation", substation);
			return SUCCESS;
		} else
			return NODATAS;
	}

	public String printInvoice() {
		List<String> printList = new ArrayList<String>();
		invoice = invoiceService.getInvoice(invoice_id);
		substation = substationDao.getSubstationBySubstation_Id(invoice
				.getSubstation_id());
		deliver = deliverDao.getDeliverByDeliver_Id(invoice.getDeliver_id());
		String fname = "D:/" + invoice.getInvoice_id() + "_发票单.txt";
		try {
			File f = new File(fname);

			if (f.exists()) {
				System.out.println("文件存在");
			} else {
				System.out.println("文件不存在，正在创建...");
				if (f.createNewFile()) {
					System.out.println("文件创建成功！");
				} else {
					System.out.println("文件创建失败！");
				}
			}
			printList.add("发票单号：" + invoice_id + "\r\n");
			printList.add("商品号：" + invoice.getProduct_id() + "\r\n");
			printList.add("商品名：" + invoice.getProduct_name() + "\r\n");
			printList.add("商品数量：" + invoice.getProduct_num() + "\r\n");
			printList.add("商品总价：" + invoice.getInvoice_amount() + "\r\n");
			printList.add("领取日期：" + "__________" + "\r\n\r");
			printList.add("发票领取人：" + "__________" + "\r\n");
			printList.add("作废日期：" + "_________" + "\r\n");
			printList.add("发票注销人：" + "__________" + "\r\n");
			printList.add("订单号：" + invoice.getOrder_id() + "\r\n");
			printList.add("处理分站：" + substation.getSubstation_name() + "\r\n");
			printList.add("配送员：" + deliver.getDeliver_name() + "\r\n");
			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			for (int i = 0; i < printList.size(); i++) {
				output.write(printList.get(i));
				output.write("\r\n");
			}
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return PRINTINVOICESUCCESS;
	}

	/* 表中无数据返回界面 */
	public String noDatas() {
		return SUCCESS;
	}

	/* 未签收订单，前台展示 */
	public String noGetOrderList() {
		taskFormList = taskFormService.getTaskFormList(null, null, "4");
		if (taskFormList.size() > 0) {
			for (int i = 0; i < taskFormList.size(); i++) {
				orderForm = orderFormDao.getOrderFormByTask_Id(taskFormList
						.get(i).getTask_id());
				orderFormList.add(orderForm);
			}
			session.put("taskFormList", taskFormList);
			session.put("orderFormList", orderFormList);
			return SUCCESS;
		} else
			return NODATAS;
	}
}
