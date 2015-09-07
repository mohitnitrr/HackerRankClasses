package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class CutStick {

public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int nostick= in.nextInt();
		int[] stickLengths= new int[nostick];
		for(int i=0;i<nostick;i++){
			stickLengths[i]=in.nextInt();
		}
		Arrays.sort(stickLengths);
		int j=0;
		while(j<stickLengths.length){
			
			int substract=stickLengths[j];
			for(int k=j;k<stickLengths.length;k++){
				stickLengths[k]=stickLengths[k]-substract;
			}
			System.out.println(stickLengths.length-j);
			while(j<stickLengths.length && stickLengths[j]==0)
				j++;
		}
	}
}
