/*
任务状态信息
 */
package main.java.cn.com.sxu.logistics.model;

import org.springframework.stereotype.Component;

@Component("taskType")
public class TaskType {
	/* 任务类型编码 */
	private String task_type_id;
	/* 任务类型名 */
	private String task_type;

	public String getTask_type_id() {
		return task_type_id;
	}

	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}
}
