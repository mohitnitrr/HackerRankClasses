package com.zenify;

import java.util.Scanner;


class LinkedNode{
	private long value;
	private LinkedNode next;
	private LinkedNode prev;
	
	public void setValue(long value) {
		this.value=value;	
	}

	public void nextNode(LinkedNode next) {
		this.next=next;	
	}

	public void setPrev(LinkedNode prev) {
		this.prev=prev;
	}

	public long getValue() {
		return this.value;
	}

	public LinkedNode getNext() {
		return this.next;
	}

	public void incrementValue(long d) {
		this.value =value+d;
		
	}

	public LinkedNode getPrev() {
		return this.prev;
	}
		
}

class Stack{
	private LinkedNode top;
	private LinkedNode bottom;
	
	void push(long value){
		LinkedNode temp = new LinkedNode();
		temp.setValue(value);
		temp.nextNode(top);
		
		if(top==null){
			top=temp;
			bottom=temp;
		}
		else{
			top.setPrev(temp);
			top=temp;
		}
		
		System.out.println(top.getValue());
		
	}
	
	void pop(){
		top=top.getNext();
		
		if(null==top){
			bottom=null;
			System.out.println("EMPTY");		
		}
		else
			System.out.println(top.getValue());
	}
	
	void inc(int x , long d){
		int count=0;
		LinkedNode tempBottom=bottom;
		while(null!=tempBottom && count++<x){
			tempBottom.incrementValue(d);
			tempBottom=tempBottom.getPrev();
		}
		if(null==top){
			System.out.println("EMPTY");		
		}
		else
			System.out.println(top.getValue());
	}
}
public class SuperStack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack stack= new Stack();
		
		int operationCount= in.nextInt();
		for(int i=0;i<operationCount;i++){
			String operation =in.next();
			switch (operation) {
			case "push":
				long value = in.nextLong();
				stack.push(value);
				break;
			case "pop":
				stack.pop();
				break;
			case "inc":
				int x=in.nextInt();
				long d =in.nextLong();
				stack.inc(x, d);
				break;
			}
			
		}
	}
}
