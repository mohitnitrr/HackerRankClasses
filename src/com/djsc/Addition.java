package com.djsc;

import java.util.Arrays;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		
		while(testcases--!=0){
			String input =in.next();
			
			String[] digits=input.split("\\+");
			
			int [] intergerArray = new int[digits.length];
			int i=0;
			for(String x:digits){
			intergerArray[i]=Integer.parseInt(x);
			i++;
			}
			int size=intergerArray.length;
			
			Arrays.sort(intergerArray);
			
			StringBuilder output = new StringBuilder();
			for(int j=0;j<size;j++){
					output.append(intergerArray[j]);
					output.append("+");				
			}
			int index=output.lastIndexOf("+");
			output.replace(index, index+1, "");
			System.out.println(output.toString());
			System.out.println();
		}
	}
}
