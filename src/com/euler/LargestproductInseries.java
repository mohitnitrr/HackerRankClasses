package com.euler;

import java.util.Scanner;

public class LargestproductInseries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		while(testcases--!=0){
			int length = in.nextInt();
			int k = in.nextInt();
			String num = in.next();
			long product =1; 
			long currentProduct=1;
			for(int i=0;i<length;i++){
				if(i<k){
					currentProduct=currentProduct* (num.charAt(i)-'0');
					product =currentProduct;
				}
				else{
					if(num.charAt(i-k)!='0')
						currentProduct=currentProduct/(num.charAt(i-k)-'0') * (num.charAt(i)-'0');
					else{
						currentProduct=1;
						for(int j=i-k+1;j<=i;j++){
							currentProduct =currentProduct*(num.charAt(j)-'0');
						}
					}
						
					if(currentProduct>product)
						product=currentProduct;
				}
			}
			System.out.println(product);
		}
	}
}
