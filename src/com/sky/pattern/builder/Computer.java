package com.sky.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 电脑类
 * @author 12874
 *
 */
public class Computer {
	private List<Item> itemList = new ArrayList<>();
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public void showItems() {
		int total = 0;
		for (Item item : itemList) {
			System.out.print(item.packing().pack() + item.name() + 
					"，价格=" + item.price() + "\t");
			total += item.price();
		}
		System.out.println("电脑总价=" + total);
	}
}
