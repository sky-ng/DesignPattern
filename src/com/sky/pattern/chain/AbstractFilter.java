package com.sky.pattern.chain;

public abstract class AbstractFilter {
	
	AbstractFilter nextFilter;
	
	//责任链中的下一个元素
	public void setNextFilter(AbstractFilter nextFilter) {
		this.nextFilter = nextFilter;
	}
	
	public String filter(String content) {
		String filtered = doFilter(content);
		if (nextFilter != null) {
			return nextFilter.filter(filtered);
		}
		return filtered;
	}
	
	protected abstract String doFilter(String content);
}
