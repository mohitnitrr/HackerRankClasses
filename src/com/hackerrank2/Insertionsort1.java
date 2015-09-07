package com.hackerrank2;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class Insertionsort1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }

	private static void insertIntoSorted(int[] ar) {
		
		for(int i=1;i<ar.length;i++){
			int temp=ar[i];
			int j=i-1;
			boolean flag=false;
			while(j>=0&&temp<ar[j]){
				flag=true;
				ar[j+1]=ar[j];
				j--;
				for(int k=0;k<ar.length;k++){
					System.out.print(ar[k]+" ");
				}
				System.out.println();
			}
			if(flag){
			ar[j+1]=temp;
			for(int k=0;k<ar.length;k++){
				System.out.print(ar[k]+" ");
			}
			System.out.println();
			}
		}
		
	}
}
