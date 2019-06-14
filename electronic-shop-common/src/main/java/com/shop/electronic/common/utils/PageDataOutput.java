package com.shop.electronic.common.utils;

import java.util.Collections;
import java.util.List;

public class PageDataOutput<T> {

	private String code = "000000";
	
	private String message = "操作成功!";
	
	private String primaryKey;
	
	private long recordTotal = 0;
	
	private List<T> data = Collections.emptyList();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public long getRecordTotal() {
		return recordTotal;
	}

	public void setRecordTotal(long recordTotal) {
		this.recordTotal = recordTotal;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
	
	
	
}
