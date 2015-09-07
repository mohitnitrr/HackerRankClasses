package com.hackerrank2;

import java.util.Scanner;

public class PossiblePath {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			long a =in.nextLong();
			long b =in.nextLong();
			long x=in.nextLong();
			long y=in.nextLong();
			
			long diffX=Math.abs(x-a);
			long diffY=Math.abs(y-b);
			
			if(diffX%b==0&&diffY%b==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
