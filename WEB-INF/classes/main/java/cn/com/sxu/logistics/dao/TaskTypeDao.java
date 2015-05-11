/*
任务类型数据接口
 */
package main.java.cn.com.sxu.logistics.dao;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.TaskType;

public interface TaskTypeDao {
	/* 根据任务类型查询任务类型信息 */
	public TaskType getTaskTypeByTask_Type_Id(String task_type_id);

	/* 根据任务名查询任务类型信息 */
	public TaskType getTaskTypeByTask_Type(String task_type);

	/* 查询任务类型列表 */
	public List<TaskType> getTaskTypeList();
}
