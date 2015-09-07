package com.cisco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JoiningBytesImproves {

	private static Map<List<Integer>,Integer> map = new HashMap<List<Integer>, Integer>();
	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in );

		while(in.hasNext()){
			int size  = in.nextInt();
			String[] byteArray = new String[size];
			boolean[][] palindromFlag = new boolean[size][size];
			for(int i =0; i<size; i++){
				byteArray[i]= in.next();
			}

			for(int j =0 ; j<byteArray.length; j++){

				for(int k=j-1;k<j && k>=0;k++){
					if(checkPalindrom(byteArray[j].concat(byteArray[k])))
						palindromFlag[k][j]=true;
				}
				for(int k=j+1;k<byteArray.length;k++){
					if(checkPalindrom((byteArray[j]).concat(byteArray[k])))
						palindromFlag[j][k] = true;
				}

			}
			List<Integer> remainingItem = new ArrayList<>();
			for(int m =0;m<size;m++){
				remainingItem.add(m);
			}
			int result = minimumTransaction(palindromFlag,remainingItem,size);
			map.clear();
			System.out.println(result);
		}	

	}

	private static int minimumTransaction(boolean[][] palindromFlag, List<Integer> remainingItem, int size) {
		
		List<Integer> copy = new ArrayList<Integer>(remainingItem);
		if(remainingItem.size()==0)
			return 0;
		else if(remainingItem.size()==1)
			return 1;
		else if(map.containsKey(remainingItem))
			return map.get(remainingItem);
		
		int result =0;
		 int next = remainingItem.get(0);
			List<Integer> indexMinimum= new ArrayList<>();
			for(int iterator = next+1 ; iterator<size; iterator++){
				if(palindromFlag[next][iterator]==true && remainingItem.contains(iterator)){
					List<Integer> clone = makeClone(remainingItem,next,iterator);
					indexMinimum.add(minimumTransaction(palindromFlag, clone, size));
				}
			}
			if(indexMinimum.size()==0){
				remainingItem.remove(0);
				return 1 + minimumTransaction(palindromFlag, remainingItem, size);
			}else{
				result =1 + min(indexMinimum);
				
			}
		map.put(copy, result);
		return result;
	}

	private static int min(List<Integer> indexMinimum) {
		int min =indexMinimum.get(0);
		for(int next : indexMinimum){
			if(next < min)
				min = next;
		}
		return min;
	}

	private static List<Integer> makeClone(List<Integer> items,
			int i, int j) {
		List<Integer> remainingItem = new ArrayList<>();
		for( int next : items){
			if(next==i||next==j){
				
			}
			else{
				remainingItem.add(next);
			}
		}
		return remainingItem;
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
