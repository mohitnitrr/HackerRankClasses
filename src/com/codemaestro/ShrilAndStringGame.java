package com.codemaestro;

import java.util.Scanner;

public class ShrilAndStringGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	//	List<Integer> indexList = new ArrayList<>();
		
		String input = in.next();
		int[] indexlist= new int[input.length()];
		
		int noGoodCharacter= in.nextInt();
		int j=0;
		for(int i=0;i<noGoodCharacter;i++){
			char c=in.next().charAt(0);
			int index=input.indexOf(c);
			while(index>=0){
				indexlist[j]=index+1; j++;
				index=input.indexOf(c, index +1 );
			}
		}
		
		int query = in.nextInt();
		for(int i=0;i<query;i++){
			int type= in.nextInt();
			int start=in.nextInt();
			int end = in.nextInt();
			
			switch (type) {
			case 1:
				//Arrays.sort(indexlist);
				int diff=end-start+1;
				boolean even=false;
				
				if(diff==1||diff==input.length())
					continue;
				
				if(diff%2==0)
					even= true;
				
					for(int k=0 ;k<indexlist.length;k++){
						
						int nextIndex=indexlist[k];
						
						if (nextIndex >=start && nextIndex <= end) {
							if (even) {
									double middle= start + diff/2 - 0.5;
									if(middle-nextIndex>0){
										nextIndex=(int)(nextIndex+2*(middle-nextIndex));
									}
									else{
										nextIndex=(int)(nextIndex-2*(nextIndex-middle));
									}
							} else {
								int middle=start+ diff/2 ;
								if(middle-nextIndex>=0){
									nextIndex=nextIndex+2*(middle-nextIndex);
								}
								else{
									nextIndex=nextIndex-2*(nextIndex-middle);
								}
							}
						}
						
						indexlist[k]=nextIndex;
					}
					
				break;
			case 2:
				int count = 0;
			
					for(int k=0 ;k<indexlist.length;k++){
						int index=indexlist[k];
						if(index>=start && index <=end ){
							count ++;
						}
				}
				
				System.out.println(count);
				break;
				
			default:
				break;
			}
		}
		
	}
}
