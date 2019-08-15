package com.sky.pattern.criteria;

import java.util.List;

/**
 * 标准接口
 * @author 12874
 *
 */
public interface Criteria {
	List<Person> filter(List<Person> personList);
}
