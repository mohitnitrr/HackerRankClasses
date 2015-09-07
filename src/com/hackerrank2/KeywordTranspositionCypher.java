package com.hackerrank2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeywordTranspositionCypher {
	private static String alpha ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testcases=Integer.parseInt(in.nextLine());
		while(testcases--!=0){
			
			String keyword=in.nextLine();
			char[] keywordArray=keyword.toCharArray();
			Arrays.sort(keywordArray);
			
			for(int i=0;i<keywordArray.length-1;i++){
			char ch=keywordArray[i];
			if(keyword.indexOf(ch)!=keyword.lastIndexOf(ch))
				keyword=keyword.substring(0, keyword.lastIndexOf(ch))+keyword.substring(keyword.lastIndexOf(ch)+1,keyword.length());
			}
			
			keywordArray=keyword.toCharArray();
			Arrays.sort(keywordArray);
	
			int row =26/keywordArray.length+1;
			int col=keyword.length();
			char[][] keyFrame=new char[row][col];
			int k=0;
			for(int j=0;j<col;j++)
				keyFrame[0][j]=keyword.charAt(j);
			
			for(int i=1;i<row;i++){
				for(int j=0;j<col&&k<26;j++,k++)
					if(keyword.contains(""+alpha.charAt(k))){
						j--;
					}
					else
					keyFrame[i][j]=alpha.charAt(k);
			}
			
			
			
			String Substitute="";
			
			for(int i=0;i<keywordArray.length;i++){
				int colRead=keyword.indexOf(keywordArray[i]);
					for(int j=0;j<row;j++){
						if(Character.isAlphabetic(keyFrame[j][colRead]))
							Substitute+=keyFrame[j][colRead];
						}
					}
			
			Map<Character, Character> key=new HashMap<Character, Character>();
				
			for(int i=0;i<26;i++){
				key.put(Substitute.charAt(i), alpha.charAt(i));
			}
			String cipherText=in.nextLine();
			String original="";
			
			for(int i=0;i<cipherText.length();i++)
			{
				if( cipherText.charAt(i)==' ')
					original+=' ';
				else{
					original+=key.get(cipherText.charAt(i));
				}
			}
			
			System.out.println(original);
		}
	}

}
