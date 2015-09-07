package com.wipro;

import java.util.LinkedList;
import java.util.List;

public class SemiProblem2 {
	private static int count =0;
	public static void main(String[] args) {
		String[] str ={"M1#W2#W4","M2#W1#W2","M3#W1#W3#W4","M4#W4#W5","M5#W4"};
		System.out.println(calculateCombination(str));
	}

	private static int calculateCombination(String[] str) {
		List<List<Integer>>list  = new LinkedList<List<Integer>>();
		String delims = "[#]";
		for(String next : str){
			String[] pairs=next.split(delims);
			int i =0;
			List<Integer> patners = new java.util.LinkedList<Integer>();
			for(String nextpatner :pairs ){
				if(i==0){
					Integer.parseInt(nextpatner.substring(1));
					i++;
				}
				else {
					patners.add(Integer.parseInt(nextpatner.substring(1)));
				}
			}
			if(patners.isEmpty())
				return -1;
			else
				list.add(patners);
		}
		boolean[]  men = new boolean [list.size()];
		boolean[]  women = new boolean [list.size()];
		calculateThroughRecursion(list,men,women,1);
		if(count==0)
			return -1;
		else
			return count;
	}

	private static void calculateThroughRecursion(
			List<List<Integer>> list, boolean[] men, boolean[] women, int menflag ) {
		
			men[menflag-1]= true;
			List<Integer> patners = list.get(menflag-1);
			for(int j =0;j<patners.size();j++){
				if(menflag== list.size() && !women[patners.get(j)-1])
					 ++count;
				else{
					if(!women[patners.get(j)-1]){
						women[patners.get(j)-1]=true;
						calculateThroughRecursion(list,men,women,menflag+1);
						women[patners.get(j)-1]=false;
					}
					else
						continue;
				}
				
			}	
	}
}
