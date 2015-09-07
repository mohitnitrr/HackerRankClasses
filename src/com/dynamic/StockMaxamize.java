package com.dynamic;

import java.util.Scanner;

public class StockMaxamize {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase=in.nextInt();
		while(testcase--!=0){
			int Size=in.nextInt();
			int [] arr =new int[Size];
			for(int i=0;i<Size;i++){
				arr[i]=in.nextInt();
			}
			printMAXProfit(arr);
		}
	}

	private static void printMAXProfit(int[] arr) {
		int [] maxdeal =new int[arr.length];
		maxdeal[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>maxdeal[i+1])
				maxdeal[i]=arr[i];
			else
				maxdeal[i]=maxdeal[i+1];
		}
		long count =0;
		long sumsell=0;
		long sumbuy=0;
		for(int i=0;i<arr.length;i++){
			if(maxdeal[i]>arr[i]){
				count++;
				sumbuy+=arr[i];
			}
			else{
				sumsell+=count*(long)arr[i];
				count=0;
			}
		}
		System.out.println(sumsell-sumbuy);
	}
}
