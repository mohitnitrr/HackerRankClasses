package com.ciphersecret;

import java.util.Scanner;

public class ANDAND {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);		
		int testCase = in.nextInt();
		while(testCase--!=0){
			long L = in.nextLong();
			long R = in.nextLong();
			long result=0;
			for(int i =0 ;i<32 ;i++){
				long temp =1<<i;
				if((L&temp)>0 && (R&temp)>0 && temp > (R-L)){
						result = result | temp;
				}
			}
			System.out.println(result);
		}
	}

}
