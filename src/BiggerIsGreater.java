import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class BiggerIsGreater {
	private static char[] strArray;
	private static Map<Integer,Integer> minMapper= new HashMap<Integer,Integer>();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase=Integer.parseInt(in.nextLine());
		
		while(testcase--!=0){
			String str= in.nextLine();
			String lexicographi="no answer";;
			boolean flag=false;
			int i,j;
			strArray=str.toCharArray();
			for(i=str.length()-1;i>=0;i--){
				if(i==0){
					break;
				}
				for(j=i-1;j>=0;j--){
					if(strArray[i]>strArray[j]){
						flag=true;
						minMapper.put(i, j);
						break;
						
					}
				}
			
			}	
			int startPos=-1;
			int endpos=-1;
			for (Map.Entry<Integer, Integer> entry : minMapper.entrySet()){
				if(entry.getValue()>endpos||(entry.getValue()==endpos&&entry.getKey()>startPos)){
					endpos=entry.getValue();
					startPos=entry.getKey();
				}
			}
			
			if(flag){
				swap(startPos, endpos);
				Arrays.sort(strArray, endpos+1, str.length());
				lexicographi=new String(strArray);
				
			}
			
			System.out.println(lexicographi);
		}
	}

	private static void swap(int i, int j) {
		char temp=strArray[i];
		strArray[i]=strArray[j];
		strArray[j]=temp;
		minMapper.clear();
	}

}
