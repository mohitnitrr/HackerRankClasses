package com.housing;

//This is the text editor interface. 
//Anything you type or change here will be seen by the other person in real time.


/*
Length of the Longest Palindromic Subsequence in a string
AAAABADZZC
BADC
 */
class palindrom{

	public static void main(String [] agrs){

		String str = "GEEKS FOR GEEKS";

		String str1 = getString();
		int result = longestPalindrom(str);

		System.out.println(result);
	}


	private static String getString() {
		String[] strarr ={"Mohit","Arhun ","hello","hii","dfd"};
		
		StringBuilder strbuBuilder = new StringBuilder();
		for(String str : strarr){
			strbuBuilder.append(str.charAt(0));
		}
		System.out.println(strbuBuilder);
		return strbuBuilder.toString();
	}


	private static int longestPalindrom(String str ){

		if(str.length()==0)
			return 0;
		
		if(str.length()==1)
			return  1;

		else if(str.charAt(0)== str.charAt(str.length()-1))
			return 2+longestPalindrom(str.substring(1,str.length()-1));

		else 
				return Math.max(longestPalindrom(str.substring(1)), longestPalindrom(str.substring(0,str.length()-1)));
		
	}

}

