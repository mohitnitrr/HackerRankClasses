package com.djsc;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			int a =in.nextInt();
			int b=in.nextInt();
			int hcf=0;
            int min = Math.min(a,b);
             
            for(int i=1; i <= min; i++)
            {
                if(a%i == 0 && b%i == 0)
                {
                    hcf = i;
                }
            }  
            if(hcf==1){
            	System.out.println(-1);
            	continue;
            }
            else if(a==b){
            	System.out.println(0);
            	continue;
            }
            else{
            a=a/hcf;
            b=b/hcf;
            int count=0;
            count+=makeOne(a);
            count+=makeOne(b);
            }
            		
			
	}
	
}

	private static int makeOne(int a) {
		int count=0;
		  for (int i = 2; i <= a; i++) {
		        while (a % i == 0) {
		          count++;
		          a /= i;
		        }
		  }
		return count;
	}
	
}
