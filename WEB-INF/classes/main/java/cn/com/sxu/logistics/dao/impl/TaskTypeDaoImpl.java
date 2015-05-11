/*
任务类型信息数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.TaskTypeDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.TaskType;

@Component("taskTypeDaoImpl")
public class TaskTypeDaoImpl implements TaskTypeDao {
	List<TaskType> taskTypeList = new ArrayList<TaskType>();
	TaskType taskType;
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;

	/* 根据任务类型号查询任务类型 */
	@Override
	public TaskType getTaskTypeByTask_Type_Id(String task_type_id) {

		try {
			db.getConnection();
			String sql = "select * from taskType where task_type_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_type_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskType = new TaskType();
				taskType.setTask_type_id(rs.getString("task_type_id"));
				taskType.setTask_type(rs.getString("task_type"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return taskType;
	}

	/* 根据任务类型查询任务类型号 */
	@Override
	public TaskType getTaskTypeByTask_Type(String task_type) {
		try {
			db.getConnection();
			String sql = "select * from taskType where task_type = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_type);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskType = new TaskType();
				taskType.setTask_type_id(rs.getString("task_type_id"));
				taskType.setTask_type(rs.getString("task_type"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return taskType;
	}

	/* 查询任务类型列表 */
	@Override
	public List<TaskType> getTaskTypeList() {
		try {
			db.getConnection();
			String sql = "select * from taskType";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskType = new TaskType();
				taskType.setTask_type_id(rs.getString("task_type_id"));
				taskType.setTask_type(rs.getString("task_type"));
				taskTypeList.add(taskType);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return taskTypeList;
	}

}
