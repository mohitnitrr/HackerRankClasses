package com.datastructure;

import java.util.HashMap;
import java.util.Map;


class Node{
	private char value;
	private Map<Character, Node> children;
	private int count ;
	
	public Node(char c){
		this.value=c;
		children=new HashMap<Character, Node>();
		count=1;
	}
	
	public Map<Character, Node> getchildrens() {
		return this.children;
	}
	
	public char getvalue(){
		return this.value;
	}
	
	public void incrementCount(){
		count++;
	}
	public int getCount(){
		return this.getCount();
	}
}


class TriesOperation {
	
	private Node root;
	
	public TriesOperation(){
		root=new Node('s');
	}
	
	public void insert(String str){
		int length= str.length();
		Node node=root;
		
		for(int i=0;i<length;i++){
			char c=str.charAt(i);
			Map<Character, Node>childs=node.getchildrens();
			
			if(childs.containsKey(c)){
			Node childNode=childs.get(c);
			childNode.incrementCount();
			node=childNode;
			}
			else{
			Node temp=new Node(c);
			childs.put(c, temp);
			node=temp;
			}
			
		}
	}
	public void printStrings(Node node,String str){
		if(node==null)
		node =root;
		
		if(node.getchildrens().isEmpty())
			System.out.println(str);
		
				for(Map.Entry<Character, Node>nextnode:node.getchildrens().entrySet()){
					//str+=nextnode.getValue().getvalue();
					printStrings(nextnode.getValue(), str+nextnode.getValue().getvalue());
				}
			}
	
	public void withPrefixString(String str){
		
		Node node=root;
		int i;
		for(i=0;i<str.length();i++){
			
			if(node.getchildrens().containsKey(str.charAt(i)))
				node=node.getchildrens().get(str.charAt(i));
			else
				break;
			
		}
		if(i==str.length())
			printStrings(node, str);
			
		else
			System.out.println("NO string available with prefix this string");
	}
		
	
}

public class Tries{
	
	public static void main(String[] args) {
		TriesOperation tree=new TriesOperation();
		tree.insert("Informatica");
		tree.insert("Oracle");
		tree.insert("Junipher");
		tree.insert("Infogain");
		tree.withPrefixString("Info");
		tree.withPrefixString("IJ");
		//tree.printStrings(null, "");
	}
}
