package com.implementation;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		int rotation = in.nextInt();
		
		int[][] matrix = new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix[i][j]= in.nextInt();
			}
		}
		
		for(int i=0;i<rotation;i++){
			rotateMatrix(matrix,0,row-1,0,col-1);
			
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}

	private static void rotateMatrix(int[][] matrix, int startRow, int endRow, int startCol, int endCol) {
		
		while(startRow < endRow && startCol < endCol){
			int prev=matrix[startRow][endCol];
			
			for(int i=endCol;i>startCol;i--){
				int temp =prev;
				prev=matrix[startRow][i-1];
				matrix[startRow][i-1]=temp;
			}
			
			
			
			for(int i=startRow;i<endRow;i++){
				int temp =prev;
				prev = matrix[i+1][startCol];
				matrix[i+1][startCol]=temp;
			
			}
			
			for(int i=startCol;i<endCol;i++){
				int temp =prev;
				prev=matrix[endRow][i+1];
				matrix[endRow][i+1]=temp;
			}
			
			for(int i=endRow;i>startRow;i--){
				int temp =prev;
				prev = matrix[i-1][endCol];
				matrix[i-1][endCol]=temp;
			
			}
			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}
		
	}
}
