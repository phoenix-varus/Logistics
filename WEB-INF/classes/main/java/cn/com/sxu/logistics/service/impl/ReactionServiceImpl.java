/*
回执录入业务逻辑实现层
 */
package main.java.cn.com.sxu.logistics.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import main.java.cn.com.sxu.logistics.dao.ReactionDao;
import main.java.cn.com.sxu.logistics.dao.TaskFormDao;
import main.java.cn.com.sxu.logistics.dao.TaskStateDao;
import main.java.cn.com.sxu.logistics.dao.TaskTypeDao;
import main.java.cn.com.sxu.logistics.dao.impl.ReactionDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskFormDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskStateDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskTypeDaoImpl;
import main.java.cn.com.sxu.logistics.model.Reaction;
import main.java.cn.com.sxu.logistics.model.TaskForm;
import main.java.cn.com.sxu.logistics.model.TaskState;
import main.java.cn.com.sxu.logistics.model.TaskType;
import main.java.cn.com.sxu.logistics.service.ReactionService;

public class ReactionServiceImpl implements ReactionService {
	private Reaction reaction = new Reaction();
	private List<Reaction> reactionList = new ArrayList<Reaction>();
	private ReactionDao reactionDao = new ReactionDaoImpl();
	private TaskStateDao taskStateDao = new TaskStateDaoImpl();
	private TaskTypeDao taskTypeDao = new TaskTypeDaoImpl();
	private TaskType taskType = new TaskType();
	private TaskState taskState = new TaskState();
	private List<TaskForm> taskFormList = new ArrayList<TaskForm>();
	private TaskFormDao taskFormDao = new TaskFormDaoImpl();

	/* 查询回执列表 */
	@Override
	public List<Reaction> getReactionList(String task_date,
			String task_type_id, String task_state_id, String deliver_id) {
		if ((task_date != null && !task_date.equals(""))
				&& (task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals("") && (deliver_id != null && !deliver_id
						.equals("")))) {
			taskFormList = taskFormDao
					.getTaskFormListByTask_Date_Type_State_Deliver(task_date,
							task_type_id, task_state_id, deliver_id);
		} else if ((task_date != null && !task_date.equals(""))
				&& (task_type_id == null || task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals("")
						&& (deliver_id == null || deliver_id.equals("")))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date(task_date);
		} else if ((task_date == null || task_date.equals(""))
				&& (task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals("")
						&& (deliver_id == null || deliver_id.equals("")))) {
			taskFormList = taskFormDao
					.getTaskFormListByTask_Type_Id(task_type_id);
		} else if ((task_date == null || task_date.equals(""))
				&& (task_type_id == null || task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals("") && (deliver_id == null || deliver_id
						.equals("")))) {
			taskFormList = taskFormDao
					.getTaskFormListByTask_State_Id(task_state_id);
		} else if ((task_date == null || task_date.equals(""))
				&& (task_type_id == null || task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals(""))
				&& (deliver_id != null && !deliver_id.equals(""))) {
			taskFormList = taskFormDao.getTaskFormListByDeliver_Id(deliver_id);
		} else if ((task_date != null && !task_date.equals(""))
				&& (task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals("")
						&& (deliver_id == null || deliver_id.equals("")))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date_Type(
					task_date, task_type_id);
		} else if ((task_date != null && !task_date.equals(""))
				&& (task_type_id == null || task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals("") && (deliver_id == null || deliver_id
						.equals("")))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date_State(
					task_date, task_state_id);
		} else if ((task_date != null && !task_date.equals(""))
				&& (task_type_id == null || task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals("")
						&& (deliver_id != null && !deliver_id.equals("")))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date_Deliver(
					task_date, deliver_id);
		} else if ((task_date == null || task_date.equals(""))
				&& (task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals("") && (deliver_id == null || deliver_id
						.equals("")))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Type_State(
					task_type_id, task_state_id);
		} else if ((task_date == null || task_date.equals(""))
				&& (task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals("")
						&& (deliver_id != null && !deliver_id.equals("")))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Type_Deliver(
					task_type_id, deliver_id);
		} else if ((task_date == null || task_date.equals(""))
				&& (task_type_id == null || task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals("") && (deliver_id != null && !deliver_id
						.equals("")))) {
			taskFormList = taskFormDao.getTaskFormListByTask_State_Deliver(
					task_state_id, deliver_id);
		} else if ((task_date != null && !task_date.equals(""))
				&& (task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals("") && (deliver_id == null || deliver_id
						.equals("")))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date_Type_State(
					task_date, task_type_id, task_state_id);
		} else if ((task_date != null && !task_date.equals(""))
				&& (task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id == null || task_state_id.equals("")
						&& (deliver_id != null && !deliver_id.equals("")))) {
			taskFormList = taskFormDao.getTaskFormListByTask_Date_Type_Deliver(
					task_date, task_type_id, deliver_id);
		} else if ((task_date != null && !task_date.equals(""))
				&& (task_type_id == null || task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals("") && (deliver_id != null && !deliver_id
						.equals("")))) {
			taskFormList = taskFormDao
					.getTaskFormListByTask_Date_State_Deliver(task_date,
							task_state_id, deliver_id);
		} else if ((task_date == null || task_date.equals(""))
				&& (task_type_id != null && !task_type_id.equals(""))
				&& (task_state_id != null && !task_state_id.equals("") && (deliver_id != null && !deliver_id
						.equals("")))) {
			taskFormList = taskFormDao
					.getTaskFormListByTask_Type_State_Deliver(task_type_id,
							task_state_id, deliver_id);
		} else {
			taskFormList = taskFormDao.getTaskFormList();
		}
		for (int i = 0; i < taskFormList.size(); i++) {
			reactionDao = new ReactionDaoImpl();
			reaction = reactionDao.getReactionByTask_Id(taskFormList.get(i)
					.getTask_id());
			if (reaction != null) {
				reactionList.add(reaction);
			}
			reaction = null;
		}
		return reactionList;
	}

