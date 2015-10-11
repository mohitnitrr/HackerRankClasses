package com.implementation;

import java.util.Scanner;

public class ACMICPCTEAM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int count = 0;
		int max = 0;
		String arr[] = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.next();
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int newMax = getMax(arr[i], arr[j], M);
				if (newMax > max) {
					max = newMax;
					count = 1;
				} else if (newMax == max)
					count++;

			}
		}
		System.out.println(max);
		System.out.println(count);
	}

	private static int getMax(String string, String string2, int m) {
		int count = 0;
		for (int i = 0; i < m; i++) {
			if (string.charAt(i) == '1' || string2.charAt(i) == '1')
				count++;
		}
		return count;

	}
}
