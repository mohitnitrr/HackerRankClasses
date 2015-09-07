package com.techgig;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Machine1And2 {

	public static void main(String[] args) {
		String args1="1,5,9,2,3,5,6";
		System.out.println(sequences(args1));
		
	}

	private static String sequences(String input1) {
		String delims = "[,]";
		List<Integer> numberList = new LinkedList<Integer>();
		for(String str : input1.split(delims)){
			numberList.add(Integer.parseInt(str));		
		}
		return machineTwo(numberList);
	}

	private static String machineTwo(List<Integer> numberList) {
		while(numberList.size() >1){
			numberList=machineOne(numberList);
		}	
		return numberList.get(0).toString();	
	}

	private static List<Integer> machineOne(List<Integer> numberList) {
		List<Integer> temp  = new LinkedList<>() ;
		if(numberList.size()==1)
			return numberList;
		else{
			int first = numberList.get(0);
			int second;
			ListIterator<Integer>  iterator = numberList.listIterator(1);
			while(iterator.hasNext()){
				second = iterator.next();
				temp.add(second-first);
				first = second;
			}
		}
		return temp;
	}
}
