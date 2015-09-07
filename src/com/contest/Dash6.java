package com.contest;

import java.util.Scanner;

public class Dash6 {
   
	static void partition(int[] ar) {
		int pivot=ar[0];
       int [] smallerArr=new int[ar.length];
       int smallindex=0;
       int [] biggerArr =new int[ar.length];
       int largeindex=0;
       for(int i=1;i<ar.length;i++){
    	   if(ar[i]<pivot){
    		   smallerArr[smallindex]=ar[i];
    		   smallindex++;
    	   }
    	   else{
    		   biggerArr[largeindex]=ar[i];
    		   largeindex++;
    	   }
    	  
       }
       printArray(smallerArr,smallindex);
	   System.out.print(pivot+" ");
	   printArray(biggerArr,largeindex);
   }   

static void printArray(int[] ar,int index) {
     for(int i=0;i<index;i++){
        System.out.print(ar[i]+" ");
     }
  }
   
  public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] ar = new int[n];
       for(int i=0;i<n;i++){
          ar[i]=in.nextInt(); 
       }
       partition(ar);
   }   
}
