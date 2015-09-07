package com.hackerrank2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testcase=in.nextInt();
		while(testcase--!=0){
		String str=in.next();
		StringBuffer output= new StringBuffer();
		Set<Character> hashkey=new HashSet<Character>();
		for(int i=0;i<str.length();i++){	
			if(!hashkey.contains(str.charAt(i))){
				hashkey.add(str.charAt(i));
				output.append(str.charAt(i));
				}
			}
		System.out.println(output);
		}
		
	}

}
