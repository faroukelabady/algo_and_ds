package com.farouk.ds;

public interface IList {

	int size();

	boolean isEmpty();

	boolean contains(int element);

	boolean add(int element);

	boolean remove(int element);

	void clear();

	void add(int index, int element);

	int removeFromIndex(int index);

	int indexOf(Object o);

}
