package main.java.cn.com.sxu.logistics.dao.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.cn.com.sxu.logistics.dao.ReactionDao;
import main.java.cn.com.sxu.logistics.model.Reaction;

import org.junit.Test;

public class ReactionDaoTest {
	private ReactionDao reactionDao = new ReactionDaoImpl();
	private List<Reaction> reactionList = new ArrayList<Reaction>();
	private Reaction reaction = new Reaction();

	@Test
	public void testGetReactionList() {
		setReactionList(reactionDao.getReactionList());
	}

	public Reaction getReaction() {
		return reaction;
	}

	public void setReaction(Reaction reaction) {
		this.reaction = reaction;
	}

	public List<Reaction> getReactionList() {
		return reactionList;
	}

	public void setReactionList(List<Reaction> reactionList) {
		this.reactionList = reactionList;
	}

}
