/*
配送签收单管理逻辑业务接口
 */
package main.java.cn.com.sxu.logistics.service;

import main.java.cn.com.sxu.logistics.model.TaskForm;

public interface DeliverFormService {
	/* 检查任务单是否分配 */
	public boolean isDistributed(String task_id);

	/* 根据任务单号修改配送签收单 */
	public void updateDeliverByTask_Id(TaskForm taskForm);
}
