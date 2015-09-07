package com.hackerearth;

import java.util.Scanner;

public class MaximumValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int first =in.nextInt();
		int second =in.nextInt();
		int third =in.nextInt();
		
		int result =0;
		if(first ==1){
			if(third==1)
				result= first + second + third;
			else
				result= (first + second) * third;
		}
		else if(second==1){
			 if(first<third)
				 result= (first +second)* third;
			 else
				 result =first * (second +third);
		}
		else{
			if(third==1)
				result = first *(second + third);
			else
				result =first * second * third;
			
		}
		
		System.out.println(result);
		
	}
}
