package com.sky.pattern.interceptingfilter;

/**
 * 隐私过滤器
 * @author SKY
 *
 */
public class PrivateFilter implements Filter {

	/**
	 * 过滤方法
	 */
	@Override
	public void doFilter() {
		System.out.println("Execute Private Words Filter");
	}

}
