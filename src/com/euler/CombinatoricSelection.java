package com.euler;

import java.util.Scanner;

public class CombinatoricSelection {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long K = in.nextLong();
		long next=1;
		for(int i =0;i<=N;i++){
			if(next>K){
				System.out.println(N+1-2*i);
				break;
			}
			next = next*(N-i)/(i+1);
		}
	}
}
