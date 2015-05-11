/*
回执录入业务逻辑处理接口
 */
package main.java.cn.com.sxu.logistics.service;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.Reaction;

public interface ReactionService {

	/* 回执录入信息列表查询 */
	public List<Reaction> getReactionList(String task_date,
			String task_type_id, String task_state_id, String deliver_id);

	/* 根据任务单号查询回执录入信息 */
	public Reaction getReaction(String task_id);

	/* 根据客户满意度查询回执录入信息 */
	public Reaction getReactionBySatisfaction(String satisfaction);

	/* 根据任务单号添加回执信息 */
	public Reaction addReaction(Reaction reaction);

	/* 根据任务单号修改回执信息 */
	public Reaction updateReaction(Reaction reaction);

	/* 根据任务单号修改回执信息 */
	public Reaction deleteReaction(String task_id);
}
