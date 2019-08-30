package com.sky.pattern.interceptingfilter;

/**
 * 客户端
 * @author SKY
 *
 */
public class Client {
	FilterManager filterManager;
	
	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}
	
	public void sendRequest() {
		filterManager.filterRequest();
	}
}
