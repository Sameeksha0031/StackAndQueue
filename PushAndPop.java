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
	
	 /*public boolean isEmpty()
	    {
	        return top == null;
	    }
	  
	    public void peek()
	    {

	        if (!isEmpty()) {
	         System.out.println("\nTop element is "+top.getData());
	        }
	        else {
	            System.out.println("Stack is empty");
	        }
	    }
	  
	
	public void pop(){
		if(top == null) {
			System.out.println("Nothing to pop");
		}
		while(top != null) {
			System.out.println("Popped elements is "+top.getData());
			top=top.getNext();
		}*/
	}
	//}
