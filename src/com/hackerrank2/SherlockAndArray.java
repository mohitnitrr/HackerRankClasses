package com.hackerrank2;

import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int size=in.nextInt();
			int[] array=new int[size];
			for(int i=0;i<size;i++){
				array[i]=in.nextInt();
			}
			
			
			long sumLeft=array[0];
		
			long sumRight=0;
			for(int i=2;i<size;i++){
				sumRight+=array[i];
			}	
			if(size==1){
				System.out.println("YES");
				continue;
			}
			
			for(int i=1;i<size-1;i++){
				if(sumLeft==sumRight){
					System.out.println("YES");
					break;
				}
				else if(sumLeft<sumRight){
					sumLeft+=array[i];
					sumRight-=array[i+1];
				}
				
			}
			if(sumLeft!=sumRight)
				System.out.println("NO");
		}
	
	}
}
