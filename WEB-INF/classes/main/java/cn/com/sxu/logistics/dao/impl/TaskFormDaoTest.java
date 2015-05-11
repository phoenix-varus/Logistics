package main.java.cn.com.sxu.logistics.dao.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.cn.com.sxu.logistics.dao.DeliverDao;
import main.java.cn.com.sxu.logistics.dao.TaskFormDao;
import main.java.cn.com.sxu.logistics.model.Deliver;

import org.junit.Test;

public class TaskFormDaoTest {

	@Test
	public void testGetTaskFormByTask_Id() {
		TaskFormDao taskFormDao = new TaskFormDaoImpl();
		List<Deliver> deliverList = new ArrayList<Deliver>();
		DeliverDao deliverDao = new DeliverDaoImpl();
		System.out.println(taskFormDao);
		System.out.println(taskFormDao.getTaskFormByTask_Id("003"));
		System.out.println(taskFormDao.getTaskForm().getSubstation_id());
		deliverList = deliverDao.getDeliverListByDeliver_State("busy");
		deliverList = deliverDao.getDeliverListByDeliver_State("准备");
		System.out.println(deliverList.get(2).getDeliver_name());
	}
}
