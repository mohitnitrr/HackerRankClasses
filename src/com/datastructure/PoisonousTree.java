package com.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class PoisonousTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		Stack<Integer> localMaxima = new Stack<Integer>();
		int stackTop;

		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		
		int i = 1;
		int days = 0;
		stackTop = array[0];
		//localMaxima.add(array[0]);
		
		while (i < size) {
			int count = 0;
			boolean isIncreasing = false;
			while (i < size && array[i-1] < array[i]) {
				isIncreasing = true;
				i++;
			}
			if (isIncreasing)
				count++;

			int minimum;
			while (i < size && array[i] <= array[i - 1]) {
				minimum =array[i];
				if(!localMaxima.isEmpty() && minimum <= stackTop && localMaxima.peek()==minimum){
					i++;
					continue;
				}
					
				if (localMaxima.isEmpty() || localMaxima.peek() >= array[i]){
					localMaxima.add(array[i]);	
					
				}
				else 
					count++;		

				i++;
			}
			 if(array[i-1] <= stackTop){
				 stackTop = array[i-1];
				 count += localMaxima.size()-1;
				 localMaxima.clear();
			 }
			 
			 else if(i==size){
				 count += localMaxima.size();
			 }
				if(count > days)
				days = count;
		}

		System.out.println(days);
	}
}
