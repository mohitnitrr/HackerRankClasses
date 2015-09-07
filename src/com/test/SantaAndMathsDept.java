package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SantaAndMathsDept {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int N =in.nextInt();
			Map<Integer, Integer> giftArr=new HashMap<Integer, Integer>();
			for(int i=0;i<N;i++){
				int temp=in.nextInt();
				if(giftArr.containsKey(temp)){
				int count=	giftArr.get(temp);
				count++;
				giftArr.put(temp, count);
				}
				else{
					giftArr.put(temp, 1);
				}
						
			}
			int K =in.nextInt();
			long count=0;
			for(Integer next:giftArr.keySet()){
				int key=next;
				int value=giftArr.get(key);
				int anotherKey=K-key;
				if(anotherKey==key){
					count+=value*(value-1)/2;
					giftArr.put(key, 0);
				}
				else{
					if(giftArr.containsKey(anotherKey)){
						count+=value*giftArr.get(anotherKey);
						giftArr.put(key, 0);
						giftArr.put(anotherKey, 0);
					}
				}
			}
			System.out.print(count+" ");
		}
	}
}
