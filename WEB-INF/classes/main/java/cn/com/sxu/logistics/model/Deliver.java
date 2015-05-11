/*
配送员信息
 */
package main.java.cn.com.sxu.logistics.model;

import org.springframework.stereotype.Component;

@Component("deliver")
public class Deliver {
	/* 配送员编号 */
	private String deliver_id;
	/* 配送员姓名 */
	private String deliver_name;
	/* 配送员状态 */
	private String deliver_state;

	public String getDeliver_id() {
		return deliver_id;
	}

	public void setDeliver_id(String deliver_id) {
		this.deliver_id = deliver_id;
	}

	public String getDeliver_name() {
		return deliver_name;
	}

	public void setDeliver_name(String deliver_name) {
		this.deliver_name = deliver_name;
	}

	public String getDeliver_state() {
		return deliver_state;
	}

	public void setDeliver_state(String deliver_state) {
		this.deliver_state = deliver_state;
	}
}
