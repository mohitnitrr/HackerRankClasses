package com.housing;

import java.util.Scanner;

public class SetBit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int total=0;
		boolean[] pos = new boolean[32];
		int position =1;
		while(num>0){
			if((num & 1) >0){
				total++;
				pos[position-1]=true;
			}
				position++;
				num=num>>1;
		}
		System.out.println(total);
		int lowest=0;
		
		for(int i= 0;i<32;i++){
			if(pos[i]){
				lowest = i+1;
				break;
			}
		}
		for(int i= 0;i<32;i++){
			if(pos[i]){
				System.out.println(i-lowest+2);
			}
		}
	}
}
