/*
任务分配业务逻辑接口
 */
package main.java.cn.com.sxu.logistics.service;

import main.java.cn.com.sxu.logistics.model.TaskForm;

public interface TaskDistributeService {
	/* 检查分站库房是否到货 */
	public boolean isProductArrival();

	/* 根据任务单号修改任务分配信息 */
	public void updateTaskDistribute(TaskForm taskForm);

}
