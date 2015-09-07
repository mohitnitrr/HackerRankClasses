package com.test;

public class Exception {

	public static void main(String[] args) {
	
		try{
		int divide=	100/0;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		System.out.println("hlo");
	}
}
