package com.hackerrank;

import java.util.Scanner;

public class PalindromIndex {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			String palindrom=in.next();
			int start=0;
			int end=palindrom.length()-1;
			int index=-1;
			while(start<end){
				if(palindrom.charAt(start)!=palindrom.charAt(end)){
		
						if(checkSubStringPalindrom(palindrom,start,end-1))
							index=end;
						else if(checkSubStringPalindrom(palindrom,start+1,end))
							index=start;
						
						break;
					
	
				}
				start++;
				end--;
			}
			System.out.println(index);
		}
	}

	private static boolean checkSubStringPalindrom(String palindrom, int start,
			int end) {
		
		while(start<end){
			if(palindrom.charAt(start)==palindrom.charAt(end)){
				start++;
				end--;
			}
			else
				return false;
		}
		
		return true;
	}

}
