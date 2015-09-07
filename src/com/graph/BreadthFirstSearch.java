package com.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases--!=0) {
			int vertices = in.nextInt();
			int edges = in.nextInt();
			Map<Integer, HashSet<Integer>> graph = new HashMap<Integer, HashSet<Integer>>();
			for (int i = 0; i < edges; i++) {
				int start = in.nextInt();
				int end = in.nextInt();
				if (graph.containsKey(start)) {
					graph.get(start).add(end);
				} else {
					HashSet<Integer> temp = new HashSet<Integer>();
					temp.add(end);
					graph.put(start, temp);
				}

				if (graph.containsKey(end)) {
					graph.get(end).add(start);
				} else {
					HashSet<Integer> temp = new HashSet<Integer>();
					temp.add(start);
					graph.put(end, temp);
				}
			}
			int startVertex = in.nextInt();
			boolean[] visited = new boolean[vertices + 1];
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(startVertex);
			queue.add(null);
			int count = 0;
			int[] cost = new int[vertices + 1];
			while (queue.peek()!=null) {
				Integer next = queue.poll();
				while (next != null) {
					if (!visited[next]) {
						visited[next] = true;
						cost[next] = 6 * count;
						if(graph.get(next)==null)
							break;
						for (int x : graph.get(next))
							if (!visited[x])
								queue.add(x);
					}
					next = queue.poll();
				}
				count++;
				queue.add(null);
			}
			for (int i = 1; i <= vertices; i++) {
				if(i==startVertex)
					continue;
				else if (cost[i] == 0)
					System.out.print(-1);
				else
					System.out.print(cost[i]);

				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
