package com.datastructure;

import java.util.Scanner;

class BinaryNode{

	private int value ;
	private BinaryNode leftNOde;
	private BinaryNode rightNode;
	
	public BinaryNode(int i) {
		this.value =i;
	}
	
	int getValue(){
		return this.value;			
	}
	
	BinaryNode getLeftNode(){
		return this.leftNOde;
	}
	
	BinaryNode getRightNode(){
		return this.rightNode;
	}

	public void setLeft(BinaryNode node) {
		this.leftNOde =node;
		
	}

	public void setRight(BinaryNode binaryNode) {
		this.rightNode = binaryNode;
		
	}
	

}

class BinaryTree{
	static BinaryNode root = null;
	int totalNode;
	BinaryNode[] arr;
	public BinaryTree(int n){
		if(n>0){
			root= new BinaryNode(1); 
			totalNode = n;
			arr = new BinaryNode[n];
			arr[0]=root;
		}
	}
	
	void insertChild(int i,int left,int right){
		
		if(left!=-1){
			BinaryNode temp = new BinaryNode(left);
			arr[i-1].setLeft(temp);
			arr[left-1]=temp;
		}	
		else
			arr[i-1].setLeft(null);
		
		if(right!=-1){
			BinaryNode temp = new BinaryNode(right);
			arr[i-1].setRight(temp);
			arr[right-1]=temp;
		}
		else
			arr[i-1].setRight(null);
		
				
	}

	static void printNodeInorder(BinaryNode node) {
		if(node==null)
			return ;
		else{
			printNodeInorder(node.getLeftNode());
			System.out.print(node.getValue() + " ");
			printNodeInorder(node.getRightNode());
			
		}
			
	}

	public void swapAtLevel(BinaryNode node, int level,int countLevel) {
		if(node==null)
			return;
		
		if(countLevel%level==0){
			swap(node);
			
		}
		
			countLevel++;
			swapAtLevel(node.getLeftNode(), level, countLevel);
			swapAtLevel(node.getRightNode(), level, countLevel);
		
		
		
		
		
	}

	private void swap(BinaryNode nodeAtLevel) {
		BinaryNode left = nodeAtLevel.getLeftNode();
		BinaryNode right = nodeAtLevel.getRightNode();
		nodeAtLevel.setLeft(right);
		nodeAtLevel.setRight(left);
		
	}
}
public class SwapNode {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalNodes= in.nextInt();
		
		BinaryTree binaryTree = new BinaryTree(totalNodes);
		
		for(int i=1;i<=totalNodes;i++){
			int left= in.nextInt();
			int right=in.nextInt();
			binaryTree.insertChild(i, left, right);
		}
		
	//	BinaryTree.printNodeInorder(BinaryTree.root);
		int testcases = in.nextInt();
		
		while(testcases--!=0){
			
			int level = in.nextInt();
			binaryTree.swapAtLevel(BinaryTree.root,level,1);
			BinaryTree.printNodeInorder(BinaryTree.root);
			System.out.println();
		}
				
	}
	

}
