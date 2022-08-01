package com.Stack;

public class StackMain {

	public static void main(String[] args) {
		
		Stack<Integer> numberOne = new Stack<>(70);
		Stack<Integer> numberTwo = new Stack<>(30);
		Stack<Integer> numberThree = new Stack<>(56);
		
		PushAndPop<Integer> add = new  PushAndPop();
		add.push(numberOne);
		add.push(numberTwo);
		add.push(numberThree);
		add.peek();
		
		add.show();
		System.out.println();
		add.pop();
		add.peek();

	}

}
