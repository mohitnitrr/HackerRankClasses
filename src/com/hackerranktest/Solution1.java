package com.hackerranktest;

import java.util.Arrays;
import java.util.Scanner;

class Number implements Comparable<Number>{
	int number;
	public Number(int n) {
		this.number =n;
	}
	@Override
	public int compareTo(Number o) {
		int x=countSetBits(this.number);
		int y=countSetBits(o.number);
		
		if(x>y || this.number >o.number)
			return -1;
		else
			return 1;	
			
	}
	private int countSetBits(int num) {
	
		int count=0;
		for(int i=0;i<31;i++){
			if((num & (1<<i))!=0)
				count++;
		}
		
		return count;
	}
	
}

public class Solution1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		Number [] arr = new Number[size];

		for(int i =0;i<size;i++){
			arr[i]= new Number(in.nextInt());
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<size;i++){
			System.out.println(arr[i].number);
		}
		
	}
}
