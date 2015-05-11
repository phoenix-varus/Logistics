/*
任务单信息数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.TaskFormDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.TaskForm;

@Component("taskFormDaoImpl")
public class TaskFormDaoImpl implements TaskFormDao {
	TaskForm taskForm;
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;
	List<TaskForm> taskFormList = new ArrayList<TaskForm>();

	/* 根据任务单号获取任务单信息 */
	@Override
	public TaskForm getTaskFormByTask_Id(String task_id) {

		try {
			String sql = "select * from taskForm where task_id = ?";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskForm;
	}

	/* 根据任务单号获取任务单信息 */
	@Override
	public TaskForm getTaskForm() {

		try {
			String sql = "select * from taskForm ";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskForm;
	}

	/* 根据任务要求结束时间获得任务单列表 */
	@Override
	public List<TaskForm> getTaskFormListByTask_Date(String task_date) {
		try {

			String sql = "select * from taskForm where task_date = ?";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	/* 根据任务类型获取任务单列表 */
	@Override
	public List<TaskForm> getTaskFormListByTask_Type_Id(String task_type_id) {
		try {

			String sql = "select * from taskForm where task_type_id = ?";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_type_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	/* 根据任务状态获取任务单列表 */
	@Override
	public List<TaskForm> getTaskFormListByTask_State_Id(String task_state_id) {
		try {

			String sql = "select * from taskForm where task_state_id = ?";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	/* 添加任务单 */
	@Override
	public void addTaskForm(TaskForm taskForm) {

		try {
			String sql = "insert into taskForm (task_id,order_id,task_date,task_state_id,task_type_id,substation_id) values (?,?,?,?,?,?) ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, taskForm.getTask_id());
			ps.setString(2, taskForm.getOrder_id());
			ps.setString(3, taskForm.getTask_date());
			ps.setString(4, taskForm.getTask_state_id());
			ps.setString(5, taskForm.getTask_type_id());
			ps.setString(6, taskForm.getSubstation_id());
			ps.executeUpdate();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* 根据任务单号修改任务单 */
	@Override
	public void updateTaskFormByTask_Type_Id(TaskForm taskForm) {

		try {
			String sql = "update taskForm set task_date = ? , task_state_id = ? , task_type_id = ? , substation_id = ? , deliver_id = ? , order_id = ? where task_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, taskForm.getTask_date());
			ps.setString(2, taskForm.getTask_state_id());
			ps.setString(3, taskForm.getTask_type_id());
			ps.setString(4, taskForm.getSubstation_id());
			ps.setString(5, taskForm.getDeliver_id());
			ps.setString(6, taskForm.getOrder_id());
			ps.setString(7, taskForm.getTask_id());
			ps.executeUpdate();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* 根据任务号删除任务单 */
	@Override
	public void deleteTaskFormByTask_Type_Id(String task_id) {
		try {
			String sql = "delete from taskForm where task_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_id);
			ps.execute();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* 查询任务单列表 */
	@Override
	public List<TaskForm> getTaskFormList() {
		try {

			String sql = "select * from taskForm";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	/* 根据任务要求完成日期和任务类型来查询任务单列表 */
	@Override
	public List<TaskForm> getTaskFormListByTask_Date_Type(String task_date,
			String task_type_id) {
		try {

			String sql = "select * from taskForm where task_date = ? and task_type_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ps.setString(2, task_type_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	/* 根据任务要求完成日期和任务状态来查询任务单列表 */
	@Override
	public List<TaskForm> getTaskFormListByTask_Date_State(String task_date,
			String task_state_id) {
		try {

			String sql = "select * from taskForm where task_date = ? and task_state_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ps.setString(2, task_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	/* 根据任务类型和任务状态来查询任务单列表 */
	@Override
	public List<TaskForm> getTaskFormListByTask_Type_State(String task_type_id,
			String task_state_id) {
		try {

			String sql = "select * from taskForm where task_type_id = ? and task_state_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_type_id);
			ps.setString(2, task_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	/* 根据任务任务要求完成日期和任务类型、任务状态来查询任务单列表 */
	@Override
	public List<TaskForm> getTaskFormListByTask_Date_Type_State(
			String task_date, String task_type_id, String task_state_id) {
		try {

			String sql = "select * from taskForm where task_date = ? and task_type_id = ? and task_state_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ps.setString(2, task_type_id);
			ps.setString(3, task_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	/* 查询一项未分配任务单 */
	@Override
	public TaskForm getTaskFormByTask_State_Id(String task_state_id) {
		try {
			String sql = "select * from taskForm where task_state_id = ?";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_state_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskForm;
	}

	/* 根据配送员查询任务单列表 */
	@Override
	public List<TaskForm> getTaskFormListByDeliver_Id(String deliver_id) {
		try {

			String sql = "select * from taskForm where deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, deliver_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	/* 根据任务要求完成日期和配送员来查询任务单列表 */
	@Override
	public List<TaskForm> getTaskFormListByTask_Date_Deliver(String task_date,
			String deliver_id) {
		try {

			String sql = "select * from taskForm where task_date = ? and deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ps.setString(2, deliver_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	@Override
	public List<TaskForm> getTaskFormListByTask_Type_Deliver(
			String task_type_id, String deliver_id) {
		try {

			String sql = "select * from taskForm where task_type_id = ? and deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_type_id);
			ps.setString(2, deliver_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	@Override
	public List<TaskForm> getTaskFormListByTask_State_Deliver(
			String task_state_id, String deliver_id) {
		try {

			String sql = "select * from taskForm where task_state_id = ? and deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_state_id);
			ps.setString(2, deliver_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	@Override
	public List<TaskForm> getTaskFormListByTask_Date_Type_Deliver(
			String task_date, String task_type_id, String deliver_id) {
		try {

			String sql = "select * from taskForm where task_date = ? and task_type_id = ? and deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ps.setString(2, task_type_id);
			ps.setString(3, deliver_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	@Override
	public List<TaskForm> getTaskFormListByTask_Type_State_Deliver(
			String task_type_id, String task_state_id, String deliver_id) {
		try {

			String sql = "select * from taskForm where task_type_id = ? and task_state_id = ? and deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_type_id);
			ps.setString(2, task_state_id);
			ps.setString(3, deliver_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	@Override
	public List<TaskForm> getTaskFormListByTask_Date_State_Deliver(
			String task_date, String task_state_id, String deliver_id) {
		try {

			String sql = "select * from taskForm where task_date = ? and task_state_id = ? and deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ps.setString(2, task_state_id);
			ps.setString(3, deliver_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

	@Override
	public List<TaskForm> getTaskFormListByTask_Date_Type_State_Deliver(
			String task_date, String task_type_id, String task_state_id,
			String deliver_id) {
		try {

			String sql = "select * from taskForm where task_date = ? and task_type_id = ? and task_state_id = ? and deliver_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_date);
			ps.setString(2, task_type_id);
			ps.setString(3, task_state_id);
			ps.setString(4, deliver_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				taskForm = new TaskForm();
				taskForm.setTask_id(rs.getString("task_id"));
				taskForm.setOrder_id(rs.getString("order_id"));
				taskForm.setTask_date(rs.getString("task_date"));
				taskForm.setTask_state_id(rs.getString("task_state_id"));
				taskForm.setTask_type_id(rs.getString("task_type_id"));
				taskForm.setSubstation_id(rs.getString("substation_id"));
				taskForm.setDeliver_id(rs.getString("deliver_id"));
				taskFormList.add(taskForm);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskFormList;
	}

}
