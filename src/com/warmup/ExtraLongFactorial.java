package com.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

	public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  BigInteger fac = new BigInteger("1");
	  
	  for(Integer i =2 ;i<=n;i++){
		  fac = fac.multiply(new BigInteger(i.toString()));
	  }
	  
	  System.out.println(fac.toString());
	}
}
