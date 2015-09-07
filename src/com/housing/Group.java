package com.housing;

import java.util.Scanner;

public class Group {

	private static final int  MOD= 1000000007;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = Integer.parseInt(in.next());
		int col = Integer.parseInt(in.next());
		String[] gridValue= new String[row];
		for(int i=0;i<row;i++){
			gridValue[i]=in.next();
		}
		
		int noOfFields = countFields(gridValue, row, col);
		long result = findCombination(noOfFields);
		System.out.println(result);
	}

	private static long findCombination(int noOfFields) {
		long count;
		if(noOfFields % 2 ==0){
			count = pow(2,noOfFields);
		}
		else{
			count = pow (2,noOfFields-1);
		}
		return count ;
	}

	private static long pow(int base, int exponent) {
		long result=1;
		while (exponent > 0){
        if (exponent % 2 == 1)
           result = (result * base) % MOD;
        exponent = exponent >> 1;
        base = (base * base)% MOD;
		}
        return result;
		
	}

	private static int countFields(String[] gridValue, int row, int col) {
		int [][] fields = new int [row+1][col+1];
		int count =0;
		for(int i =1;i<=row;i++){
			String s= gridValue[i-1];
			for(int j =1; j<=col;j++){
				if(s.charAt(j-1)=='Y'){
					if(fields[i-1][j]>0 && fields[i][j-1]>0 && fields[i-1][j]!=fields[i][j-1]){
						count--;
						fields[i][j]=count;
					}
					else if(fields[i-1][j]>0){
						fields[i][j]=fields[i-1][j];
					} 
					else if(fields[i][j-1]>0){
						fields[i][j]=fields[i][j-1];
					}
					else{
						fields[i][j]=count;
						count++;
					}
				}
			}
		}
		
		return count;
	}
}
