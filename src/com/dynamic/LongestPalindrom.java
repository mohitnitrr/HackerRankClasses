package com.dynamic;

import java.util.Scanner;

public class LongestPalindrom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		int length = longestPalindrom(str);
		System.out.println(length);
	}

	private static int longestPalindrom(String str) {
	 
		int startindex=-1;
		int maxLength=1;
		int length  = str.length();
		boolean [][] flag = new boolean[length][length];
		
		for(int i =0 ;i<length;i++){
			flag[i][i] = true ;
		}
		
		for(int i=0;i<length-1;i++){	
			if(str.charAt(i) == str.charAt(i+1))
				flag[i][i+1]= true;
		}
		
		for(int k =3 ;k <=length;k++){
			
			for(int start =0;start<length-k+1;start++){
				
				int end = start+k-1;
				if(flag[start+1][end-1] && str.charAt(start)== str.charAt(end)){
					flag[start][end]=true;
					
					if(maxLength<k){
						maxLength=k;
						startindex=start; 
						
					}
				}
				
			}
		}
		
		return maxLength;
	}
}
