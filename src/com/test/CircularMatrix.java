package com.test;

import java.util.Scanner;

public class CircularMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int dimention=in.nextInt();
			int[][] arr=new int[dimention][dimention];
			
			int startRow=0;
			int endRow=dimention-1;
			int startColoum=0;
			int endColoum=dimention-1;
			int count=1;
			while(startRow<=endRow&&startColoum<=endColoum){
				
				//for 1st colunm
				for(int i=startRow;i<=endRow;i++){
					arr[i][startColoum]=count;
					count++;
				}
				startColoum++;
				//for last row
				for(int i=startColoum;i<=endColoum;i++){
					arr[endRow][i]=count;
					count++;
				}
				
				endRow--;
				//for last column
				for(int i=endRow;i>=startRow;i--){
					arr[i][endColoum]=count;
					count++;
				}
				
				endColoum--;
				
				//for first row
				
				for(int i=endColoum;i>=startColoum;i--){
					arr[startRow][i]=count;
					count++;
				}
				startRow++;
				
			}
			
			for(int i=0;i<dimention;i++){
				for(int j=0;j<dimention;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		}
	}
}
