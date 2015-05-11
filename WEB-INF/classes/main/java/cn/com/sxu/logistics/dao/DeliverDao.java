/*
配送员数据实现接口
 */
package main.java.cn.com.sxu.logistics.dao;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.Deliver;

public interface DeliverDao {
	/* 根据配送员编号来获取配送员信息 */
	public Deliver getDeliverByDeliver_Id(String deliver_id);

	/* 根据配送员姓名来获取配送员信息 */
	public Deliver getDeliverByDeliver_Name(String deliver_name);

	/* 根据配送员状态来获取配送员列表信息 */
	public List<Deliver> getDeliverListByDeliver_State(String deliver_state);

	/* 查询配送员列表信息 */
	public List<Deliver> getDeliverList();

	/* 添加配送员 */
	public void addDeliver(Deliver deliver);

	/* 修改配送员 */
	public void updateDeliverByDeliver_Id(Deliver deliver);

	/* 删除配送员 */
	public void deleteDeliverByDeliver_Id(String deliver_id);
}
