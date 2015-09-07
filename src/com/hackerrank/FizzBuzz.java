package com.hackerrank;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int N=in.nextInt();
			for(int i=1;i<=N;i++){
				if(i%3==0&&i%5==0)
					System.out.println("FizzBuzz");
				else if(i%3==0)
					System.out.println("Fizz");
				else if(i%5==0)
					System.out.println("Buzz");
				else
					System.out.println(i);
				
			}
		}
	}
}
