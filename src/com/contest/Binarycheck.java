package com.contest;

import java.util.Scanner;

public class Binarycheck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int m=in.nextInt();
		int k=in.nextInt();
		int x=in.nextInt();
		int[] arr=new int[m];
		for(int i=0;i<m;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<m;i++){
			arr[i]=arr[i]&x;
		}
		int count=0;
		for(int l:arr){
			if(Integer.bitCount(l)<=k)
				count++;
		}
		System.out.println(count);
	}
}
