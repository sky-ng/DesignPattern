package com.sky.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤男性
 * @author 12874
 *
 */
public class MaleCriteria implements Criteria {

	@Override
	public List<Person> filter(List<Person> personList) {
		List<Person> filtered = new ArrayList<>();
		for (Person person : personList) {
			if ("Male".equals(person.getGender())) {
				filtered.add(person);
			}
		}
		return filtered;
	}

}
