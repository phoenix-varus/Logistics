/*
任务单信息
 */
package main.java.cn.com.sxu.logistics.model;

import org.springframework.stereotype.Component;

@Component("taskForm")
public class TaskForm {
	/* 任务单号 */
	private String task_id;
	/* 订单号 */
	private String order_id;
	/* 处理分站编号 */
	private String substation_id;
	/* 任务要求完成日期 */
	private String task_date;
	/* 任务类型编号 */
	private String task_type_id;
	/* 任务状态 编号 */
	private String task_state_id;
	/* 配送员编号 */
	private String deliver_id;

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getSubstation_id() {
		return substation_id;
	}

	public void setSubstation_id(String substation_id) {
		this.substation_id = substation_id;
	}

	public String getTask_date() {
		return task_date;
	}

	public void setTask_date(String task_date) {
		this.task_date = task_date;
	}

	public String getDeliver_id() {
		return deliver_id;
	}

	public void setDeliver_id(String deliver_id) {
		this.deliver_id = deliver_id;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getTask_type_id() {
		return task_type_id;
	}

	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}

	public String getTask_state_id() {
		return task_state_id;
	}

	public void setTask_state_id(String task_state_id) {
		this.task_state_id = task_state_id;
	}

}
