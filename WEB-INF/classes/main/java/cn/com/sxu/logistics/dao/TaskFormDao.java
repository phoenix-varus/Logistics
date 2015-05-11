/*
任务单信息数据接口
 */
package main.java.cn.com.sxu.logistics.dao;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.TaskForm;

public interface TaskFormDao {
	/* 根据任务编号来查询任务单 */
	public TaskForm getTaskFormByTask_Id(String task_id);

	/* 无目的查询任务单 */
	TaskForm getTaskForm();

	/* 查询一项未分配任务单 */
	TaskForm getTaskFormByTask_State_Id(String task_state_id);

	/* 查询任务单列表 */
	public List<TaskForm> getTaskFormList();

	/* 根据任务要求完成时间查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Date(String task_date);

	/* 根据任务类型来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Type_Id(String task_type_id);

	/* 根据任务状态来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_State_Id(String task_state_id);

	/* 根据配送员查询任务单列表 */
	public List<TaskForm> getTaskFormListByDeliver_Id(String deliver_id);

	/* 根据任务要求完成日期和任务类型来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Date_Type(String task_date,
			String task_type_id);

	/* 根据任务要求完成日期和任务状态来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Date_State(String task_date,
			String task_state_id);

	/* 根据任务要求完成日期和配送员来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Date_Deliver(String task_date,
			String deliver_id);

	/* 根据任务类型和任务状态来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Type_State(String task_type_id,
			String task_state_id);

	/* 根据任务类型和配送员来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Type_Deliver(
			String task_type_id, String deliver_id);

	/* 根据任务状态和配送员来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_State_Deliver(
			String task_state_id, String deliver_id);

	/* 根据任务任务要求完成日期和任务类型、任务状态来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Date_Type_State(
			String task_date, String task_type_id, String task_state_id);

	/* 根据任务任务要求完成日期和任务类型、配送员来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Date_Type_Deliver(
			String task_date, String task_type_id, String deliver_id);

	/* 根据任务类型和任务状态、配送员来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Type_State_Deliver(
			String task_type_id, String task_state_id, String deliver_id);

	/* 根据任务任务要求完成日期和任务状态、配送员来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Date_State_Deliver(
			String task_date, String task_state_id, String deliver_id);

	/* 根据任务任务要求完成日期和任务类型、任务状态、配送员来查询任务单列表 */
	public List<TaskForm> getTaskFormListByTask_Date_Type_State_Deliver(
			String task_date, String task_type_id, String task_state_id,
			String deliver_id);

	/* 添加任务单 */
	public void addTaskForm(TaskForm taskForm);

	/* 根据任务编号来修改任务单 */
	public void updateTaskFormByTask_Type_Id(TaskForm taskForm);

	/* 根据任务编号来删除任务单 */
	public void deleteTaskFormByTask_Type_Id(String task_id);

}
