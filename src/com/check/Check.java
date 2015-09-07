package com.check;

import java.util.ArrayList;
import java.util.List;

public class Check {

	public static void main(String[] args) {
		String temp=  new String("hello");
		List<String>  list = new ArrayList<>();
		list.add(temp);
		temp="hiii";
		System.out.println(list);
	}
}
