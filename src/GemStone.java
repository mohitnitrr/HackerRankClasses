import java.util.HashMap;
import java.util.Scanner;


public class GemStone {
	
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.nextLine());
		String[] stones= new String[size];
		for(int i=0;i<size;i++){
			stones[i]=in.nextLine();
		}
		
		gemElement(stones);
	}

	private static void gemElement(String[] stones) {
		
	boolean[][] value=new boolean[stones.length][30];
	int index=0;
	boolean flag=true;
	int count=0;
	for(String s:stones){
		for(int i=0;i<s.length();i++){
			value[index][s.charAt(i)-'a']= true;
		}
		index++;
	}
	for(int j=0;j<26;j++){
		flag=true;
		for(int i=0;i<stones.length;i++){
			if(value[i][j]!=true)
			{
				flag=false;
				break;
				
			}
		}
		if (flag)
			count++;
	}		
	
	System.out.println(count);
	
}
				
		
	

}
