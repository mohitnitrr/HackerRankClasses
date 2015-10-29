package com.practo;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size1 = in.nextInt();
		String str1 = in.next();
		String str2 = in.next();
		String delims = "[,]";
		
		System.out.println(operations_seq(size1, str1.split(delims), str2.split(delims)));
	}
	
	

    public static String operations_seq(int size, String[] str1, String[] str2)
    {
    	String delims = "[#]";
    	int[][] arr1 = new int[size][size];
    	int row =0;
    	int col=0;
    	for(String s : str1){
    		col=0;
    		for(String next : s.split(delims)){
    			arr1[row][col]=Integer.parseInt(next);
    			col++;
    		}
    		if(col!=size){
        		return "invalid";
        	}
    		row++;
    	}
    	if(row!=size || col!=size){
    		return "invalid";
    	}
    	
     	int[][] arr2 = new int[size][size];
    	row =0;
    	col=0;
    	for(String s : str2){
    		col =0;
    		for(String next : s.split(delims)){
    			arr2[row][col]=Integer.parseInt(next);
    			col++;
    		}
    		if(col!=size){
        		return "invalid";
        	}
    		row++;
    	}
    	if(row!=size || col!=size){
    		return "invalid";
    	}
    	
    	boolean[] colV = new boolean[size];  
    	outer :for(int i=0;i<size;i++){
    		for(int j=0;j<size;j++){
    			if(arr1[0][i]==arr2[0][j] && !colV[j]){
    				colV[j]=true;
    				continue outer;
    			}
    		}
    		for(int j=0;j<size;j++){
    			if(!colV[j] && arr2[size-1][j]==arr1[0][i]){
    				int temp=arr2[size-1][j];
    				for(int k=size-1;k>0;k--){
    					arr2[k][j]=arr2[k-1][j];
    				}
    				arr2[0][j]=temp;
    			}
    		}
    		break;
    	}
    	int i=0;
    	StringBuilder s = new StringBuilder();
    	StringBuilder s1 = new StringBuilder();
    	for(int m=0;i<size;m++){
    		for(int n =0;n<size;n++){
    			s=s.append(arr2[m][n]);
    			s1=s1.append(arr1[m][n]);
    		}
    		
    		
    		if(!s.append(s.toString()).toString().contains(s1.toString()))
    			return "no";
    		
    		s=new StringBuilder();
    		s1=new StringBuilder();
    	}
    	
    	return "yes";
    }
}
