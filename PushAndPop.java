package com.Stack;

import com.javashowcase.MyNode;

public class PushAndPop<T> {
	
	private Stack top  = null;
	private Stack tail = null;
	private Stack temp = null;
	
	public void push(Stack<T> newnode) {
	  if(top == null && tail == null) {
		  top = newnode;
		  tail = newnode;
		  temp = newnode;
	  }	else {
			temp = newnode;
			temp.setNext(top);
			top = newnode;
		}
	}
	
	public void show() {
		temp = top;
		while(temp != null) {
			if(temp.getNext() != null) {
				System.out.print(temp.getData() + "-->");
			}else {
				System.out.print(temp.getData());
			}
			temp = temp.getNext();
		}
	}
     }
