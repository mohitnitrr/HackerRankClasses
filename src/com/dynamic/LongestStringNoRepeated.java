package com.dynamic;

import java.util.Scanner;

public class LongestStringNoRepeated {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.next();

		int length = longestWithoutRepeatation(str);
	}

	private static int longestWithoutRepeatation(String str) {

		int length = str.length();
		int maxLength = 0;
		int [] charCount = new int[256];
		charCount[str.charAt(0)]=1;
		int start=0;
		int end =1;
		int index=-1;

		while(true){
			
			while(end<length && ++charCount[str.charAt(end)]<=1){
				end++;
			};
			if((end-start)>maxLength){
				maxLength=end-start;
				index= start;
			}
			if(end==length){
				break;
			}
			else if(charCount[str.charAt(end)]>1){
				while(str.charAt(start)!=str.charAt(end) && start<end)
				--charCount[str.charAt(start++)];
				start++;
				end++;
			}
			

		}
		System.out.println(str.substring(index,index+maxLength));
		return length;
	}
}

