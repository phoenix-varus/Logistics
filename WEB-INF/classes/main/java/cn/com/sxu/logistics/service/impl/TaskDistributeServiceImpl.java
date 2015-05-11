/*
任务分配业务逻辑实现层
 */
package main.java.cn.com.sxu.logistics.service.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.cn.com.sxu.logistics.dao.OrderStateDao;
import main.java.cn.com.sxu.logistics.dao.TaskFormDao;
import main.java.cn.com.sxu.logistics.dao.TaskStateDao;
import main.java.cn.com.sxu.logistics.dao.TaskTypeDao;
import main.java.cn.com.sxu.logistics.dao.impl.OrderStateDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskFormDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskStateDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskTypeDaoImpl;
import main.java.cn.com.sxu.logistics.model.OrderForm;
import main.java.cn.com.sxu.logistics.model.TaskForm;
import main.java.cn.com.sxu.logistics.service.TaskDistributeService;

public class TaskDistributeServiceImpl implements TaskDistributeService {
	private TaskForm taskForm = new TaskForm();
	private OrderForm orderForm = new OrderForm();
	List<TaskForm> taskFormList = new ArrayList<TaskForm>();
	private TaskFormDao taskFormDao = new TaskFormDaoImpl();
	private TaskTypeDao taskTypeDao = new TaskTypeDaoImpl();
	private TaskStateDao taskStateDao = new TaskStateDaoImpl();
	private OrderStateDao orderStateDao = new OrderStateDaoImpl();

	/*
	 * getter--setter
	 */
	public TaskForm getTaskForm() {
		return taskForm;
	}

	public void setTaskForm(TaskForm taskForm) {
		this.taskForm = taskForm;
	}

	public OrderForm getOrderForm() {
		return orderForm;
	}

	public void setOrderForm(OrderForm orderForm) {
		this.orderForm = orderForm;
	}

	public List<TaskForm> getTaskFormList() {
		return taskFormList;
	}

	public void setTaskFormList(List<TaskForm> taskFormList) {
		this.taskFormList = taskFormList;
	}

	public TaskFormDao getTaskFormDao() {
		return taskFormDao;
	}

	public void setTaskFormDao(TaskFormDao taskFormDao) {
		this.taskFormDao = taskFormDao;
	}

	public TaskTypeDao getTaskTypeDao() {
		return taskTypeDao;
	}

	public void setTaskTypeDao(TaskTypeDao taskTypeDao) {
		this.taskTypeDao = taskTypeDao;
	}

	public TaskStateDao getTaskStateDao() {
		return taskStateDao;
	}

	public void setTaskStateDao(TaskStateDao taskStateDao) {
		this.taskStateDao = taskStateDao;
	}

	public OrderStateDao getOrderStateDao() {
		return orderStateDao;
	}

	public void setOrderStateDao(OrderStateDao orderStateDao) {
		this.orderStateDao = orderStateDao;
	}

	/*
	 * getter--setter
	 */

	/* 检查库房是否到货 */
	@Override
	public boolean isProductArrival() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateTaskDistribute(TaskForm taskForm) {
		taskFormDao.addTaskForm(taskForm);
	}
}
