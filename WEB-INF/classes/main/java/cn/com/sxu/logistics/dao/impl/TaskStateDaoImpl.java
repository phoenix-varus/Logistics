/*
任务状态信息数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.TaskStateDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.TaskState;

@Component("taskStateDaoImpl")
public class TaskStateDaoImpl implements TaskStateDao {
	TaskState taskState;
	List<TaskState> taskStateList = new ArrayList<TaskState>();
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;

	/* 根据任务状态号查询任务状态 */
	@Override
	public TaskState getTaskStateByTask_State_Id(String task_state_id) {
		try {
			String sql = "select * from taskstate where task_state_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskState = new TaskState();
				taskState.setTask_state_id(rs.getString("task_state_id"));
				taskState.setTask_state(rs.getString("task_state"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskState;
	}

	/* 根据任务状态查询任务状态号 */
	@Override
	public TaskState getTaskStateByTask_State(String task_state) {
		try {

			String sql = "select * from taskstate where task_state = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_state);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskState = new TaskState();
				taskState.setTask_state_id(rs.getString("task_state_id"));
				taskState.setTask_state(rs.getString("task_state"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskState;
	}

	/* 查询任务状态列表 */
	@Override
	public List<TaskState> getTaskStateList() {
		try {
			String sql = "select * from taskstate ";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskState = new TaskState();
				taskState.setTask_state_id(rs.getString("task_state_id"));
				taskState.setTask_state(rs.getString("task_state"));
				taskStateList.add(taskState);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskStateList;
	}

}
