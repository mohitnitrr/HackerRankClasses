package com.graph;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Object>{
	int start;
	int end;
	int wt;

	public Edge(int start ,int end, int wt) {
		this.start =start;
		this.end =end;
		this.wt=wt;
	}

	@Override
	public int compareTo(Object o) {
		Edge temp = (Edge)o;
		if(this.wt >temp .wt)
			return 1;
		else if(this.wt < temp .wt)
			return -1;
		else
			return 0;
	}
}

class SubGraph{
	int parent;
	int rank;
	public SubGraph(int parent ,int rank) {
		this.parent = parent;
		this.rank = rank;
	}
}
public class Kruskal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int verteces = in.nextInt();
		int noEdges = in.nextInt();
		Edge[] edges = new Edge[noEdges];
		for(int i=0;i<noEdges;i++){
			int x = in.nextInt();
			int y =in.nextInt();
			int wt = in.nextInt();
			edges[i]=new Edge(x,y,wt);
		}
		Arrays.sort(edges);
		long totalSpaningWt = kruskalSpaning(edges,verteces,noEdges);
		System.out.println(totalSpaningWt);
		
	}

	private static long kruskalSpaning(Edge[] edges, int verteces, int noEdges) {
		long totalWt =0;
		int count =0;
		int edgeTraversal =0;
		SubGraph[] subgraphs = new SubGraph[verteces+1];
		for(int i=1;i<=verteces;i++){
			subgraphs[i] = new SubGraph(i,0);
		}
		while(edgeTraversal<noEdges && count<verteces-1){
			Edge nextEdge = edges[edgeTraversal++];
			int x= nextEdge.start;
			int y=nextEdge.end;
			int wt=nextEdge.wt;
			
			if(!isCycle(x,y,subgraphs)){
				totalWt+=wt;
				count++;
				union(x,y,subgraphs);
			}
		}
		
		return totalWt;
	}

	private static void union(int x, int y, SubGraph[] subgraphs) {
		int p1 = find(x,subgraphs);
		int p2 = find(y,subgraphs);
		
		if(subgraphs[p1].rank<subgraphs[p2].rank)
			subgraphs[p1].parent=p2;
		else if(subgraphs[p1].rank > subgraphs[p2].rank)
			subgraphs[p2].parent=p1;
		else{
			subgraphs[p1].parent=p2;
			subgraphs[p1].rank++;
			subgraphs[p2].rank++;
		}
		
	}

	private static boolean isCycle(int x, int y, SubGraph[] subgraphs) {
		int p1 = find(x,subgraphs);
		int p2 = find(y,subgraphs);
		if(p1==p2)
			return true;
		else
			return false;
	}

	private static int find(int x, SubGraph[] subgraphs) {
			if(subgraphs[x].parent==x)
				return x;
			else
				return find(subgraphs[x].parent,subgraphs);
		
	}
}
