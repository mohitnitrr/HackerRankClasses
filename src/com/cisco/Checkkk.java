package com.cisco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checkkk {

	public static void main(String[] args) {
		List<Integer>arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		
		Map<List<Integer>,Integer> map = new HashMap<List<Integer>, Integer>();
		List<Integer>arr1 = new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		map.put(arr, 1);

		if(map.containsKey(arr1))
			System.out.println("YES");
	}
}
