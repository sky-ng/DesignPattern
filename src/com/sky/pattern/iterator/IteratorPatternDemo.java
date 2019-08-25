package com.sky.pattern.iterator;

/**
 * 迭代器模式测试类
 * @author 12874
 *
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		Integer numbers[] = {1, 2, 3, 4, 5};
		IntegerRepository repository = new IntegerRepository(numbers);
		Iterator iterator = repository.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
