package com.hackerearth;

import java.util.Scanner;

public class progression {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
outer:while(testcases--!=0){
		int sum =in.nextInt();
		
		if(sum % 3==0){
			sum =sum/3;
			for(int i= 1 ;i <20;i++){
				int diff =15*i;
				if((sum-diff)>0 && (sum-diff) %2 ==0){
					System.out.println("CORRECT");
					continue outer;
				}
			}
			
			System.out.println("INCORRECT");
			
		}
		else
			System.out.println("INCORRECT");
			
		}
	}
}
