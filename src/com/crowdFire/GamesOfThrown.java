package com.crowdFire;

import java.util.Scanner;

public class GamesOfThrown {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[][] matrix = new int[size][size];
		boolean[][] visited = new boolean[size][size];
		for(int i=0;i<size;i++){
			String next = in.next();
			char[] charArray = next.toCharArray();
			for(int j=0;j<size;j++){
				matrix[i][j]=charArray[j]-'0';
			}
		}
		
		int count =dfs(matrix,visited,size);
		System.out.println(count);
	}

	private static int dfs(int[][] matrix, boolean[][] visited, int size) {
		int count = 0;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(!visited[i][j] && matrix[i][j]==1){
					count++;
					//visited[i][j] = true;
					doDfs(matrix,visited,i,j,size);
				}
				
					
			}
		}
		
		return count ;
	}

	
	private static void doDfs(int[][] matrix, boolean[][] visited, int i, int j, int size) {

		if(i<0  || j<0 || j>=size|| i>=size|| visited[i][j] || matrix[i][j]==0)
			return; 
		else{
			visited[i][j] = true;
			
			doDfs(matrix, visited, i+1, j,size);
			doDfs(matrix, visited, i-1, j,size);
			doDfs(matrix, visited, i, j+1,size);
			doDfs(matrix, visited, i, j-1, size);
			doDfs(matrix, visited, i+1, j+1,size);
			doDfs(matrix, visited, i-1, j-1,size);
			doDfs(matrix, visited, i+1, j-1, size);
			doDfs(matrix, visited, i-1, j+1,size);
		}
		
	}

	private static boolean isSafe(int[][] matrix, boolean[][] visited, int i,
			int j, int size) {
		if(i<0  || j<0 || j>=size|| i>=size|| visited[i][j] || matrix[i][j]==0)
			return false;
		else
			return true;
	}
}
