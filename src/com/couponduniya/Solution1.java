package com.couponduniya;

import java.io.IOException;
import java.util.Scanner;

public class Solution1 {

	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int [] a = {-3,-7,7,9,100,1002};
	        int[] b = {-3,-7,100};
	      System.out.println(subway_hacker(a, b));  
	    }


	private static int subway_hacker(int[] _arr1, int[] _arr2) {
		int sum1 =0;
		int sum2=0;
		int sum=0;
		
		int index1=0;
		int index2=0;

		while(index1<_arr1.length && index2 <_arr2.length){
			
			if(_arr1[index1]<_arr2[index2] && index1 <_arr1.length){
				sum1+=_arr1[index1];
				index1++;
			}
			else if(_arr1[index1]>_arr2[index2] && index2 < _arr2.length){
				sum2+=_arr1[index2];
				index2++;
			}
			else{
				if (sum1 >= sum2)
					sum += sum1;
				else
					sum += sum2;

				sum+=_arr1[index1];
				
				sum1 = 0;
				sum2 = 0;
				index1++;
				index2++;
				
			}
				
			
		}
		if(index1==_arr1.length)
			for(int i=index2;i<_arr2.length;i++){
				sum2+=_arr2[i];
			}
		else if(index2==_arr2.length)
			for(int i=index1;i<_arr1.length;i++){
				sum1+=_arr1[i];
			}
		
		if (sum1 >= sum2)
			sum += sum1;
		else
			sum += sum2;
		
		return sum;
	}
}
