/*
回执录入信息数据接口层
 */
package main.java.cn.com.sxu.logistics.dao;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.Reaction;

public interface ReactionDao {
	/* 添加用户回执 */
	public void addReaction(Reaction reaction);

	/* 修改用户回执 */
	public void updateReaction(Reaction reaction);

	/* 根据任务单编号删除用户回执 */
	public void deleteReaction(String task_id);

	/* 根据任务单编号查询用户回执 */
	public Reaction getReactionByTask_Id(String task_id);

	/* 根据客户满意度查询回执单信息 */
	public Reaction getReactionBySatisfaction(String satisfaction);

	/* 查询一个用户回执 */
	public Reaction getReaction();

	/* 查询回执信息列表 */
	public List<Reaction> getReactionList();
}
