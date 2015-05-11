/*
回执录入
 */
package main.java.cn.com.sxu.logistics.model;

import org.springframework.stereotype.Component;

@Component("reaction")
public class Reaction {
	/* 任务单编号 */
	private String task_id;
	/* 配送员编号 */
	private String deliver_id;
	/* 备注 */
	private String remark;
	/* 客户满意度 */
	private String satisfaction;

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getDeliver_id() {
		return deliver_id;
	}

	public void setDeliver_id(String deliver_id) {
		this.deliver_id = deliver_id;
	}
}
