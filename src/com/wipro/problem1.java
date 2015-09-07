package com.wipro;

public class problem1 {

	public static void main(String[] args) {
		int m =10;
		int x=3;
		prime(m,x);
	}

	private static void prime(int m, int x) {
		for(int i=m;;i++){
			if(isprime(i)){
				int length=(int)Math.floor(Math.log10(i) + 1);
				if(length>x)
					break;
				else if(length==x) 
					System.out.println(i);
			}
		}
		
	}

	private static boolean isprime(int number) {
		 for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	
}
