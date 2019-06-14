package com.shop.electronic.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PageDataInput {

	private int currentPageNum = 0;
	
	private int pageSize = 0;
	
	private String operUserId;
	
	private Map<String,Object> serach = new HashMap<String,Object>();
	
	private List<String> sort = new ArrayList<>();

	public int getCurrentPageNum() {
		return currentPageNum;
	}

	public void setCurrentPageNum(int currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOperUserId() {
		return operUserId;
	}

	public void setOperUserId(String operUserId) {
		this.operUserId = operUserId;
	}

	public Map<String, Object> getSerach() {
		return serach;
	}

	public void setSerach(Map<String, Object> serach) {
		this.serach = serach;
	}

	public List<String> getSort() {
		return sort;
	}

	public void setSort(List<String> sort) {
		this.sort = sort;
	}
	
	
}
