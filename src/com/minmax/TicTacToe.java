package com.minmax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PointWithScore {
	public PointWithScore(Integer position, int score) {
		this.position = position;
		this.score = score;
	}

	int position;
	int score;
}

class Board {
	final int ROW = 3;
	final int COL = 3;
	final int WIN = 10;
	final int LOSS = -10;
	final int DRAW = 0;
	int[][] board = new int[3][3];
	int fillPosition = 0;

	List<PointWithScore> levelPointWithScores;

	final private static int computer = 2;
	final private static int user = 1;

	public boolean isGameOver(int currentPlayer) {
		boolean winningMove = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != currentPlayer) {
					winningMove = false;
					break;
				}
			}
			if (winningMove)
				return winningMove;
			winningMove = true;

		}

		// check for vertical
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[j][i] != currentPlayer) {
					winningMove = false;
					break;
				}
			}
			if (winningMove)
				return winningMove;
			winningMove = true;
		}
		// check for forward diagonal
		for (int i = 0; i < 3; i++) {
			if (board[i][i] != currentPlayer) {
				winningMove = false;
				break;
			}
		}
		if (winningMove)
			return winningMove;

		winningMove = true;

		// check for backward diagonal
		for (int i = 0, j = 2; i < 3; i++, j--) {
			if (board[i][j] != currentPlayer) {
				winningMove = false;
				break;
			}
		}
		if (winningMove)
			return winningMove;

		return false;
	}

	public void bookPlace(int position, int player) {

		if (position <= 3)
			board[0][(position - 1) % 3] = player;
		else if (position <= 6)
			board[1][(position - 1) % 3] = player;
		else
			board[2][(position - 1) % 3] = player;

		fillPosition++;
	}

	public void unBookPlace(int position) {

		if (position <= 3)
			board[0][(position - 1) % 3] = 0;
		else if (position <= 6)
			board[1][(position - 1) % 3] = 0;
		else
			board[2][(position - 1) % 3] = 0;

		fillPosition--;
	}

	public List<Integer> getVacantPlaces() {
		List<Integer> freePositions = new ArrayList<Integer>();

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (board[i][j] == 0) {
					freePositions.add(i * COL + j + 1);
				}
			}
		}
		return freePositions;
	}

	public void showBoard() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private int max(List<Integer> options) {
		int max = Integer.MIN_VALUE;
		for (Integer next : options) {
			if (next > max) {
				max = next;
			}
		}
		return max;
	}

	private int min(List<Integer> options) {
		int min = Integer.MAX_VALUE;
		for (Integer next : options) {
			if (next < min) {
				min = next;
			}
		}
		return min;
	}

	public int minMax(int player, int height) {

		if (isGameOver(computer)) {
			return WIN;
		} else if (isGameOver(user)) {
			return LOSS;
		}
		List<Integer> options = getVacantPlaces();
		if (options.size() == 0)
			return 0;

		List<Integer> scores = new ArrayList<Integer>();
		for (Integer position : options) {
			bookPlace(position, player);
			//showBoard();
			int score;
			if (player == computer) {
				score = minMax(user, height + 1);
			} else {
				score = minMax(computer, height + 1);
			}
			scores.add(score);
			if (height == 0)
				levelPointWithScores.add(new PointWithScore(position, score));

			unBookPlace(position);
			//showBoard();
		}

		return player == computer ? max(scores) : min(scores);
	}

	public void callMinMax() {
		levelPointWithScores = new ArrayList<PointWithScore>();

	}

	public boolean isDraw() {
		if (fillPosition == 9) {
			return true;
		}
		return false;
	}
}

public class TicTacToe {

	final private static int COMPUTER = 2;
	final private static int USER = 1;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Board newGame = new Board();
		newGame.showBoard();
		while (!newGame.isGameOver(COMPUTER) && !newGame.isGameOver(USER)
				&& !newGame.isDraw()) {
			int position = in.nextInt();
			newGame.bookPlace(position, USER);
			if (newGame.isGameOver(USER))
				break;
			
			
			newGame.showBoard();
			newGame.callMinMax();
			newGame.minMax(COMPUTER, 0);
			int min = Integer.MAX_VALUE;
			int pos = -1;
			for (PointWithScore p : newGame.levelPointWithScores) {
				System.out.println(p.position + " " + p.score);
				if (min > p.score) {
					min = p.score;
					pos = p.position;

				}

			}
			newGame.bookPlace(pos, COMPUTER);
			newGame.showBoard();

		}
		if (newGame.isGameOver(USER)) {
			System.out.println("Congratulation you won the Game");

		} else if (newGame.isGameOver(COMPUTER)) {
			System.out.println("Congratulation you won the Game");

		} else if (newGame.isDraw()) {
			System.out.println("This game is drawn between You and System");

		}

	}

}
