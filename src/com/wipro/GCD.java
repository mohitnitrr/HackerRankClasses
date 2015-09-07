package com.wipro;

public class GCD {
	public static void main(String[] args) {
		int x =10;
		int y=20;
		int ans=GCD(x,y);
		System.out.println(ans);

	}

	private static int GCD(int a, int b) {
		if(b == 0){
            return a;
        }
        return GCD(b, a%b);
		
	}
}
