package com.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
	outer:	while(testcases--!=0){
			
			int size = in.nextInt();
			char[][] grid = new char[size][size];
			for(int i= 0 ; i<size; i++){
				String s = in.next();
				char[] charArray =s.toCharArray();
				Arrays.sort(charArray);
				grid[i]=charArray;
			}
			
			for(int i =0;i<size;i++){
					for(int j=0 ;j<size; j++){
						if(j==size-1)
							continue;
						
						if(grid[j][i]>grid[j+1][i]){
							System.out.println("NO");
							continue outer;
					}
				}
			}
			
			System.out.println("YES");
		}
				
	}
}
