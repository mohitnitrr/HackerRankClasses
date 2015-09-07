package com.hackerrank2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndDivisors {
	private static Map<Integer, Integer> primeFactor=new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int count=0;
			int N =in.nextInt();
			getPrimeFactorMap(N);
			
			if(primeFactor.containsKey(2))
				count=1;
			else{
				System.out.println(0);
				primeFactor.clear();
				continue;
			}
			
			for(int i:primeFactor.keySet()){
				
				if(i==2)
					count=count*primeFactor.get(i);
				else
					count=count*(primeFactor.get(i)+1);
			}
			System.out.println(count);
			primeFactor.clear();
		}
	}

	private static void getPrimeFactorMap(int n) {
		
		for(int i=2;i<=Math.sqrt(n);i++){
			
			if(n%i==0){
				primeFactor.put(i, 1);
				n=n/i;
				while(n%i==0){
					if(primeFactor.containsKey(i)){
						int no=primeFactor.get(i);
						no++;
						primeFactor.put(i, no);
						n=n/i;
					}
				}
			}
		}
		if (n > 2){
			if(primeFactor.containsKey(n)){
				int no=primeFactor.get(n);
				no++;
				primeFactor.put(n, no);
			}
			else
				primeFactor.put(n, 1);
		}

	}
}
