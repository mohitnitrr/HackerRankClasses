package com.graph;

import java.util.Scanner;

public class PrimsSpecialSubtree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int vertices = in.nextInt();
		int edges = in.nextInt();
		int[][] graph = new int[vertices + 1][vertices + 1];
		for(int i =0;i<=vertices;i++){
			for(int j=0;j<=vertices;j++){
				graph[i][j]=-1;
			}
		}
		for (int i = 0; i < edges; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			int w = in.nextInt();
			if (graph[u][v] == -1 || graph[u][v] > w) {
				graph[u][v] = w;
				graph[v][u] = w;
			}
		}

		int[] cost = new int[vertices + 1];
		boolean[] visited = new boolean[vertices + 1];

		for (int i = 1; i <= vertices; i++)
			cost[i] = Integer.MAX_VALUE;

		int src = in.nextInt();

		cost[src] = 0;

		for (int i = 0; i < vertices - 1; i++) {

			int u = getMinimumEdge(cost, visited, vertices);
			if (u == -1)
				break;

			visited[u] = true;

			for (int j = 1; j <= vertices; j++) {
				if (!visited[j] && graph[u][j] > -1
						&& (cost[j] > graph[u][j]))
					cost[j] = graph[u][j];
			}

		}
		long result = 0;
		for (int i = 1; i <= vertices; i++) {
			if(cost[i]!=Integer.MAX_VALUE)
			result += cost[i];
		}

		System.out.println(result);

	}

	private static int getMinimumEdge(int[] cost, boolean[] visited,
			int vertices) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 1; i <= vertices; i++) {
			if (!visited[i] && min > cost[i]) {
				index = i;
				min = cost[i];
			}

		}

		return index;
	}
}
