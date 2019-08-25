package com.sky.pattern.iterator;

public class IntegerRepository implements Container {
	private Integer[] numbers;

	public IntegerRepository(Integer[] numbers) {
		this.numbers = numbers;
	}

	@Override
	public Iterator getIterator() {
		return new IntegerIterator(numbers);
	}

}
