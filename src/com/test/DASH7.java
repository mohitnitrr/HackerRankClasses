package com.test;

import java.util.Scanner;

public class DASH7 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int L=in.nextInt();
			int B=in.nextInt();
			long area=L*B;
			int min=L<B?L:B;
			for(int i=min;i>=1;i--){
				if(L%i==0&&B%i==0&&area%(long)(i*i)==0){
					System.out.println(area/(i*i));
					break;
				}
			}
		}
		
	}
}
