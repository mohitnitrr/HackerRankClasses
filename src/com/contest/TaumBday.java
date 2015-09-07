package com.contest;

import java.math.BigInteger;
import java.util.Scanner;

public class TaumBday {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			Integer b=in.nextInt();
			BigInteger B=new BigInteger(b.toString());
			Integer w =in.nextInt();
			BigInteger W=new BigInteger(w.toString());
			Integer x=in.nextInt();
			BigInteger X=new BigInteger(x.toString());
			Integer y=in.nextInt();
			BigInteger Y=new BigInteger(y.toString());
			Integer z=in.nextInt();
			BigInteger Z=new BigInteger(z.toString());
			BigInteger sum =new BigInteger("0");
			if(x>y)
				if(x>(y+z)){
					sum=sum.add(Y.multiply(W));
					sum=sum.add(B.multiply(Y.add(Z)));
					
				}
				else{
					sum=sum.add(Y.multiply(W));
					sum=sum.add(B.multiply(X));
					
				}
				
			else{
				if(y>(x+z)){
					sum=sum.add(X.multiply(B));
					sum=sum.add(W.multiply(X.add(Z)));
				}
				else{
					sum=sum.add(X.multiply(B));
					sum=sum.add(W.multiply(Y));
				}
			}
			System.out.println(sum);
			}
		}
}
