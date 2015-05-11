/*
任务状态信息
 */
package main.java.cn.com.sxu.logistics.model;

import org.springframework.stereotype.Component;

@Component("taskState")
public class TaskState {
	/* 任务状态编码 */
	private String task_state_id;
	/* 任务状态 */
	private String task_state;

	public String getTask_state_id() {
		return task_state_id;
	}

	public void setTask_state_id(String task_state_id) {
		this.task_state_id = task_state_id;
	}

	public String getTask_state() {
		return task_state;
	}

	public void setTask_state(String task_state) {
		this.task_state = task_state;
	}
}
