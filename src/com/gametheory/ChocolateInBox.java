package com.gametheory;

import java.util.Scanner;

public class ChocolateInBox {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		int xor = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
			xor = xor ^ arr[i];
		}

		int count = 0;
		if (xor == 0)
			System.out.println(count);
		else {
			for (int next : arr) {
				xor = xor ^ next;
				if (next >= xor)
					count++;
				xor = xor ^ next;
			}
			System.out.println(count);
		}
	}
}
