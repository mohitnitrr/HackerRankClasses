package com.search;

import java.util.Scanner;

public class CountLuck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		int a = -1, b = -1;

		while (testCases-- != 0) {
			int row = in.nextInt();
			int col = in.nextInt();
			String[] matrix = new String[row];
			boolean[][] visited = new boolean[row][col];
			for (int i = 0; i < row; i++) {
				matrix[i] = in.next();
			}

			int k = in.nextInt();

			outer: for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (matrix[i].charAt(j) == 'M') {
						a = i;
						b = j;
						break outer;
					}
				}
			}

			int count = getCount(matrix, visited, a, b, row, col);
			System.out.println(count);
			if (count == k)
				System.out.println("Impressed");
			else
				System.out.println("Oops!");

		}
	}

	private static int getCount(String[] matrix, boolean[][] visited, int i,
			int j, int row, int col) {

		if (i < 0 || j < 0 || j >= col || i >= row
				|| matrix[i].charAt(j) == 'X' || visited[i][j])
			return -1;
		else if (matrix[i].charAt(j) == '*')
			return 0;
		else {
			int count = 0;
			boolean flag = false;
			int temp = 0;

			visited[i][j] = true;

			if (j + 1 < col && !visited[i][j + 1]
					&& matrix[i].charAt(j + 1) == '.')
				flag = true;
			
			if (j - 1 > 0 && !visited[i][j - 1]
					&& matrix[i].charAt(j - 1) == '.') {
				if (!flag)
					flag = true;
				else if (flag == true && count == 0) {
					count++;
				}
			}
			if (i - 1 > 0 && !visited[i - 1][j]
					&& matrix[i - 1].charAt(j) == '.') {
				if (!flag)
					flag = true;
				else if (flag == true && count == 0)
					count++;
			}
			if (i + 1 < row && !visited[i + 1][j]
					&& matrix[i + 1].charAt(j) == '.') {
				if (!flag)
					flag = true;
				else if (flag == true && count == 0)
					count++;
			}

			if ((temp = getCount(matrix, visited, i, j + 1, row, col)) >= 0) {
				return count + temp;

			}

			if ((temp = getCount(matrix, visited, i, j - 1, row, col)) >= 0) {
				return count + temp;
			}

			if ((temp = getCount(matrix, visited, i + 1, j, row, col)) >= 0) {
				return count + temp;

			}

			if ((temp = getCount(matrix, visited, i - 1, j, row, col)) >= 0) {
				return count + temp;

			}

		}

		return -1;
	}

}
