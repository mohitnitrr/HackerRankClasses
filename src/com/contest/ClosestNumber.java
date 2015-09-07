package com.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClosestNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int min=arr[size-1];
		List<Integer>output=new ArrayList<>();
		
		for(int i=0;i<size-1;i++){
			int diff=arr[i+1]-arr[i];
			if(diff<min){
				min=diff;
				output.clear();
				output.add(arr[i]);
				output.add(arr[i+1]);
			}
			else if(diff==min){
				output.add(arr[i]);
				output.add(arr[i+1]);
			}
		}
		
		for(int x:output){
			System.out.print(x+" ");
		}

	}
}
