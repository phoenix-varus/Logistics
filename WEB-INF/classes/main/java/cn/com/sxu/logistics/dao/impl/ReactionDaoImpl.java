/*
回执录入数据实现层
 */
package main.java.cn.com.sxu.logistics.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.cn.com.sxu.logistics.dao.ReactionDao;
import main.java.cn.com.sxu.logistics.dbutils.DBConnection;
import main.java.cn.com.sxu.logistics.model.Reaction;

@Component("reactionDaoImpl")
public class ReactionDaoImpl implements ReactionDao {
	Reaction reaction;
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;
	List<Reaction> reactionList = new ArrayList<Reaction>();

	/* 添加回执表信息 */
	@Override
	public void addReaction(Reaction reaction) {

		try {
			String sql = "insert into reaction (task_id,deliver_id,remark,satisfaction) values (?,?,?,?) ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, reaction.getTask_id());
			ps.setString(2, reaction.getDeliver_id());
			ps.setString(3, reaction.getRemark());
			ps.setString(4, reaction.getSatisfaction());
			ps.executeUpdate();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* 根据任务号查询回执表信息 */
	@Override
	public Reaction getReactionByTask_Id(String task_id) {
		try {
			String sql = "select * from reaction where task_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, task_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				reaction = new Reaction();
				reaction.setTask_id(rs.getString("task_id"));
				reaction.setDeliver_id(rs.getString("deliver_id"));
				reaction.setRemark(rs.getString("remark"));
				reaction.setSatisfaction(rs.getString("satisfaction"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return reaction;
	}

	/* 查询回执列表 */
	@Override
	public List<Reaction> getReactionList() {
		try {
			String sql = "select * from reaction";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				reaction = new Reaction();
				reaction.setTask_id(rs.getString("task_id"));
				reaction.setDeliver_id(rs.getString("deliver_id"));
				reaction.setRemark(rs.getString("remark"));
				reaction.setSatisfaction(rs.getString("satisfaction"));
				reactionList.add(reaction);
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return reactionList;
	}

	/* 查询一个用户回执 */
	@Override
	public Reaction getReaction() {
		try {
			String sql = "select * from reaction ";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				reaction = new Reaction();
				reaction.setTask_id(rs.getString("task_id"));
				reaction.setDeliver_id(rs.getString("deliver_id"));
				reaction.setRemark(rs.getString("remark"));
				reaction.setSatisfaction(rs.getString("satisfaction"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return reaction;
	}

	@Override
	public Reaction getReactionBySatisfaction(String satisfaction) {
		try {
			String sql = "select * from reaction where satisfaction is null ";
			ps = db.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				reaction = new Reaction();
				reaction.setTask_id(rs.getString("task_id"));
				reaction.setDeliver_id(rs.getString("deliver_id"));
				reaction.setRemark(rs.getString("remark"));
				reaction.setSatisfaction(rs.getString("satisfaction"));
			}
			db.closeRs();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return reaction;
	}

	@Override
	public void updateReaction(Reaction reaction) {
		try {
			String sql = "update reaction set deliver_id = ? , remark = ? , satisfaction = ? where task_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, reaction.getDeliver_id());
			ps.setString(2, reaction.getRemark());
			ps.setString(3, reaction.getSatisfaction());
			ps.setString(4, reaction.getTask_id());
			ps.executeUpdate();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteReaction(String task_id) {
		try {
			String sql = "delete from reaction where task_id = ? ";
			ps = db.getConnection().prepareStatement(sql);
			ps.setString(1, reaction.getTask_id());
			ps.execute();
			db.closePs();
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
