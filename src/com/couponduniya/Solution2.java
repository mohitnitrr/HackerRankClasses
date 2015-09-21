package com.couponduniya;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int[] range ={2,1,1,1,1,1};
        int re = find_minimum_direct_trains(4, 1, range);
        System.out.println(re);
    }
    static int find_minimum_direct_trains(int startCity, int endCity, int[] range) {
    	int length =range.length;
    	boolean[] visited = new boolean[length];
    	Queue<Integer> bfs = new LinkedList<Integer>();
    	bfs.add(startCity);
    	bfs.add(null);
    	visited[startCity]=true;
    	int hop=0;
    	while(!bfs.isEmpty()){
    		while(bfs.peek()!=null){
    			int next=bfs.poll();
    			if(next==endCity)
    				return hop;
    			else{
    				int direct =range[next];
    				
    				//forward direction
    				for(int i=1;i<=direct;i++){
    					if(!visited[(next+i)%length]){
    						visited[(next+i)%length]=true;
    					bfs.add((next+i)%length);
    					
    					}
    				}
    				//backward direction
    				for(int i=1;i<=direct;i++){
    					if(next-i>=0 && !visited[next-i]){
    						bfs.add(next-i);
    						visited[next-i]=true;
    						}
    					else if(next-i <0 && !visited[length+next-i]){
    						bfs.add(length+next-i);
    						visited[length+next-i]=true;
    						
    					}
    				}
    			}
    		}
    		
    		hop++;
    		bfs.poll();
    		if(!bfs.isEmpty());
    			bfs.add(null);
    	}
    	
    	return hop;
    }

}
