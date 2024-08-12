package com.farouk.ds;

public interface IQueue {
	
	void enqueue(int value);
	int dequeue();
	boolean isEmpty();
	int size();

}
