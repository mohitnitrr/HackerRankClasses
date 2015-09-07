package com.hackerrank2;

import java.util.Scanner;

public class ReverseGame {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			int testcases=in.nextInt();
			while(testcases--!=0){
				int N =in.nextInt();
				int K =in.nextInt();
				int mid=N/2;
				if(K>=mid)
					System.out.println(2*(N-1-K));
				else
					System.out.println(2*K+1);
				
		}
		
	}

}

