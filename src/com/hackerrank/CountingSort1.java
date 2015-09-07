package com.hackerrank;

import java.util.Scanner;

public class CountingSort1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length= in.nextInt();
		int[] arr=new int[100];
		for(int i=0;i<length;i++){
			arr[in.nextInt()]++;
		}
		for(int i=1;i<100;i++){
			arr[i]=arr[i-1]+arr[i];
			
		}
		for(int i=0;i<100;i++){
			
			for(int j=0;j<arr[i];j++){
				System.out.println(i+" ");
			}
		}
	}

}
