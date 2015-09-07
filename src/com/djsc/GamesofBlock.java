package com.djsc;

import java.util.Scanner;

public class GamesofBlock {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int coloumn = in.nextInt();
		int row = in.nextInt();
		
		while (row!=0&&coloumn!=0) {

			char[][] board = new char[row][coloumn];
			int trinityRow = -1;
			int trinityColoum = -1;
			for (int i = 0; i < row; i++) {
				String nextRow = in.next();
				int j = 0;
				for (char c : nextRow.toCharArray()) {
					board[i][j] = c;
					if (c == '@') {
						trinityRow = i;
						trinityColoum = j;
					}
					j++;
				}
			}
			int count = 0;
			int upperRowSearch = trinityRow;
			int lowerRowSearch = trinityRow;
			int leftColoumSearch = trinityColoum;
			int rightColoumSearch = trinityColoum + 1;
			while (leftColoumSearch >= 0) {
				lowerRowSearch = trinityRow;
				if (board[leftColoumSearch][lowerRowSearch] == '.'
						|| board[leftColoumSearch][lowerRowSearch] == '@') {
					count++;
					lowerRowSearch--;
					while (lowerRowSearch >= 0) {
						if (board[lowerRowSearch][leftColoumSearch] == '.') {
							count++;
							lowerRowSearch--;
						} else
							break;
					}
				} else {
					break;
				}

				leftColoumSearch--;
			}
			upperRowSearch = trinityRow;
			rightColoumSearch=trinityColoum+1;
			while (rightColoumSearch < coloumn) {
				lowerRowSearch = trinityRow;
				if (board[lowerRowSearch][rightColoumSearch] == '.') {
					count++;
					lowerRowSearch--;
					while (lowerRowSearch >= 0) {
						if (board[lowerRowSearch][rightColoumSearch] == '.') {
							count++;
							lowerRowSearch--;
						} else
							break;
					}
				} else
					break;

				rightColoumSearch++;
			}
			upperRowSearch = trinityRow + 1;
			leftColoumSearch = trinityColoum;
			rightColoumSearch = trinityColoum + 1;
			while (leftColoumSearch >= 0) {
				upperRowSearch = trinityRow + 1;
				while (upperRowSearch < row) {
					if (board[upperRowSearch][leftColoumSearch] == '.') {
						count++;
						upperRowSearch++;
					} else
						break;
				}
				leftColoumSearch--;
			}
			upperRowSearch = trinityRow + 1;
			while (rightColoumSearch < coloumn) {
				upperRowSearch = trinityRow + 1;
				while (upperRowSearch < row) {
					if (board[upperRowSearch][rightColoumSearch] == '.') {
						count++;
						upperRowSearch++;
					} else
						break;
				}

				rightColoumSearch++;
			}
			System.out.println(count);
			
			 coloumn = Integer.parseInt(in.next());
			 row = Integer.parseInt(in.next());
			
		}
		
	}

}
