package com.sky.pattern.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 * @author SKY
 *
 */
public class FilterChain {
	//过滤器集合
	List<Filter> filterList = new ArrayList<>();
	private Target target;
	
	/**
	 * 添加过滤器
	 * @param filter
	 */
	public void addFilter(Filter filter) {
		filterList.add(filter);
	}
	
	/**
	 * 执行过滤器
	 */
	public void execute() {
		//前置拦截
		for (Filter filter : filterList) {
			filter.doFilter();
		}
		
		//执行目标对象
		target.execute();
	}
	
	/**
	 * 设置目标对象
	 * @param target
	 */
	public void setTarget(Target target) {
		this.target = target;
	}
}
