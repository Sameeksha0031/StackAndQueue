package com.Stack;

public class Stack<T> {

	private T data;
	Stack<T> next;
	
	public Stack(T data) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Stack<T> getNext() {
		return next;
	}

	public void setNext(Stack<T> next) {
		this.next = next;
	}
	
}
