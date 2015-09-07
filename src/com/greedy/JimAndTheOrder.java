package com.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Bugger implements Comparable<Bugger>{
	int id ;
	int end;

	Bugger(int id, int start,int timeTaken){
		this.id=id;
		this.end=start+timeTaken;
	}

	@Override
	public int compareTo(Bugger b1) {
		return Integer.compare(end, b1.end);
	}
}
public class JimAndTheOrder {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		List<Bugger> candidates= new ArrayList<>(size);
		
		for(int i=1;i<=size;i++){
			int start= in.nextInt();
			int timeTaken =in.nextInt();
			candidates.add(new Bugger(i, start, timeTaken));
		}
		
		Collections.sort(candidates);
		for(Bugger b : candidates){
			System.out.print(b.id + " ");
		}
	}

}
