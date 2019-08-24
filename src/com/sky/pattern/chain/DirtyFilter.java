package com.sky.pattern.chain;

public class DirtyFilter extends AbstractFilter {

	@Override
	protected String doFilter(String content) {
		return content.replace("Dirty Word", "dw");
	}

}
