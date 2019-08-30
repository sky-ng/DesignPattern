package com.sky.pattern.interceptingfilter;

/**
 * 过滤器管理员
 * @author SKY
 *
 */
public class FilterManager {
	private FilterChain filterChain;

	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}
	
	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}
	
	public void filterRequest() {
		filterChain.execute();
	}
}
