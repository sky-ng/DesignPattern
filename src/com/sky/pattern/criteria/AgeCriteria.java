package com.sky.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤年龄
 * @author 12874
 *
 */
public class AgeCriteria implements Criteria {

	@Override
	public List<Person> filter(List<Person> personList) {
		List<Person> filtered = new ArrayList<>();
		for (Person person : personList) {
			if (person.getAge() > 20) {
				filtered.add(person);
			}
		}
		return filtered;
	}

}
