package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
	
	 public static void main(String[] args) {
			Scanner in= new Scanner(System.in);
			int testcases= in.nextInt();

			while(testcases--!=0){
				String str =in.next();
				int length=str.length();
				int mid =length/2;
				int count=0;
				Map<Character,Integer> str1Map=new HashMap<Character, Integer>();
				Map<Character,Integer> str2Map=new HashMap<Character, Integer>();
				
				String str1=str.substring(0,mid);
				String str2=str.substring(mid, length);
				if(length%2!=0)
					System.out.println("-1");
				else{
					for(int i=0;i<mid;i++){
						char temp=str1.charAt(i);
					if(str1Map.containsKey(temp))
						str1Map.put(temp,str1Map.get(temp)+1);
					else
						str1Map.put(temp, 1);
					}
					for(int j=0;j<mid;j++){
						char temp=str2.charAt(j);
					if(str2Map.containsKey(temp))
						str2Map.put(temp,str2Map.get(temp)+1);
					else
						str2Map.put(temp, 1);
					}
					
					for(Character c:str1Map.keySet()){
						if(str2Map.containsKey(c)&&str1Map.get(c)>str2Map.get(c))
							count+=str1Map.get(c)-str2Map.get(c);	
						else if(!str2Map.containsKey(c))
							count+=str1Map.get(c);
					}
					
				System.out.println(count);
				
			}
			
		}

     }
}