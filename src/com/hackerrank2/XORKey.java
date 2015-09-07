package com.hackerrank2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Node{
	private char value;
	private Map<Character, Node> children;
	private int minIndex ;
	private int maxIndex;
	
	public Node(char c){
		this.value=c;
		children=new HashMap<Character, Node>();
	}
	
	public Map<Character, Node> getchildrens() {
		return this.children;
	}
	
	public char getvalue(){
		return this.value;
	}
	public int getMinIndex(){
		return this.minIndex;
	}
	public int getMaxIndex(){
		return this.maxIndex;
	}
	public void setMinIndex(int min) {
		
		this.minIndex=min;
	}
	public void setMaxIndex(int max) {
		
		this.maxIndex=max;
	}
	
	public int getCount(){
		return this.getCount();
	}
}


class TriesOperation {
	private static final String zeros ="0000000000000000000000000000000000000000000000000000000000000000";
	
	private Node root;
	
	public TriesOperation(){
		root=new Node('s');
	}
	
	public void insert(String str,int index){
		int length= str.length();
		Node node=root;
		
		for(int i=0;i<length;i++){
			char c=str.charAt(i);
			Map<Character, Node>childs=node.getchildrens();
			
			if(childs.containsKey(c)){
			Node childNode=childs.get(c);
			if(index<childNode.getMinIndex())
				childNode.setMinIndex(index);
			if(index>childNode.getMaxIndex())
				childNode.setMaxIndex(index);
			node=childNode;
			}
			else{
			Node temp=new Node(c);
			temp.setMinIndex(index);
			temp.setMaxIndex(index);
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

	public void findMaxXor(long a, int start, int end) {
		String result="";
		String avalue=zeros.substring(0, Long.numberOfLeadingZeros(a))+Long.toBinaryString(a);
		Node node =root;
		for(int i=0;i<avalue.length();i++){
			char c=avalue.charAt(i);
			if(c=='0'){
				
				if(node.getchildrens().containsKey('1')&&node.getchildrens().get('1').getMinIndex()<=start&&node.getchildrens().get('1').getMaxIndex()>=end){
					result+='1';
					node=node.getchildrens().get('1');
				}
				else{
					result+='0';
 					node=node.getchildrens().get('0');
				}
				
			}
		
			else{
				
				if(node.getchildrens().containsKey('0') && (node.getchildrens().get('0').getMinIndex()<=start) && (node.getchildrens().get('0').getMaxIndex()>=end)){
					result+='1';
					node=node.getchildrens().get('0');
				}
				else{
					result+='0';
					node=node.getchildrens().get('1');
				}
			}
		}
		System.out.println(new BigDecimal(result).longValue());
	}
		
	
}

public class XORKey{
	private static final String zeros ="0000000000000000000000000000000000000000000000000000000000000000";
	public static void main(String[] args) {
		TriesOperation tree=new TriesOperation();
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int N=in.nextInt();
			long[] array= new long [N];
			int Q=in.nextInt();
			for(int i=0;i<N;i++){
				array[i]=in.nextLong();
				String Binary=zeros.substring(0,Long.numberOfLeadingZeros(array[i]))+Long.toBinaryString(array[i]);
				tree.insert(Binary,i+1);	
			
			}
			//tree.printStrings(null, "");
			for(int i=0;i<Q;i++){
			long a=in.nextLong();
			int start=in.nextInt();
			int end=in.nextInt();
			tree.findMaxXor(a,start,end);
				}
			}
		}
}

