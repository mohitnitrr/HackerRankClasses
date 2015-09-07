package com.contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TwoArrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int size=in.nextInt();
			int K=in.nextInt();
			Map<Integer, Integer> valuepair=new HashMap<Integer, Integer>();
		
			for(int i=0;i<size;i++){
				int temp=in.nextInt();
				if(valuepair.containsKey(K-temp)){
				int count=valuepair.get(K-temp);
				valuepair.put(K-temp, ++count);
				}
				else
					valuepair.put(K-temp, 1);
			}
			int count=0;
			for(int i=0;i<size;i++){
				int temp =in.nextInt();
				if(valuepair.containsKey(temp)){
					int no=valuepair.get(temp);
					if(no>0){
					valuepair.put(temp, --no);
					count++;
					}
				}

			}
		
		if(count==size)
			System.out.println("YES");
		else
			System.out.println("NO");
		}
	}
}
