/*
任务单查询业务逻辑处理接口
 */
package main.java.cn.com.sxu.logistics.service;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.TaskForm;

public interface TaskFormService {
	/* 任务单信息列表查询 */
	public List<TaskForm> getTaskFormList(String task_date,
			String task_type_id, String task_state_id);

	/* 根据任务单号查询任务单信息 */
	public TaskForm getTaskFormByTask_Id(String task_id, String task_state_id);

	/* 添加新任务单 */
	public void addTaskForm(TaskForm taskForm);

	/* 修改任务 */
	public void updateTaskForm(TaskForm taskForm);

	/* 修改任务 */
	public void deleteTaskForm(String task_id);
}
