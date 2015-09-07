package com.djsc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Characterpair {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			String next =in.next();
			Map<Character, Integer> map =new HashMap<Character, Integer>();
			
			for(char c:next.toCharArray()){
				if(map.containsKey(c)){
					Integer count=map.get(c);
					map.put(c, ++count);
				}
				else{
					map.put(c, 1);
				}
			}
			long count=0;
			for(Map.Entry<Character, Integer> nextKey:map.entrySet()){
				if(nextKey.getValue()==1)
					count++;
				else{
					long value=nextKey.getValue();
					count+=value*value;
				}
			}
			
			System.out.println(count);
		}
	}

}
