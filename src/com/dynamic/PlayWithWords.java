package com.dynamic;

import java.util.Scanner;

public class PlayWithWords {

	private static  int [][] L ; 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		str.charAt(0);
		int length = str.length();
		int max = 0;
		lps(str);
		for(int i =0;i<str.length()-1;i++){
			int first = L[0][i];
			int second =L[i+1][length-1];
			int temp = first*second;
			if(temp>max)
				max=temp;
		}
		System.out.println(max);
	}
		
	private static int lps(String str)
	{
	   int n = str.length();
	   int i, j, cl;
	   L = new int[n][n]; 
	   for (i = 0; i < n; i++)
	      L[i][i] = 1;
	 
	    for (cl=2; cl<=n; cl++)
	    {
	        for (i=0; i<n-cl+1; i++)
	        {
	            j = i+cl-1;
	            if (str.charAt(i) == str.charAt(j) && cl == 2)
	               L[i][j] = 2;
	            else if (str.charAt(i) == str.charAt(j))
	               L[i][j] = L[i+1][j-1] + 2;
	            else
	               L[i][j] = Math.max(L[i][j-1], L[i+1][j]);
	        }
	    }
	 
	    return L[0][n-1];
	}
}
