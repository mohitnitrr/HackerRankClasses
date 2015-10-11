package com.search;

import java.util.Scanner;

public class ConnectedCellInAGrid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		int[][] matrix = new int[row][col];
		boolean[][] visited = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = in.nextInt();
			}
		}

		int count = dfs(matrix, visited, row, col);
		System.out.println(count);
	}

	private static int dfs(int[][] matrix, boolean[][] visited, int row, int col) {
		int max = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (!visited[i][j] && matrix[i][j] == 1) {
					int currMax = doDfs(matrix, visited, i, j, row, col);
					if (max < currMax)
						max = currMax;
				}

			}
		}
		return max;
	}

	private static int doDfs(int[][] matrix, boolean[][] visited, int i, int j,
			int row, int col) {

		if (i < 0 || j < 0 || j >= col || i >= row || visited[i][j]
				|| matrix[i][j] == 0)
			return 0;
		else {
			visited[i][j] = true;

			return 1 + doDfs(matrix, visited, i + 1, j, row, col)
					+ doDfs(matrix, visited, i - 1, j, row, col)
					+ doDfs(matrix, visited, i, j + 1, row, col)
					+ doDfs(matrix, visited, i, j - 1, row, col)
					+ doDfs(matrix, visited, i + 1, j + 1, row, col)
					+ doDfs(matrix, visited, i - 1, j - 1, row, col)
					+ doDfs(matrix, visited, i + 1, j - 1, row, col)
					+ doDfs(matrix, visited, i - 1, j + 1, row, col);
		}

	}

}
