/*
任务状态信息数据接口
 */
package main.java.cn.com.sxu.logistics.dao;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.TaskState;

public interface TaskStateDao {
	/* 根据任务状态编号查询任务状态信息 */
	public TaskState getTaskStateByTask_State_Id(String task_state_id);

	/* 根据任务状态名查询任务状态信息 */
	public TaskState getTaskStateByTask_State(String task_state);

	/* 查询任务状态列表 */
	public List<TaskState> getTaskStateList();
}
