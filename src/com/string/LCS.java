package com.string;

import java.util.Scanner;

public class LCS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		
		int fLength=first.length();
		int sLength=second.length();
		
		
		int maxLength=findLCS(first,second,fLength,sLength);
		
		System.out.println(maxLength);
	}

	private static int findLCS(String first, String second, int fLength,
			int sLength) {
		
		int max[][] = new int[fLength+1][sLength+1];
		
		for(int i=0;i<=fLength;i++){
			
			for(int j=0;j<=sLength;j++){
				
				if(i==0||j==0){
					max[i][j]=0;
				}
				else if(first.charAt(i-1)==second.charAt(j-1)){
					max[i][j]=max[i-1][j-1]+1;
				}
				else {
					max[i][j]=max(max[i-1][j],max[i][j-1]);
				}
			}
		}
		
		return max[fLength][sLength];
	}

	private static int max(int i, int j) {
		
		if(i>j)
			return i;
		else
			return j;
	}
}
