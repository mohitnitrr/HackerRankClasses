package com.hackerrank2;

import java.util.Scanner;

public class CommonString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			String first=in.next();
			String second=in.next();
			boolean flag=true;
			for(char c:first.toCharArray()){
				if(second.contains(""+c)){
					System.out.println("YES");
					flag=false;
					break;
				}
			}
			if(flag)
			System.out.println("NO");
		}
	}
}
