/*
任务单查询业务逻辑实现层
 */
package main.java.cn.com.sxu.logistics.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.TaskFormDao;
import main.java.cn.com.sxu.logistics.dao.TaskStateDao;
import main.java.cn.com.sxu.logistics.dao.TaskTypeDao;
import main.java.cn.com.sxu.logistics.dao.impl.TaskFormDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskStateDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskTypeDaoImpl;
import main.java.cn.com.sxu.logistics.model.TaskForm;
import main.java.cn.com.sxu.logistics.model.TaskState;
import main.java.cn.com.sxu.logistics.model.TaskType;
import main.java.cn.com.sxu.logistics.service.TaskFormService;

@Component("taskFormServiceImpl")
public class TaskFormServiceImpl implements TaskFormService {
	private TaskFormDao taskFormDao = new TaskFormDaoImpl();
	private TaskTypeDao taskTypeDao = new TaskTypeDaoImpl();
	private TaskStateDao taskStateDao = new TaskStateDaoImpl();
	private TaskType taskType = new TaskType();
	private TaskState taskState = new TaskState();
	TaskForm taskForm = new TaskForm();
	List<TaskForm> taskFormList = new ArrayList<TaskForm>();

	/* 查询任务列表 */
	@Override
	public List<TaskForm> getTaskFormList(String task_date,
			String task_type_id, String task_state_id) {
		System.out.println(task_type_id);
		if ((task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals(""))
				&& (task_date != null && !task_date.equals(""))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date_Type_State(
					task_date, task_type_id, task_state_id);
		} else if ((task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals(""))
				&& (task_date == null || task_date.equals(""))) {
			taskFormList = taskFormDao
					.getTaskFormListByTask_Type_Id(task_type_id);
		} else if ((task_type_id == null || task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals(""))
				&& (task_date == null || task_date.equals(""))) {
			taskFormList = taskFormDao
					.getTaskFormListByTask_State_Id(task_state_id);
		} else if ((task_type_id == null || task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals(""))
				&& (task_date != null && !task_date.equals(""))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date(task_date);
		} else if ((task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals(""))
				&& (task_date == null || task_date.equals(""))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Type_State(
					task_type_id, task_state_id);
		} else if ((task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals(""))
				&& (task_date != null && !task_date.equals(""))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date_Type(
					task_date, task_type_id);
		} else if ((task_type_id == null || task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals(""))
				&& (task_date != null && !task_date.equals(""))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date_State(
					task_date, task_state_id);
		} else {
			taskFormList = taskFormDao.getTaskFormList();
		}
		return taskFormList;
	}

	/* 根据任务查询任务详情 */
	@Override
	public TaskForm getTaskFormByTask_Id(String task_id, String task_state_id) {
		if (task_id != null) {
			taskForm = taskFormDao.getTaskFormByTask_Id(task_id);
		} else if (task_state_id != null && !task_state_id.equals("")) {
			taskFormList = taskFormDao
					.getTaskFormListByTask_State_Id(task_state_id);
			if (taskFormList.size() > 0) {
				taskForm = taskFormList.get(0);
				for (int i = 1; i < taskFormList.size(); i++) {
					if (Date.valueOf(taskFormList.get(i).getTask_date())
							.before(Date.valueOf(taskForm.getTask_date()))) {
						taskForm = taskFormList.get(i);
					}
				}
			} else
				taskForm = null;
		} else {
			taskFormList = taskFormDao.getTaskFormList();
			if (taskFormList.size() > 0) {
				taskForm = taskFormList.get(0);
			} else
				taskForm = null;

		}
		return taskForm;
	}

	/* 添加任务单 */
	@Override
	public void addTaskForm(TaskForm taskForm) {
		taskFormDao.addTaskForm(taskForm);
	}

	/* 修改任务 */
	@Override
	public void updateTaskForm(TaskForm taskForm) {
		taskFormDao.updateTaskFormByTask_Type_Id(taskForm);

	}

	/* 删除任务 */
	@Override
	public void deleteTaskForm(String task_id) {
		taskFormDao.deleteTaskFormByTask_Type_Id(task_id);
	}

	/*
	 * getter---setter
	 */
	public TaskForm getTaskForm() {
		return taskForm;
	}

	@Resource(name = "taskForm")
	public void setTaskForm(TaskForm taskForm) {
		this.taskForm = taskForm;
	}

	public TaskFormDao getTaskFormDao() {
		return taskFormDao;
	}

	@Resource(name = "taskFormDaoImpl")
	public void setTaskFormDao(TaskFormDao taskFormDao) {
		this.taskFormDao = taskFormDao;
	}

	public TaskTypeDao getTaskTypeDao() {
		return taskTypeDao;
	}

	@Resource(name = "taskTypeDaoImpl")
	public void setTaskTypeDao(TaskTypeDao taskTypeDao) {
		this.taskTypeDao = taskTypeDao;
	}

	public TaskStateDao getTaskStateDao() {
		return taskStateDao;
	}

	@Resource(name = "taskStateDaoImpl")
	public void setTaskStateDao(TaskStateDao taskStateDao) {
		this.taskStateDao = taskStateDao;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public TaskState getTaskState() {
		return taskState;
	}

	public void setTaskState(TaskState taskState) {
		this.taskState = taskState;
	}

	/*
	 * getter---setter
	 */

}