	/* 根据任务编号查询回执表 */
	@Override
	public Reaction getReaction(String task_id) {
		if (task_id != null) {
			reaction = reactionDao.getReactionByTask_Id(task_id);
		} else {
			reactionList = reactionDao.getReactionList();
			if (reactionList.size() > 0) {
				reaction = reactionList.get(0);
			} else
				reaction = null;
		}
		return reaction;
	}

	/* 根据客户满意度查询回执表 */
	@Override
	public Reaction getReactionBySatisfaction(String satisfaction) {
		reaction = reactionDao.getReactionBySatisfaction(satisfaction);
		return reaction;
	}

	/* 添加回执 */
	@Override
	public Reaction addReaction(Reaction reaction) {
		reactionDao.addReaction(reaction);
		return reaction;
	}

	/* 修改回执 */
	@Override
	public Reaction updateReaction(Reaction reaction) {
		reactionDao.updateReaction(reaction);
		return reaction;
	}

	/* 删除回执 */
	@Override
	public Reaction deleteReaction(String task_id) {
		reactionDao.deleteReaction(task_id);
		return reaction;
	}

	/*
	 * getter--setter
	 */
	public Reaction getReaction() {
		return reaction;
	}

	@Resource(name = "reaction")
	public void setReaction(Reaction reaction) {
		this.reaction = reaction;
	}

	public ReactionDao getReactionDao() {
		return reactionDao;
	}

	@Resource(name = "reactionDao")
	public void setReactionDao(ReactionDao reactionDao) {
		this.reactionDao = reactionDao;
	}

	public List<Reaction> getReactionList() {
		return reactionList;
	}

	public void setReactionList(List<Reaction> reactionList) {
		this.reactionList = reactionList;
	}

	public TaskStateDao getTaskStateDao() {
		return taskStateDao;
	}

	public void setTaskStateDao(TaskStateDao taskStateDao) {
		this.taskStateDao = taskStateDao;
	}

	public TaskTypeDao getTaskTypeDao() {
		return taskTypeDao;
	}

	public void setTaskTypeDao(TaskTypeDao taskTypeDao) {
		this.taskTypeDao = taskTypeDao;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public TaskState getTaskState() {
		return taskState;
	}

	public void setTaskState(TaskState taskState) {
		this.taskState = taskState;
	}

	public TaskFormDao getTaskFormDao() {
		return taskFormDao;
	}

	public void setTaskFormDao(TaskFormDao taskFormDao) {
		this.taskFormDao = taskFormDao;
	}

	/*
	 * getter--setter
	 */
}
