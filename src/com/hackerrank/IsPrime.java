	package com.hackerrank;

import java.util.Scanner;

public class IsPrime {
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int N = in.nextInt();
			if(isSemiPrime(N))
			System.out.println("YES");
			else
			System.out.println("NO");
				
		}
	}
	
	private static boolean isSemiPrime(int i) {
		boolean flag =true;
		int count=0;
		if(i<2)
		flag=false;
		
		for(int j=2;j<=Math.sqrt(i);j++){
			if(i%j==0){
				flag=isPrimeFactor(j);
				if(flag){
					count++;
				}
				else
					return false;
			}
			
		}
		if(count>2||count==0)
			return false;
		return flag;
	}

	private static boolean isPrimeFactor(int i) {
		boolean flag =true;
		if(i<2)
		flag=false;
		
		for(int j=2;j<=Math.sqrt(i);j++){
			if(i%j==0){
				flag=false;
				break;
			}
			
		}	
		return flag;
	}


}
