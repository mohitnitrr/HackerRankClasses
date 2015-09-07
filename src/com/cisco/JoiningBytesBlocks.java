package com.cisco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JoiningBytesBlocks {

	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in );
		
		while(in.hasNext()){
			int size  = in.nextInt();
			String[] byteArray = new String[size];
			boolean[][] palindromFlag = new boolean[size][size];
			List<String> strList = new ArrayList<>();
			for(int i =0; i<size; i++){
				byteArray[i]= in.next();
				strList.add(byteArray[i]);
			}
			int result = 0;
			
	outer:	for(int j =0 ; j<byteArray.length; j++){
				
				for(int k=j-1;k<j && k>=0;k++){
					
					if(checkPalindrom(byteArray[j].concat(byteArray[k]))){
						strList.remove(byteArray[k]);
						strList.remove(byteArray[j]);
						System.out.println(byteArray[j] +" "+ byteArray[k]);
						j=j-2;
						byteArray = strList.toArray(new String[strList.size()]);
						result++;
						if(strList.size()<=1)
							break outer;
						
						continue outer;
					}
					
				}
				
				for(int k=j+1;k<byteArray.length;k++){
					if(checkPalindrom((byteArray[j]).concat(byteArray[k]))&&!checkFuther(byteArray,k)){
						strList.remove(byteArray[k]);
						strList.remove(byteArray[j]);
						System.out.println(byteArray[j] +" "+byteArray[k]);
						j--;
						result++;
						byteArray = strList.toArray(new String[strList.size()]);
						if(strList.size()<=1)
							break outer;
						
						
						continue outer;
					}
				
			}
			
		}
			if(strList.size()>0)
				result+=strList.size();
			System.out.println(result);
	}	
			
	}

	private static boolean checkFuther(String[] byteArray, int k) {
		for(int i=k+1;i<byteArray.length;i++){
			if(checkPalindrom(byteArray[k].concat(byteArray[i])))
			 return true;
		}
		return false ;
	}

	private static boolean checkPalindrom(String concat) {
		int start =0;
		int end =concat.length()-1;
		
		while(start<end){
			if(concat.charAt(start++)!=concat.charAt(end--)){
				return false;
			}
		}
		
		return true;
	}
}
