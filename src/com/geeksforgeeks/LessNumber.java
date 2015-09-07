package com.geeksforgeeks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LessNumber {

	public static void main(String[] args) {
		List<Integer> arr = new LinkedList<>();
		int [] array = {7,6,10,5,2,8,1,9,3,4};
		for(int i =1;i<=10;i++){
			arr.add(i);
		}
		int result =0;
		for(int next :array ){
			int index =Collections.binarySearch(arr,next);
			if(result<index){
				result = index;
			}
			arr.remove(index);
		}
		System.out.println(result);
	}
}
