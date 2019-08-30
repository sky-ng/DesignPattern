package com.sky.pattern.interceptingfilter;

/**
 * 脏话过滤器
 * @author SKY
 *
 */
public class DirtyFilter implements Filter {

	@Override
	public void doFilter() {
		System.out.println("Execute Dirty Words Filter");
	}

}
