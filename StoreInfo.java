package com.JavaProject;

import java.io.Serializable;

public class StoreInfo implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String storename;
	private String storewhere;
	private String storeid;
		
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public String getStorewhere() {
		return storewhere;
	}
	public void setStorewhere(String storewhere) {
		this.storewhere = storewhere;
	}
	public String getStoreid() {
		return storeid;
	}
	public void setStoreid(String storeid) {
		this.storeid = storeid;
	}
	
}
