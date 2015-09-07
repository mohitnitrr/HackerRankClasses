package com.hackerrank;

import java.util.Scanner;

public class CheifHopper {
	
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int length= in.nextInt();
		int [] arr =new int[length];
		for(int i=0;i<length;i++){
			arr[i]=in.nextInt();
		}
		int max= maxArr(arr);
		
		int startEnergy=arr[0]/2;
		for(int i=startEnergy;i<=max;i++){
			int minEnergy=i;
			int j=0;
			for(j=0;j<length;j++){
				if(arr[j]>minEnergy)
					minEnergy=minEnergy-(arr[j]-minEnergy);
				else
					minEnergy=minEnergy+(minEnergy-arr[j]);
				if(minEnergy<0)
					break;
				else if(minEnergy>=max){
					System.out.println(i);
					return;
					}
			}
			if(j==length&&minEnergy>=0){
			System.out.println(i);
			break;
			}
		}
	}

	private static int maxArr(int[] arr) {
	
		int	max=arr[0];
		for(int j=1;j<arr.length;j++){
			if(max<arr[j])
				max=arr[j];
		}
		return max;
		
	}


}
