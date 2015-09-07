package com.hackerrank;

import java.util.Scanner;

public class AlternatingCharacter {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		//char[] strArray=str.toCharArray();
		while(testcases--!=0){
			String str= in.next();
			int noDeletion=0;
			char lastchar=str.charAt(0);
			for(int i=1;i<str.length();i++){
				
				if(str.charAt(i)==lastchar)
					noDeletion++;
				else
					lastchar=str.charAt(i);
				
			}
			
			System.out.println(noDeletion);
			
		}
		
	}

}
