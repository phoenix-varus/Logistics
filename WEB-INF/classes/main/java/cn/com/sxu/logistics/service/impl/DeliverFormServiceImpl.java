/*
配送签收单管理业务逻辑实现层
 */
package main.java.cn.com.sxu.logistics.service.impl;

import main.java.cn.com.sxu.logistics.dao.TaskFormDao;
import main.java.cn.com.sxu.logistics.dao.impl.TaskFormDaoImpl;
import main.java.cn.com.sxu.logistics.model.TaskForm;
import main.java.cn.com.sxu.logistics.service.DeliverFormService;

public class DeliverFormServiceImpl implements DeliverFormService {
	private TaskForm taskForm = new TaskForm();
	private TaskFormDao taskFormDao = new TaskFormDaoImpl();
	private boolean isdistribute = false;

	@Override
	public boolean isDistributed(String task_id) {
		taskForm = taskFormDao.getTaskFormByTask_Id(task_id);
		if (taskForm.getDeliver_id() != null) {
			isdistribute = true;
		} else {
			isdistribute = false;
		}
		return isdistribute;
	}

	@Override
	public void updateDeliverByTask_Id(TaskForm taskForm) {
		taskFormDao.addTaskForm(taskForm);
	}

	public TaskForm getTaskForm() {
		return taskForm;
	}

	public void setTaskForm(TaskForm taskForm) {
		this.taskForm = taskForm;
	}

	public boolean isIsdistribute() {
		return isdistribute;
	}

	public void setIsdistribute(boolean isdistribute) {
		this.isdistribute = isdistribute;
	}

}
