package com.sky.pattern.mediator;

import java.util.Date;

/**
 * 论坛
 * @author 12874
 *
 */
public class BBS {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : "
	+ message);
		
	}
}
