package com.string;

import java.util.Scanner;

public class TwoString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		
	outerloop:
		while (testcases--!=0) {
			String str1 = in.next();
			String str2 = in.next();
			int[] check = new int[26];
			for (char c : str1.toCharArray()) {
				check[c - 97] = 1;
			}
			for (char c : str2.toCharArray()) {
				if (check[c - 97] == 1) {
					System.out.println("YES");
					continue outerloop;
				}
			}
			
			System.out.println("NO");
		}
	}
}
