package com.hackerrank2;

import java.util.Scanner;

public class HotelSoft {
private static final int Mod=1000000007;
	
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);	
	int object=in.nextInt();
	int group=in.nextInt();
	if(object<group||object<1||group<1){
		System.out.println(-1);
		return ;
	}
		
	int ways=(combination(object-1,group-1))%Mod;
	System.out.println(ways);
	
	}


	private static int combination(int object, int grp) {
		int numerator =1;
		int denominator=1;
		int diff =object-grp;
		int ncount =0;
		int dcount=0;
		if(diff>grp){
			ncount=grp;
			dcount=grp;
			}
		else{
			ncount=diff;
			dcount=diff;
		}
		for(int i=1;i<=ncount;i++){
			numerator=(numerator*object)%Mod;
			object--;
	}
		for(int i=1;i<=dcount;i++){
			denominator=(denominator*i)%Mod;
	}
	return numerator/denominator;
	}

}
