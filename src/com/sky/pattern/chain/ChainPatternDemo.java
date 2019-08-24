package com.sky.pattern.chain;

/**
 * 责任链模式测试类
 * @author 12874
 *
 */
public class ChainPatternDemo {
	static String content = "Dirty Word, Privacy Word, Sensitive Word";
	
	public static void main(String[] args) {
		AbstractFilter filterChain = getFilterChain();
		System.out.println(filterChain.filter(content));
	}
	
	private static AbstractFilter getFilterChain() {
		DirtyFilter dirtyFilter = new DirtyFilter();
		PrivacyFilter privacyFilter = new PrivacyFilter();
		SensitiveFilter sensitiveFilter = new SensitiveFilter();
		dirtyFilter.setNextFilter(privacyFilter);
		privacyFilter.setNextFilter(sensitiveFilter);
		sensitiveFilter.setNextFilter(null);
		return dirtyFilter;
	}
}
