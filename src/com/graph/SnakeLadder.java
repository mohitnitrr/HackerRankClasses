package com.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SnakeLadder {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases-- != 0) {
			int[] ladders = new int[101];
			int[] snakes = new int[101];

			int ladderCount = in.nextInt();
			for (int i = 0; i < ladderCount; i++) {
				int start = in.nextInt();
				int end = in.nextInt();
				ladders[start] = end;
			}

			int snakeCount = in.nextInt();
			for (int i = 0; i < snakeCount; i++) {
				int start = in.nextInt();
				int end = in.nextInt();
				snakes[start] = end;
			}

			if (snakes[100] != 0) {
				System.out.println(-1);
				continue;
			}

			boolean[] visited = new boolean[101];
			// int[] cost = new int[101];
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(1);
			visited[1] = true;
			queue.add(null);
			int count = 0;
			boolean flag = false;
		outer:	while (queue.peek() != null) {
				Integer next = queue.poll();
				count++;
				while (next != null) {
					for (int i = 0; i <= 6; i++) {
						int onOneMove = next + i;
						if (ladders[onOneMove] != 0) {
							onOneMove = ladders[onOneMove];
						}
						if (snakes[onOneMove] != 0) {
							onOneMove = snakes[onOneMove];
						}
						if (onOneMove == 100) {
							flag = true;
							break outer;
						}
						if (!visited[onOneMove]) {
							queue.add(onOneMove);
							visited[onOneMove] = true;
						}
					}
					next = queue.poll();
				}
				queue.add(null);
			}
			if (flag)
				System.out.println(count);
			else
				System.out.println(-1);
		}
	}
}
