package com.hackerrank2;

import java.math.BigDecimal;
import java.util.Scanner;

public class CounterGame {

	 public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int testcase=in.nextInt();
			while(testcase--!=0){
				long N=in.nextLong();
				System.out.println(N);
					if(Long.bitCount(N)>1)
						if(Long.toBinaryString(N).length()%2!=0)
						System.out.println("Richard");
						else
						System.out.println("Louise");
					else
						if(Long.toBinaryString(N).length()%2==0)
							System.out.println("Richard");
						else
							System.out.println("Louise");
				
			}
		}
}
