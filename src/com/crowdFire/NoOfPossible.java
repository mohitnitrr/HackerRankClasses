package com.crowdFire;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NoOfPossible {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times  = in.nextInt();
		String[] records = new String[times];
		
		for(int i =0;i<times;i++){
			records[i]=in.next();
		}
		
		Map<Integer,Set<Integer>> faces = new HashMap<Integer, Set<Integer>>();
		
		for(String next : records){
			
			for(int i =0;i<next.length();i++){
				int face = next.charAt(i)-'0';
				boolean flag =false;
				for(Map.Entry<Integer, Set<Integer>> collect :faces.entrySet()){
					Set<Integer> set =collect.getValue();
					
				}
			}
		}
	}
}
