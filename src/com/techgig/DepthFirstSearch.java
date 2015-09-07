package com.techgig;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Graph{
	private Map<Integer, List<Integer>> adjancyList = new HashMap<Integer, List<Integer>>();
	private int result =0;
	private int stackTrack =0;
	private boolean[] visited = new boolean[1001];
	
	 void addEdge(int src , int des){
		if(adjancyList.containsKey(src)){
			adjancyList.get(src).add(des);
		}else{
			List<Integer> list = new LinkedList<Integer>();
			list .add(des);
			adjancyList.put(src, list);
		}
	}
	int maxCity(){
		for(Map.Entry<Integer, List<Integer>> next : adjancyList.entrySet()){
			DFSUtil(next.getKey(),0);
			if(result < stackTrack)
				result = stackTrack;
			stackTrack=0;
			visited = new boolean[1001];
		}
		return result;
	}
	private void DFSUtil(int key,int count) {
		++count;
		if (adjancyList.containsKey(key)) {
			if (!visited[key]) {
				visited[key] = true;
				for (int next : adjancyList.get(key)) {
					if (!visited[next]) {
						DFSUtil(next, count);
					} else {
						if (stackTrack < count)
							stackTrack = count;
					}
				}
			}
		}else {
			if(stackTrack < count )
				stackTrack = count ;
		}
	}
}
public class DepthFirstSearch {

	public static void main(String[] args) {
		String[] args1={"1#2","2#3","1#11","3#11","4#11","5#6","5#7","6#7","4#12","8#12","9#12","8#10","9#10","8#9"};
		System.out.println( maxno_city(args1));
	}

	private static int maxno_city(String[] input1) {
		Graph graph = new Graph();
		String delims = "[#]";
		for(String str : input1){
			int i=0;
			int src=-1;
			int des=-1;
			for(String next : str.split(delims)){
				if(i==0){
					src=Integer.parseInt(next);
					i++;
				}
				else
					des = Integer.parseInt(next);
			}
			
			graph.addEdge(src, des);
			graph.addEdge(des, src);
	}
		
		return graph.maxCity();
	}
}
