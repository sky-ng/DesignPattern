package com.sky.pattern.interceptingfilter;

/**
 * 拦截过滤器模式测试类
 * @author SKY
 *
 */
public class InterceptingFilterDemo {
	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		//装配各种过滤器
		filterManager.setFilter(new DirtyFilter());
		filterManager.setFilter(new PrivateFilter());
		filterManager.setFilter(new SensitiveFilter());
		
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest();
	}
}
