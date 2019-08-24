package com.sky.pattern.chain;

public class SensitiveFilter extends AbstractFilter {

	@Override
	protected String doFilter(String content) {
		return content.replace("Sensitive Word", "sw");
	}

}
