package com.hackerrank.linkedlist;
class Node{
	int data;
	Node next;
	public Node(int x) {
		this.data = x;
	}
}
public class LinkedList {
	Node root;

	public void insert(int x){
		Node node = new Node(x);
		if(root ==null)
			root=node;
		else{
			Node next =root;
			Node prev = null;
			while(next!=null){
				prev= next;
				next=next.next;
			}
			prev.next = node;
		}
	}
	public void insertAtNumber(int x, int position){
		Node node = new Node(x);
		if(root ==null)
			root=node;
		else{
			Node next =root;
			Node prev = null;
			while(next!=null && position>0){
				prev= next;
				next=next.next;
				position--;
			}
			prev.next = node;
			node.next=next;
		}
	}
	public void insertAtHead(int x){
		Node node = new Node(x);
		if(root ==null)
			root=node;
		else{
			node.next = root;
			root = node;
		}
	}
	
	public void print(){
		Node next = root;
		//System.out.println("printing list elements");
		while(next!=null){
			System.out.println(next.data);
			next = next.next;
		}
		//System.out.print("Null");
	}
	
	public static void main(String[] args) {
	LinkedList linkedList;
	linkedList=insertDumyElements();
	linkedList.print();
	}

	private static LinkedList insertDumyElements() {
		LinkedList linkedList = new LinkedList();
//		linkedList.insert(2);
//		linkedList.insert(3);
//		linkedList.insert(4);
//		linkedList.insert(5);
//		linkedList.insertAtHead(1);
		linkedList.insertAtNumber(3, 0);
		linkedList.insertAtNumber(5, 1);
		linkedList.insertAtNumber(4, 2);
		linkedList.insertAtNumber(2, 4);
		linkedList.insertAtNumber(10, 1);
		
		return linkedList;
	}
}
