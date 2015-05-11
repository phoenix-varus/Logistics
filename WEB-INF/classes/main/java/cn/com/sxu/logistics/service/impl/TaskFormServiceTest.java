package main.java.cn.com.sxu.logistics.service.impl;

import main.java.cn.com.sxu.logistics.service.TaskFormService;
import main.java.cn.com.sxu.logistics.service.impl.TaskFormServiceImpl;

import org.junit.Test;

public class TaskFormServiceTest {

	@Test
	public void testGetTaskFormViewByTask_Id() {
		TaskFormService taskFormService = new TaskFormServiceImpl();
		System.out.println(taskFormService.getTaskFormByTask_Id("003", null));
		System.out.println(taskFormService.getTaskFormList(null, null, null));
	}

}
