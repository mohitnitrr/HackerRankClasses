package com.cisco;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class NodeBST{
	
	int value ;
	Map<Integer,Integer> fileNumFrequency;
	NodeBST left;
	NodeBST right;
	
	public NodeBST(int value, int file) {
		this.value = value;
		fileNumFrequency = new HashMap<Integer, Integer>();
		fileNumFrequency.put(file, 1);
	}

	public NodeBST getLeft() {
		return this.left;
	}
	
	public NodeBST getRight() {
		return this.right;
	}

	public int getValue() {
		return this.value;
	}

	public void incrementFileCount(int file) {
		if(!fileNumFrequency.containsKey(file))
			fileNumFrequency.put(file, 1);
		else{
			int count =fileNumFrequency.get(file);
			fileNumFrequency.put(file,++count);			
		}
	}

	public Map<Integer, Integer> getFrequencyMap() {
		
		return this.fileNumFrequency;
	}
}

class BST{
	NodeBST root;
	
	void insert(int file, int value){
		if(root == null){
			root = new NodeBST(value,file);
		}else{
			NodeBST parent = null;
			NodeBST next= root;
			while(next!=null){
				parent=next;
				if(value == next.getValue())
					break;
				else if(value<next.getValue()){
					next=next.getLeft();
				}
				else{
					next = next.getRight();
				}
			}
			if(value == parent.getValue())
				parent.incrementFileCount(file);
			
			else if(value < parent.getValue())
				parent.left = new NodeBST(value, file);
			else
				parent.right = new NodeBST(value, file);
				
		}
	}
	
	 NodeBST getNode(int value){
		NodeBST next = root;
		while(next!=null){
			if(value == next.getValue())
				break;
			else if(value<next.getValue()){
				next=next.getLeft();
			}
			else{
				next = next.getRight();
			}
		}
		
		return next;
	}
}
public class BigFileSystem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BST BinarySearchTree = new BST();
		
		int numOfFile = in.nextInt();
		
		for(int i=1;i<=numOfFile;i++){
			int noItems = in.nextInt();
			
			for(int j=0;j<noItems;j++){
				BinarySearchTree.insert(i, in.nextInt());
			}
		}
		
		int noQuery = in.nextInt();
		
		for(int i =0;i<noQuery;i++){
			int type = in.nextInt();
			int count  = in.nextInt();
			Map<Integer,Integer>fileNumFrequency = new HashMap<Integer, Integer>();
			
			for(int j =0;j<count;j++){
				int nextNum = in.nextInt();
				if(!fileNumFrequency.containsKey(nextNum))
					fileNumFrequency.put(nextNum, 1);
				else{
					int countIn =fileNumFrequency.get(nextNum);
					fileNumFrequency.put(nextNum,++countIn);			
				}
			}
			
			switch (type) {
			case 1:{
				Set<Integer> resultSet = new HashSet<>();
				int x=0;
				for(Map.Entry<Integer, Integer> nextElement : fileNumFrequency.entrySet()){
					Set<Integer> temp = new HashSet<>();
					int elementCount =nextElement.getValue();
					NodeBST node =BinarySearchTree.getNode(nextElement.getKey());
					if(node!=null){
						for(Map.Entry<Integer, Integer> next : node.getFrequencyMap().entrySet()){
							if(next.getValue()>=elementCount)
								temp.add(next.getKey());
						}
					}
					if(x==0)
						resultSet.addAll(temp);
					else
						resultSet.retainAll(temp);
					
					x++;
				}
				System.out.println(resultSet.size());
				break;
			}
			case 2:{
				Set<Integer> temp = new HashSet<>();
				for(Map.Entry<Integer, Integer> nextElement : fileNumFrequency.entrySet()){
					NodeBST node =BinarySearchTree.getNode(nextElement.getKey());
					if(node!=null){
						for(Map.Entry<Integer, Integer> next : node.getFrequencyMap().entrySet()){
							//if(next.getValue()>=elementCount)
								temp.add(next.getKey());
						}
					}

				}
				System.out.println(temp.size());
				break;
			}
			case 3:{
				Map<Integer, Integer> fileElement = new HashMap<>();
				for(Map.Entry<Integer, Integer> nextElement : fileNumFrequency.entrySet()){
					NodeBST node = BinarySearchTree.getNode(nextElement.getKey());
					if(node!=null){
						for(Map.Entry<Integer, Integer> next : node.getFrequencyMap().entrySet()){
							int matches =0;
							if(next.getValue()>=nextElement.getValue())
								matches=nextElement.getValue();
							else
								matches=next.getValue();
							
							if(!fileElement.containsKey(next.getKey())){
								fileElement.put(next.getKey(),matches);
							}else{
								int xyz= matches+ fileElement.get(next.getKey());
								fileElement.put(next.getKey(), xyz);
							}
						}
					}
				}
				int result =0;
				for(Map.Entry<Integer, Integer> memberCount : fileElement.entrySet()){
					int size =memberCount.getValue();
					if(size>=1 && size<= count -1)
						result++;
				}
				System.out.println(result);
				break;

			}
			default:
				break;
			}
		}
		
	}
}
