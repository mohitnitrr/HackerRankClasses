package com.dynamic;

import java.math.BigInteger;
import java.util.Scanner;

public class ModifiedFibo {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger first = new BigInteger(in.next());
		BigInteger second= new BigInteger(in.next());
		int  nth = in.nextInt();
		for(int i=3;i<=nth;i++){
			BigInteger temp = first.add(second.multiply(second));
			first =second;
			second =temp;
		}
		System.out.println(second);
	}
}
