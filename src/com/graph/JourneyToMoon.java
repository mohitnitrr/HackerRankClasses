package com.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class JourneyToMoon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vertices = in.nextInt();
		int edges = in.nextInt();
		Map<Integer, HashSet<Integer>> graph = new HashMap<Integer, HashSet<Integer>>();
		for (int i = 0; i < edges; i++) {
			int start = in.nextInt();
			int end = in.nextInt();
			if (graph.containsKey(start))
				graph.get(start).add(end);
			else {
				HashSet<Integer> temp = new HashSet<Integer>();
				temp.add(end);
				graph.put(start, temp);
			}

			if (graph.containsKey(end))
				graph.get(end).add(start);
			else {
				HashSet<Integer> temp = new HashSet<Integer>();
				temp.add(start);
				graph.put(end, temp);
			}
		}

		boolean[] visited = new boolean[vertices + 1];
		int[] countArray = new int[vertices];
		int connectedCompenent = 0;
		for (Integer next : graph.keySet()) {
			if (!visited[next]) {
				countArray[connectedCompenent] = dfs(next, visited, graph);
				connectedCompenent++;

			}
		}
		int visitedVertexCount=0;
		for(int i=0;i<connectedCompenent;i++){
			visitedVertexCount+=countArray[i];
		}
		long singleVertex =vertices-visitedVertexCount;
		long totalPairs =0;
		for(int i=0;i<connectedCompenent;i++){
			for(int j=i+1;j<connectedCompenent;j++){
				totalPairs+=countArray[i]*countArray[j];
			}
		}
		if (singleVertex>0) {
			totalPairs += visitedVertexCount*singleVertex;
			totalPairs += (singleVertex - 1) * (singleVertex ) / 2;
		}
		System.out.println(totalPairs);
	}

	private static int dfs(Integer next, boolean[] visited,
			Map<Integer, HashSet<Integer>> graph) {
		int count = 0;
		if (visited[next])
			return 0;
		else{
			visited[next] = true;
			count++;
			for (int adjacent : graph.get(next)) {
				count += dfs(adjacent, visited, graph);
			}
			return count;
		}
	}
}
