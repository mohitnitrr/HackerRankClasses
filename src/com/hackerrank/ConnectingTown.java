package com.hackerrank;

import java.util.Scanner;

public class ConnectingTown {
	
	private static final int mod=1234567;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcase= in.nextInt();
		
		while(testcase--!=0){
			int town=in.nextInt();
			int[] routeBetweenTown=new int[town-1];
			int totalRoute =1;
			for(int i=0;i<town-1;i++){
				routeBetweenTown[i]=in.nextInt();
			}
			for(int i=0;i<town-1;i++){
				totalRoute=(totalRoute*routeBetweenTown[i])%mod;
			}
			System.out.println(totalRoute);
			}
		
		}

}
