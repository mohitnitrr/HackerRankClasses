package com.techgig;

import java.util.LinkedList;
import java.util.Queue;

public class Maxtriangle {

	public static void main(String[] args) {
		String str = validtrianglesum("9#4");
		System.out.println(str);
	}

	private static String validtrianglesum(String input1)
	{
		String delims = "[#]";
		Queue<Integer>lst = new LinkedList<Integer>();
		for(String str1 : input1.split(delims)){
			try{
			lst.add(Integer.parseInt(str1));
			}
			catch(NumberFormatException e){
				return "Invalid";
			}
		}
		int row =1;
		Long sum = new Long(0);
		int i=0;
	outer:while(!lst.isEmpty()){
			int max=-1;

			for(i =1;i<=row;i++){
				if(lst.isEmpty())
					break outer;
				int next = lst.poll();
				if(max<next)
					max=next;
			}
			if(i==row+1){
				sum += max;
				row++;

			}
		}
		if(i<row)
			return "Invalid";
		else
			return sum.toString();

	}
}
