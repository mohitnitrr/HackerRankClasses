package com.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AntipalindromicStingImprove {
	
	private static final int MOD =1000000007;
	public static void main(String[] args) {
	
		 BufferedWriter output= null;
			try {
	            File file = new File("output.txt");
	            output = new BufferedWriter(new FileWriter(file));
	            
	        } catch ( IOException e ) {
	            e.printStackTrace();
	        }
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			int palindromLength= in.nextInt();
			int characterSet= in.nextInt();
		
			long result =1;
			int i =0;
			while(palindromLength>0){
				result=result * characterSet ;
				result = result % MOD ;
				if(i==0 ){
					characterSet--;
					palindromLength--;
					i++;
				}
				else if(i == 1){
					characterSet--;
					palindromLength--;
					break;
				}
			}
			
			if(palindromLength>0)
				result= (result * modularPow(characterSet,palindromLength) ) % MOD ;
			
			System.out.println(result);
			try {
				
				output.append(Long.toString(result));
				output.write("\n");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static long modularPow(long base, int palindromLength) {
		long result =1;
		while(palindromLength>0){
			if(palindromLength % 2 !=0){
				result= (result * base) % MOD;
			}
			
			base= (base * base) % MOD;
			palindromLength=palindromLength>> 1;
		}
		return result;
	}

}
