/*
分站信息数据接口
 */
package main.java.cn.com.sxu.logistics.dao;

import java.util.List;

import main.java.cn.com.sxu.logistics.model.Substation;

public interface SubstationDao {
	/* 查询分站信息列表 */
	public List<Substation> getSubstationList();

	/* 根据分站编号查询分站信息 */
	public Substation getSubstationBySubstation_Id(String substation_id);

	/* 根据分站编号查询分站信息 */
	public Substation getSubstationBySubstation_Name(String substation_name);
}
