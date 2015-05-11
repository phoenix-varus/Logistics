package main.java.cn.com.sxu.logistics.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import main.java.cn.com.sxu.logistics.dao.ProductFormDao;
import main.java.cn.com.sxu.logistics.dao.ReactionDao;
import main.java.cn.com.sxu.logistics.dao.UserManagerDao;
import main.java.cn.com.sxu.logistics.dao.impl.ProductFormDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.ReactionDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.TaskFormDaoImpl;
import main.java.cn.com.sxu.logistics.dao.impl.UserManagerDaoImpl;
import main.java.cn.com.sxu.logistics.model.ProductForm;
import main.java.cn.com.sxu.logistics.model.Reaction;
import main.java.cn.com.sxu.logistics.model.TaskForm;
import main.java.cn.com.sxu.logistics.model.User;
import main.java.cn.com.sxu.logistics.dao.TaskFormDao;

import org.apache.struts2.interceptor.SessionAware;
//import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

//@Component("managerAction")
public class ManagerAction extends ActionSupport implements SessionAware {
	/**
	 * struts的action处理
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private User user = new User();
	private UserManagerDao userManagerDao = new UserManagerDaoImpl();
	private TaskFormDao taskFormDao = new TaskFormDaoImpl();
	private ReactionDao reactionDao = new ReactionDaoImpl();
	private ProductFormDao productFormDao = new ProductFormDaoImpl();
	private TaskForm taskForm = new TaskForm();
	private List<TaskForm> taskFormList = new ArrayList<TaskForm>();
	private List<Reaction> reactionList = new ArrayList<Reaction>();
	private Reaction reaction = new Reaction();
	private List<ProductForm> productFormList = new ArrayList<ProductForm>();
	private ProductForm productForm = new ProductForm();
	private String task_id;

	/*
	 * getter--setter
	 */
	public User getUser() {
		return user;
	}

	@Resource(name = "user")
	public void setUser(User user) {
		this.user = user;
	}

	public UserManagerDao getUserManagerDao() {
		return userManagerDao;
	}

	@Resource(name = "userManagerDaoImpl")
	public void setUserManagerDao(UserManagerDao userManagerDao) {
		this.userManagerDao = userManagerDao;
	}

	public TaskFormDao getTaskFormDao() {
		return taskFormDao;
	}

	@Resource(name = "taskFormDaoImpl")
	public void setTaskFormDao(TaskFormDao taskFormDao) {
		this.taskFormDao = taskFormDao;
	}

	public TaskForm getTaskForm() {
		return taskForm;
	}

	@Resource(name = "taskForm")
	public void setTaskForm(TaskForm taskForm) {
		this.taskForm = taskForm;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public ReactionDao getReactionDao() {
		return reactionDao;
	}

	@Resource(name = "reactionDaoImpl")
	public void setReactionDao(ReactionDao reactionDao) {
		this.reactionDao = reactionDao;
	}

	public Reaction getReaction() {
		return reaction;
	}

	@Resource(name = "reaction")
	public void setReaction(Reaction reaction) {
		this.reaction = reaction;
	}

	public ProductFormDao getProductFormDao() {
		return productFormDao;
	}

	@Resource(name = "productFormDaoImpl")
	public void setProductFormDao(ProductFormDao productFormDao) {
		this.productFormDao = productFormDao;
	}

	public ProductForm getProductForm() {
		return productForm;
	}

	@Resource(name = "productForm")
	public void setProductForm(ProductForm productForm) {
		this.productForm = productForm;
	}

	/*
	 * getter--setter
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public String index() {
		return SUCCESS;
	}

	/* 用户验证 */
	public String userCheck() {

		/*
		 * user.setUsername("yanjunfeng"); user.setPassword("123");
		 */
		user = userManagerDao.getUserByUserName("yanjunfeng");
		System.out.println("haha" + user);
		session.put("user", user);
		return SUCCESS;
	}

	/* 任务单查询列表 */
	public String showTaskFormList() {
		taskFormList = taskFormDao.getTaskFormList();
		session.put("taskFormList", taskFormList);
		return SUCCESS;
	}

	/* 任务单详情 */
	public String showTaskForm() {
		taskForm = taskFormDao.getTaskFormByTask_Id(task_id);
		session.put("taskForm", taskForm);
		return SUCCESS;
	}

	/* 任务分配 */
	public String distributeTask() {
		taskForm = taskFormDao.getTaskFormByTask_Id(task_id);
		session.put("taskForm", taskForm);
		return SUCCESS;
	}

	/* 回执清单列表 */
	public String showReactionList() {
		reactionList = reactionDao.getReactionList();
		session.put("reactionList", reactionList);
		return SUCCESS;
	}

	/* 回执清单详情 */
	public String showReaction() {
		reaction = reactionDao.getReactionByTask_Id(task_id);
		session.put("reaction", reaction);
		return SUCCESS;
	}

	/* 回执清单添加 */
	public String modifyReaction() {
		reaction = reactionDao.getReactionByTask_Id(task_id);
		session.put("reaction", reaction);
		return SUCCESS;
	}

	public String complete_modifyReaction() {
		reactionDao.addReaction(reaction);
		return SUCCESS;
	}

	/* 商品收款单列表 */
	public String showPaymentList() {
		productFormList = productFormDao.getProductFormList();
		session.put("productFormList", productFormList);
		return SUCCESS;
	}
}
