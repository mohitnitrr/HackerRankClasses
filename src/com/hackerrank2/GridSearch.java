package com.hackerrank2;

import java.util.Scanner;

public class GridSearch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases =in.nextInt();
		while(testcases--!=0){
			int row=in.nextInt();
			int col=in.nextInt();
			int[][] src=new int[row][col];
			for(int i=0;i<row;i++){
				int j=0;
				String str=in.next();
				char[] rowItem=str.toCharArray();
				for(char c:rowItem){
					src[i][j]=Character.getNumericValue(c);
					j++;
				}
				
			}
			
			int row1=in.nextInt();
			int col1=in.nextInt();
			int[][] tgt=new int[row1][col1];
			for(int i=0;i<row1;i++){
				int j=0;
				String str=in.next();
				char[] rowItem=str.toCharArray();
				for(char c:rowItem){
					tgt[i][j]=Character.getNumericValue(c);
					j++;
				}
				
			}
			boolean found=false;
			
			for(int i=0;i<=row-row1;i++){
				
				for(int j=0;j<=col-col1;j++){
					
			//		boolean flag=false;
					int k=0;
					int p=0;
					for(k=0;k<row1;k++){
						boolean flag=false;
						for(p=0;p<col1;p++){
							if(src[i+k][j+p]!=tgt[k][p]){
								flag=true;
								break;
							}
						}
						if(flag)
							break;
					}
					if(k==row1&&p==col1){
						System.out.println("YES");
						found=true;
					}
					if(found)
						break;
				}
				if(found)
					break;
			}
			if(!found)
			System.out.println("NO");
			
			
			
			
		}
	}
}

