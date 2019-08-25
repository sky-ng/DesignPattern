package com.sky.pattern.iterator;

/**
 * 迭代器接口
 * @author 12874
 *
 * @param <T>
 */
public interface Iterator<T> {
	boolean hasNext();
	T next();
}
