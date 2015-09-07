package com.contest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Twoarray2 {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int testcases=in.nextInt();
	while(testcases--!=0){
		int size=in.nextInt();
		int K=in.nextInt();
		int [] arr1= new int[size];
		int [] arr2= new int[size];
		for(int i=0;i<size;i++)
			arr1[i]=in.nextInt();
		for(int i=0;i<size;i++)
			arr2[i]=in.nextInt();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean flg=true;
		for(int i=0;i<size;i++){
		 int temp =arr1[i]+arr2[size-1-i];
		 if(temp<K){
			 System.out.println("NO");
			 flg=false;
			 break;
		 	}
		}
		if(flg)
			System.out.println("YES");
	}
}
}
