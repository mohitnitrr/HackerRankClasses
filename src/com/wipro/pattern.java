package com.wipro;

public class pattern {

	public static void main(String[] args) {
		int rows=4;
		
		trapeziumPatternPrint(rows);
	}

	private static void trapeziumPatternPrint(int rows) {
		int start= 1;
		int end = rows*(rows+1);
		for(int i=rows;i>0;i--){
			StringBuilder output = new StringBuilder();
			
			for(int k=0;k<rows-i;k++){
				output.append("-");
			}
			for(int j=0;j<i;j++){
				output.append(start);
				output.append("*");
				start++;
			}
			for(int j=i;j>0;j--){
				output.append(end-j+1);
				output.append("*");
			}
			end=end-i;
			int lastindex=output.lastIndexOf("*");
			output.replace(lastindex, lastindex+1, "");
			System.out.println(output.toString());
		}
		
	}
}
