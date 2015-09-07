package com.zenify;

import java.util.Scanner;

public class JumpingJack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		int maxStep = maxSteps(n, k);
		System.out.println(maxStep);
	}

	private static int maxSteps(int n, int k) {
		int maxSteps = n * (n + 1) / 2;
		if (k > maxSteps)
			return maxSteps;
		else {
			int sqrt = (int) Math.sqrt(k * 2);
			int naturalSum = sqrt * (sqrt + 1);
			if (naturalSum == k * 2)
				maxSteps = maxSteps - k;
		}
		return maxSteps;
	}
}
