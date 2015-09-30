package com.hackerranktest;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col =3;
		char[][] arr = new char[row][3];
		for(int i=0;i<row;i++){
			int j=0;
			String next =in.next();
			//col=next.length();
			for(char a :next.toCharArray()){
				arr[i][j++]=a;
			}
		}
		
		int count = count(arr,row,col );
		System.out.println(count);
	}

	private static int count(char[][] arr,int row,int col) {
		//boolean [][] count =new boolean[row][col];
		int count =0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(arr[i][j]=='G'){
					count+=2;
					
				}
				else if(arr[i][j]=='R' && j>0 && arr[i][j-1]=='.')
					count++;
				
				else if(arr[i][j]=='B' && i>0 && arr[i-1][j]=='.')
					count++;
					
			}
		}
		return count;
	}
}
