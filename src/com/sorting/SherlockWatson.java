package com.sorting;

import java.util.Scanner;

public class SherlockWatson {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int size =in.nextInt();
		int noRotation=in.nextInt();
		int query=in.nextInt();
		
		int[] array= new int[size];
		for(int i=0;i<size;i++){
			array[i]=in.nextInt();
		}
		
		noRotation=noRotation%size;
		
		while(query--!=0){
			int index=in.nextInt();
			
			int apparentIndex= (index-noRotation + size) %size;
			
			System.out.println(array[apparentIndex]);
		}
	}
}
