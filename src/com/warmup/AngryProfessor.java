package com.warmup;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
			while(testcases--!=0){
			int N = in.nextInt();
			int K = in.nextInt();
			
			int count =0; 
			for(int i = 0;i<N ;i++){
				int temp =in.nextInt();
				
				if(temp<=0){
					count++;
				}
		
			}
			if(count>=K){
				System.out.println("NO");
			}
			else
				System.out.println("YES");
		}
		
	}
}
