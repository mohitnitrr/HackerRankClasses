package com.implementation;

import java.util.Scanner;

public class TaumBday {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases= in.nextInt();
		
		while (testCases--!=0) {
			long black = in.nextLong();
			long white = in.nextLong();
			long bCost = in.nextLong();
			long wCost = in.nextLong();
			long convert = in.nextLong();
			long total = 0;
			if (bCost < wCost) {
				total = black * bCost;
				if (bCost + convert < wCost)
					total += white * (bCost + convert);
				else
					total += white * wCost;

			} else {
				total = white * wCost;
				if (wCost + convert < bCost)
					total += black * (wCost + convert);
				else
					total += black * bCost;
			}
			System.out.println(total);
		}
	}
}
