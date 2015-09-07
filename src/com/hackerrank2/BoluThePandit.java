package com.hackerrank2;

import java.util.Scanner;


public class BoluThePandit {
	
private static final int Mod=1000000007;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int length=in.nextInt();
			int breadth=in.nextInt();
			int height=in.nextInt();
		
			int gcd=gcdFunction(gcdFunction(length,breadth),height);
			System.out.println(gcd+" "+(((length/gcd)%Mod*(breadth/gcd)%Mod)%Mod*(height/gcd)%Mod)%Mod);
			}
	}

	private static int gcdFunction(int length, int breadth) {
		int a,b,r=0;
		
		a=length>breadth?length:breadth;
		b=length>breadth?breadth:length;
		r=b;
		while(a%b!=0){
			r=a%b;
			a=b;
			b=r;
		}
		return r;
	}

}
