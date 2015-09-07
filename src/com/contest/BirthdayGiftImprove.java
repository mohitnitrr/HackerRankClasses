package com.contest;

import java.util.Scanner;

public class BirthdayGiftImprove {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		int caseno = 1;
		while (testcases-- != 0) {
			long value =in.nextLong();
			long i=1;
			while(true){
				if(i*i>value)
					break;
				i++;
			}
			long remaining=value-(i-1)*(i-1);
			long row=0;
			long col=0;
			if(remaining==0)
				if((i-1)%2==0){
					col=i-1;
					row=1;
				}
				else{
					col=1;
					row=i-1;
				}
			else{
				if(i%2==0){
					if(remaining<=(i-1)){
						col=remaining;
						row=i;
					}
					else if(remaining==i){
						col=i;
						row=i;
					}
					else if(remaining>i){
						col=i;
						row=remaining-i;
					}
						
				}
				else{
					if(remaining<=(i-1)){
						col=i;
						row=remaining;
					}
					else if(remaining==i){
						col=i;
						row=i;
					}
					else if(remaining>i){
						col=i-remaining+i;
						row=i;
					}
				}
			}
			System.out.println("Case "+caseno+": "+col+" "+row);
			caseno++;
		}
	}
}
