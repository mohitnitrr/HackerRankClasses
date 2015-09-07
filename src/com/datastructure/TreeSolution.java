package com.datastructure;

import java.util.Deque;
import java.util.LinkedList;


class TreeNode{
	public TreeNode(int n) {
		this.value =n;
	}
	int value ;
	TreeNode left ;
	TreeNode right;
}

class Tree {
	TreeNode root;

	public Tree(int i) {
		root = new TreeNode(i);
	}

	void insert (TreeNode node ,int n){
		if(node ==  null){
			node = root;
		}
		if(node.value > n ){
			if(node.left == null )
				node.left = new TreeNode(n);
			else
				insert(node.left, n);

		}else{
			if(node.right == null )
				node.right = new TreeNode(n);
			else
				insert(node.right, n);
		}
	}
	
	void Inorder(){
		inOrderTraversal(root);
	}

	private void inOrderTraversal(TreeNode node) {
		if(node== null)
			return ;
		else{
			inOrderTraversal(node.left);
			System.out.print( node.value + " " );
			inOrderTraversal(node.right);
		}
	}

	public void distantPath(TreeNode currentNode, int count, Deque<TreeNode> sequence) {
		 if(currentNode== null)
			return ;
		else{
			sequence.addLast(currentNode);
			if(count-1==0)
				print(sequence);
			else{
			distantPath(currentNode.left, count-1, sequence);
			distantPath(currentNode.right, count-1, sequence);
			}
			sequence.removeLast();
		}
	}

	private void print(Deque<TreeNode> sequence) {
		
		for(TreeNode node :sequence){
			System.out.print(node.value+ " " );
		}
		System.out.println();
		
	}

}

public class TreeSolution{
	public static void main(String[] args) {
		
		Tree tree = new Tree(5);
		
		tree.insert(null, 4);
		tree.insert(null, 6);
		tree.insert(null, 3);
		tree.insert(null,2);
		tree.insert(null, 1);
		tree.insert(null, 8);
		tree.insert(null, 7);
		
		tree.Inorder();
		
		Deque<TreeNode> sequence = new LinkedList<>();
		tree.distantPath(tree.root,3,sequence);
	}
}
