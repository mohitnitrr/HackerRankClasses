package com.string;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		outer: while (testcases-- != 0) {
			String next = in.next();
			int len = next.length();
			for (int i = 1; i < len - 1; i++) {
				if (Math.abs(next.charAt(i) - next.charAt(i - 1)) != Math
						.abs(next.charAt(len - i) - next.charAt(len - i - 1))) {
					System.out.println("Not Funny");
					continue outer;
				}
			}

			System.out.println("Funny");
		}
	}
}
