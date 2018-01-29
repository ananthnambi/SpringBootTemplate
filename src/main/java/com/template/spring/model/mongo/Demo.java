package com.template.spring.model.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Demo")
public class Demo {

	private int appNo;

	private String appName;

	private int updates;

	public int getAppNo() {
		return appNo;
	}

	public void setAppNo(int appNo) {
		this.appNo = appNo;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public int getUpdates() {
		return updates;
	}

	public void setUpdates(int updates) {
		this.updates = updates;
	}

}