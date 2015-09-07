package com.contest;

import java.math.BigInteger;
import java.util.Scanner;

public class BirthdayGift {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		int caseno=1;
		while(testcases--!=0){
			BigInteger bgin=in.nextBigInteger();
			BigInteger value=bgin.mod(new BigInteger("26"));
			switch (value.intValue()) {
			case 1:
				System.out.println("Case "+caseno+": "+1+" "+1);
				break;
			case 2:
				System.out.println("Case "+caseno+": "+1+" "+2);
				break;
			case 3:
				System.out.println("Case "+caseno+": "+2+" "+2);
				break;
			case 4:
				System.out.println("Case "+caseno+": "+2+" "+1);
				break;
			case 5:
				System.out.println("Case "+caseno+": "+3+" "+1);
				break;
			case 6:
				System.out.println("Case "+caseno+": "+3+" "+2);
				break;
			case 7:
				System.out.println("Case "+caseno+": "+3+" "+3);
				break;
			case 8:
				System.out.println("Case "+caseno+": "+2+" "+3);
				break;
			case 9:
				System.out.println("Case "+caseno+": "+1+" "+3);
				break;
			case 10:
				System.out.println("Case "+caseno+": "+1+" "+4);
				break;
			case 11:
				System.out.println("Case "+caseno+": "+2+" "+4);
				break;
			case 12:
				System.out.println("Case "+caseno+": "+3+" "+4);
				break;
			case 13:
				System.out.println("Case "+caseno+": "+4+" "+4);
				break;
			case 14:
				System.out.println("Case "+caseno+": "+4+" "+3);
				break;
			case 15:
				System.out.println("Case "+caseno+": "+4+" "+2);
				break;
			case 16:
				System.out.println("Case "+caseno+": "+4+" "+1);
				break;
			case 17:
				System.out.println("Case "+caseno+": "+5+" "+1);
				break;
			case 18:
				System.out.println("Case "+caseno+": "+5+" "+2);
				break;
			case 19:
				System.out.println("Case "+caseno+": "+5+" "+3);
				break;
			case 20:
				System.out.println("Case "+caseno+": "+5+" "+4);
				break;
			case 21:
				System.out.println("Case "+caseno+": "+5+" "+5);
				break;
			case 22:
				System.out.println("Case "+caseno+": "+4+" "+5);
				break;
			case 23:
				System.out.println("Case "+caseno+": "+3+" "+5);
				break;
			case 24:
				System.out.println("Case "+caseno+": "+2+" "+5);
				break;
			case 25:
				System.out.println("Case "+caseno+": "+1+" "+5);
				break;
			default:
				break;
			}
			caseno++;
		}
	}
}
