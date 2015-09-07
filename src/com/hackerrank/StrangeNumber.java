package com.hackerrank;

import java.util.Scanner;

public class StrangeNumber {
	private static final int size=100000000;
	private static  boolean[]strangeArray=new boolean[size];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int count=0;
			long L=in.nextLong();
			long R =in.nextLong();
			for(Long i=L;i<=R;i++)
				if(strangeNumber(i)){
					count++;
					strangeArray[i.intValue()]=true;
				}
			
			System.out.println(count);
			}
		
	}

	private static boolean strangeNumber(Long i) {
		int length=i.toString().length();
		boolean result=false;
		if(i<10&&i>=0)
			return true;
		else if(i%length!=0)
			return false;
		else if(i.intValue()<size)
			return strangeArray[i.intValue()];
				
		else 
			return result;
				
	}
	

}
