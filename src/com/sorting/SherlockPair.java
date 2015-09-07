package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockPair {


  	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  	long res;
	        int testcase=Integer.parseInt(in.nextLine());;
	        
	        while (testcase--!=0) {
				int _a_size = Integer.parseInt(in.nextLine());
				int[] _a = new int[_a_size];
				int _a_item;
				String next = in.nextLine();
				String[] next_split = next.split(" ");
				for (int _a_i = 0; _a_i < _a_size; _a_i++) {
					_a_item = Integer.parseInt(next_split[_a_i]);
					_a[_a_i] = _a_item;
				}
				res = noOfPair(_a,_a_size);
				System.out.println(res);
			}
	        
	    }

	private static long noOfPair(int[] a,int size) {
		Arrays.sort(a);
		int i,j;
		long count=0;
		for( i=0;i<size;){
			
			long equalno=0;
			for(j=i;j<size;j++)
			{	
				
				if(a[i]==a[j])
					equalno++;
				else
					break;
			}
			
			i=j;
			count= count+equalno*(equalno-1);
			
		}
		
		return count;
	}


}
