/*
分站信息
 */
package main.java.cn.com.sxu.logistics.model;

import org.springframework.stereotype.Component;

@Component("substation")
public class Substation {
	/* 分站编号 */
	private String substation_id;
	/* 分站名称 */
	private String substation_name;

	public String getSubstation_id() {
		return substation_id;
	}

	public void setSubstation_id(String substation_id) {
		this.substation_id = substation_id;
	}

	public String getSubstation_name() {
		return substation_name;
	}

	public void setSubstation_name(String substation_name) {
		this.substation_name = substation_name;
	}
}
