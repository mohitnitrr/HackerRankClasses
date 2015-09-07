package com.test;

public class Long1 {

	public static void main(String[] args) {
		char[] zeros ="0000".toCharArray();
		String zeros1="0000000000000000000000000000000000000000000000000000000000000000";
		System.out.println(Long.toBinaryString(5));
		System.out.println(Long.numberOfLeadingZeros(5));
		//System.out.println(String.copyValueOf(zeros, 0, 3));
		System.out.println(zeros1.substring(0,Long.numberOfLeadingZeros(5)).length());
	}
}
