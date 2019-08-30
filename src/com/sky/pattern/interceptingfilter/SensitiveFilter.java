package com.sky.pattern.interceptingfilter;

/**
 * 敏感词过滤器
 * @author SKY
 *
 */
public class SensitiveFilter implements Filter {

	@Override
	public void doFilter() {
		System.out.println("Execute Sensitive Words Filter");
	}

}
