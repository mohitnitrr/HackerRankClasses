package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchNumber {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			long C=in.nextLong();
			long P=in.nextLong();
			long Q=in.nextLong();
			long min;
			int count=0;
			min=minBet(P,Q);
		//	long sqrt=(long)Math.sqrt(C);
		//	min=minBet(min,sqrt);
			Map<Long, Long> factorCount=new HashMap<Long, Long>();
			if(C>=P||C>=Q)
			factorCount.put(1l, 1l);
			primeFactor(C,min,factorCount);
			for(long next:factorCount.keySet()){
				count+=factorCount.get(next);
			}
			System.out.println(count);
			
		}
	}

	private static void primeFactor(long c, long min,
			Map<Long, Long> factorCount) {
		long count=0;
		long check=1;
	    while (c%2 == 0)
	    {
	    	check*=2;
	    	if(check>min)
	    		break;
	    	else{
	    	count++;
	    	c = c/2;
	    	}
	    }
	    if(count>0)
	    factorCount.put(2l, count);
	    for (long i = 3; i <= Math.sqrt(c); i = i+2)
	    {
	    	count=0;
			check=1;
	        while (c%i == 0)
	        {
	        	check*=i;
		    	if(check>min)
		    		break;
		    	else{
		    	count++;
		    	c = c/i;
		    	}
	        }
	        if(count>0)
	        factorCount.put(i, count);
	    }
	    
	    if (c > 2&&c<=min)
	      factorCount.put(c, 1l);
		
	}

	private static long minBet(long p, long q) {
		if(p<q)
			return p;
		else 
			return q;
		
	}

}
