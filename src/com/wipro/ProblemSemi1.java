package com.wipro;

public class ProblemSemi1 {

	public static void main(String[] args) {
		int[] array ={2,2,1,1,1};
		admin_condition(array,4);
	}

	private static int admin_condition(int[] array, int i) {
		boolean[] condition = new boolean[array.length];
		condition[0]= true;
		
		for(int j =0;j<array.length;j++){
			int temp =array[j];
			if(j==0){
				if(temp-1>0){
					condition[j+1]= true;
				}
			}else{
				temp=temp-(condition[j-1]?1:0);
				temp=temp-(condition[j]?1:0);
				if(temp>0 && j<array.length){
					condition[j+1]= true;
				}
				else if(temp==-1){
					return -1;
				}
			}
		}
		return condition[i-1]?1:0;
	}
}
