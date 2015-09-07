package com.datastructure;

class LinkNode {

	int value;
	LinkNode nextNode;

	public LinkNode(int value2) {
		this.value = value2;
	}
}

public class LinkedList {
	 LinkNode root;

	public void insert(int value) {
		if (root == null)
			root = new LinkNode(value);
		else {
			LinkNode prev = null;
			LinkNode current = root;
			while (current != null) {
				prev = current;
				current = current.nextNode;
			}
			prev.nextNode = new LinkNode(value);
		}
	}

	private  void print(LinkNode root) {
		LinkNode current = root;

		while (current != null) {
			if (current != root)
				System.out.print("-->");
			System.out.print(current.value);
			current = current.nextNode;
		}
	}

	private static LinkNode merge(LinkNode root1, LinkNode root2) {
		
		if(root1==null)
			return root2;
		else if(root2==null)
			return root1;
		else{
			if(root1.value<root2.value ){
				if(root1.nextNode==null||root1.nextNode.value >root2.value){
					LinkNode temp = root1.nextNode;
					root1.nextNode = root2;
					root2.nextNode = merge(temp, root2.nextNode);
				}
				else{
					merge(root1.nextNode, root2);
				}
			}
			else{
				LinkNode temp = root2.nextNode;
				root2.nextNode=root1;
				root1=root2;
				root1.nextNode=merge(root1.nextNode,temp);
			}
		}
		return root1;
	}
	
	private static LinkNode merge2(LinkNode root1, LinkNode root2) {
		LinkNode result;
		
		if(root1== null)
			return root2;
		else if(root2 == null)
			return root1;
		else{
			if(root1.value<=root2.value){
				 result = root1;
				result.nextNode = merge2(root1.nextNode, root2);
			}else{
				result = root2;
				result.nextNode = merge2(root1, root2.nextNode);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(1);
		linkedList.insert(4);
		linkedList.insert(8);

		linkedList.print();
		System.out.println();
		
		LinkedList linkedList2 = new LinkedList();
		linkedList2.insert(0);
		linkedList2.insert(2);
		linkedList2.insert(9);
		
		linkedList2.print();
		
		LinkNode result = merge2(linkedList.root,linkedList2.root);
		
		linkedList.print(result);
	}

	private void print() {
		LinkNode current = root;

		while (current != null) {
			if (current != root)
				System.out.print("-->");
			System.out.print(current.value);
			current = current.nextNode;
		}
		
	}

}
