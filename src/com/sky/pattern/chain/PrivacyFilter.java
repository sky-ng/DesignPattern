package com.sky.pattern.chain;

public class PrivacyFilter extends AbstractFilter {

	@Override
	protected String doFilter(String content) {
		return content.replace("Privacy Word", "pw");
	}

}
