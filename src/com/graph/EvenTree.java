package com.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class EvenTree {

	private static int forest = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vertices = in.nextInt();
		int edges = in.nextInt();
		Map<Integer, HashSet<Integer>> graph = new HashMap<Integer, HashSet<Integer>>(
				vertices);

		for (int i = 0; i < edges; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			if (graph.containsKey(u))
				graph.get(u).add(v);
			else {
				HashSet<Integer> temp = new HashSet<Integer>();
				temp.add(v);
				graph.put(u, temp);
			}
			if (graph.containsKey(v))
				graph.get(v).add(u);
			else {
				HashSet<Integer> temp = new HashSet<Integer>();
				temp.add(u);
				graph.put(v, temp);
			}
		}
		boolean[] visited = new boolean[vertices + 1];
		for (Integer next : graph.keySet()) {
			int countChild = 0;
			if (!visited[next]) {
				//visited[next] = true;
				countChild = countChild(next, graph, visited);
				if (countChild > 0 && countChild % 2 == 0)
					forest++;
			}

		}
		System.out.println(forest-1);

	}

	private static int countChild(Integer next,
			Map<Integer, HashSet<Integer>> graph, boolean[] visited) {
		if (visited[next])
			return 0;
		visited[next] = true;
		int countChild = 1;
		for (Integer child : graph.get(next)) {
			if (!visited[child]) {
				//visited[child] = true;
				countChild += countChild(child, graph, visited);

			}
		}
		if (countChild > 0 && countChild % 2 == 0) {
			forest++;
			return 0;
		} else {
			return countChild;
		}

	}
}
