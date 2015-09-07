package com.greedy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.utils.FileWriterUtil;

public class LargestPermutation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int swap = in.nextInt();
		
		int[] arr = new int[size];
		Queue<Integer>tempQueue = new LinkedList<>();
		//int[] temp= new int[swap];
		int maxValue=size;
		int limit=size-swap +1;
		for(int i=0;i<size;i++){
			if(swap>0){
				int tempInput= in.nextInt();
				if(tempInput==maxValue){
					arr[i]=maxValue;
				}
				else{
					tempQueue.add(tempInput);
					arr[i]=maxValue;
					swap--;
				}
				maxValue--;
				
			}
			else{
				int tempVal=in.nextInt();
				if(tempVal>=limit){
					while(tempQueue.peek()>=limit)
						tempQueue.poll();
					arr[i]=tempQueue.poll();
				}
				else
					arr[i]=tempVal;
			}
		}
		
		FileWriterUtil.fileIntialize();
		
		for(int x : arr){
			//System.out.print(x + " ");
			FileWriterUtil.fileWriter(Integer.toString(x) + " ");
		}
		
		FileWriterUtil.fileCloser();
	}
}
