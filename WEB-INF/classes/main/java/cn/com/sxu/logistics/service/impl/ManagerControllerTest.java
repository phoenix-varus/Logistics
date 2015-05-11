/*
系统总的控制层
 */
package main.java.cn.com.sxu.logistics.service.impl;

import main.java.cn.com.sxu.logistics.controller.ManagerController;
import main.java.cn.com.sxu.logistics.model.TaskForm;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManagerControllerTest {

	@Test
	public void test() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");
		@SuppressWarnings("unused")
		ManagerController managerController = (ManagerController) ctx
				.getBean("managerController");
		/*
		 * User user = new User(); user.setUsername("haha");
		 * managerController.getUserManagerService().userCheck(user);
		 */
		TaskForm taskForm = new TaskForm();
		taskForm.setTask_id("003");
	}

}
