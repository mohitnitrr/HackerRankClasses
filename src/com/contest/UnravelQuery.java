package com.contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UnravelQuery {

private static Map<Character, List<String>> wordMap;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.next());
		wordMap=new HashMap<Character, List<String>>();
		for(int i=0;i<size;i++){
			String nextWord=in.next();
			char c=nextWord.charAt(0);
			if(wordMap.containsKey(c)){
				List<String> list=wordMap.get(c);
				list.add(nextWord);
				wordMap.put(c, list);
			}
			else{
				List<String>list=new ArrayList<String>();
				list.add(nextWord);
				wordMap.put(c, list);
			}
		}
		
		String query =in.next();
		createSpaceSeparatedWord(query,wordMap);
		
	}

	private static void createSpaceSeparatedWord(String query,
			Map<Character, List<String>> wordMap) {
		
		String outputString=new String();
		int index =0;
		createToken(index,outputString,query);
		System.out.println("NULL");
		System.exit(0);
		
	}

	private static void createToken(int index, String outputString, String query) {
		
		char c=	query.charAt(index);
		List<String> charStartedList=wordMap.get(c);
		if(charStartedList==null){
			return;
		}
		Collections.sort(charStartedList);
		for(String s:charStartedList){
			int temp=s.length();
			if(query.substring(index,index+temp).equals(s)){
				if(index==0)
					outputString=s;
				else
				outputString=outputString+" "+s;
				
				int check=index+s.length();
				if(check==query.length()){
					System.out.println(outputString);
					System.exit(0);
				}
				else
				createToken(index+s.length(), outputString, query);
			}
			else
				return;
			
		}
		System.out.println("NULL");
		System.exit(0);
		
	}
}
