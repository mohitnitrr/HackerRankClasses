package com.practo;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String size = in.next();
		String str = in.next();
		String delims = "[,]";
		int[] sizeInt = new int[2];
		int i = 0;
		for (String s : size.split(delims)) {
			sizeInt[i] = Integer.parseInt(s);
			i++;
		}
		System.out.println(getMax(sizeInt, str.split(delims)));
	}

	private static int getMax(int[] size, String[] arrString) {
		int[][] arr = new int[size[1]][size[0]];
		int[][] sumArr = new int[size[1]][size[0]];
		String delims = "[#]";
		int row = 0;
		int col = 0;
		for (String s : arrString) {
			col = 0;
			for (String next : s.split(delims)) {
				if (next.equals("o"))
					arr[row][col] = 1;
				else
					arr[row][col] = 0;

				col++;
			}
			if(col!=size[0])
				return -1;
			row++;
		}

		if(row!=size[1])
			return -1;
		
		int max = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || j == 0) {
					sumArr[i][j] = arr[i][j];
					if (sumArr[i][j] > max)
						max = sumArr[i][j];
				} else {
					if (arr[i][j] == 1) {
						int min = getMin(sumArr[i - 1][j - 1], sumArr[i - 1][j],
								sumArr[i][j - 1]);
						sumArr[i][j] = min + 1;
						if (sumArr[i][j] > max)
							max = sumArr[i][j];
					}
				}
			}
		}

		return max;
	}

	private static int getMin(int i, int j, int k) {
		if (i < j)
			if (i < k)
				return i;
			else
				return k;
		else if (j < k)
			return j;
		else
			return k;

	}
}
